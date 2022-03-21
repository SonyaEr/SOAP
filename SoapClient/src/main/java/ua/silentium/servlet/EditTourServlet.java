package ua.silentium.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.silentium.TourService;
import ua.silentium.TourWebServiceSEI;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;

@WebServlet(name = "EditTourServlet", value = "/editTour")
public class EditTourServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	List<Tour> tours = new TourService().getTourServicePort().findAllTours();
	request.setCharacterEncoding("UTF-8");
	request.setAttribute("tours", tours);
	HttpSession session = request.getSession();
	Person person = (Person) session.getAttribute("person");
	if (person == null) {
	    request.setAttribute("person_role", "none");
	} else {
	    request.setAttribute("person_role", person.getRole().getRoleName());
	    request.setAttribute("person_name", person.getName());
	}
	request.getRequestDispatcher("/editTour.jsp").forward(request, response);
//	processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String tour_id = request.getParameter("tour_id");
	String mode = request.getParameter("mode");

	HttpSession session = request.getSession();
	session.setAttribute("tour_id", tour_id);
	session.setAttribute("mode", mode);

	if (mode.equals("update")) {
	    response.sendRedirect(request.getContextPath() + "/updateTour");
	 
	} else if (mode.equals("delete")){
	    response.sendRedirect(request.getContextPath() + "/deleteTour");
	}
	else response.sendRedirect(request.getContextPath() + "/editTourDates");
    }

}
