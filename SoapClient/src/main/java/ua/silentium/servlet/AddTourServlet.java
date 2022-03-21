package ua.silentium.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.silentium.Path;
import ua.silentium.TourService;
import ua.silentium.TourServiceData;
import ua.silentium.TourWebServiceSEI;
import ua.silentium.entity.Test;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TypeFood;
import ua.silentium.entity.vouchers.TypeTour;
import ua.silentium.entity.vouchers.TypeTransport;

import javax.servlet.annotation.WebServlet;
import ua.silentium.TourService;

@WebServlet(name = "AddTourServlet", value = "/addTour")
public class AddTourServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	List<String> typeFoods = new TourService().getTourServicePort().findAllTypeFood();
	request.setCharacterEncoding("UTF-8");
	List<String> typeTransports = new TourService().getTourServicePort().findAllTypeTransport();
	List<String> typeTours = new TourService().getTourServicePort().findAllTypeTour();
	// ArrayList<String> type_food = new ArrayList<>( Arrays.asList("All inclusive",
	// "Breakfast", "Breakfast and dinner"));
	request.setAttribute("type_food", typeFoods);
	request.setAttribute("type_transport", typeTransports);
	request.setAttribute("type_tour", typeTours);
	request.getRequestDispatcher("/addTour.jsp").forward(request, response);

//	processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("tour_name");
	String description = request.getParameter("tour_description");
	String quantityNight = request.getParameter("quantity_night");
	String tourOperator = request.getParameter("tour_operator");
	String typeFood = request.getParameter("type_food");
	String typeTransport = request.getParameter("type_transport");
	String typeTour = request.getParameter("type_tour");

	TourWebServiceSEI port = new TourService().getTourServicePort();

	Tour new_tour = new Tour(name, description, Integer.parseInt(quantityNight), tourOperator, typeFood,
		typeTransport, typeTour);
	boolean result_add = port.addTour(new_tour);
	response.sendRedirect(request.getContextPath() + "/editTour");
	// processRequest(request, response);
    }
}
