package ua.silentium.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ua.silentium.TourService;
import ua.silentium.TourServiceData;
import ua.silentium.TourWebServiceSEI;
import ua.silentium.entity.vouchers.Tour;

@WebServlet(name = "UpdateTourServlet", value = "/updateTour")
public class UpdateTourServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	List<String> typeFoods = new TourService().getTourServicePort().findAllTypeFood();
	List<String> typeTransports = new TourService().getTourServicePort().findAllTypeTransport();
	List<String> typeTours = new TourService().getTourServicePort().findAllTypeTour();
	HttpSession session = request.getSession();
	String tour_id = (String) session.getAttribute("tour_id");
	Tour tour = new TourService().getTourServicePort().getTour(Integer.parseInt(tour_id));
	request.setAttribute("tour", tour);
	request.setAttribute("type_food", typeFoods);
	request.setAttribute("type_transport", typeTransports);
	request.setAttribute("type_tour", typeTours);
	request.getRequestDispatcher("updateTour.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");

	HttpSession session = request.getSession();
	String tour_id = (String) session.getAttribute("tour_id");
	String name = request.getParameter("tour_name");
	String description = request.getParameter("tour_description");
	String quantityNight = request.getParameter("quantity_night");
	String tourOperator = request.getParameter("tour_operator");
	String typeFood = request.getParameter("type_food");
	String typeTransport = request.getParameter("type_transport");
	String typeTour = request.getParameter("type_tour");

	TourWebServiceSEI port = new TourService().getTourServicePort();

	Tour new_tour = new Tour(Integer.parseInt(tour_id), name, description, Integer.parseInt(quantityNight),
		tourOperator, typeFood, typeTransport, typeTour);

	boolean result_update = port.updateTour(new_tour);
	session.setAttribute("tour_id", "");
	session.setAttribute("mode", "");
	response.sendRedirect(request.getContextPath() + "/editTour");
	// response.sendRedirect(request.getContextPath() +
	// "${pageContext.servletContext.contextPath}/editTour/updateTour?updateId=" +
	// tour_id);
	// processRequest(request, response);
    }
}
