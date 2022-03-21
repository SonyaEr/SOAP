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
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;

@WebServlet(name = "ListToursServlet", value = "/index")
public class ListToursServlet extends HttpServlet {
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
	request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String tour_id = request.getParameter("tour_id");

	HttpSession session = request.getSession();
	session.setAttribute("tour_id", tour_id);
	response.sendRedirect(request.getContextPath() + "/tour");
	// processRequest(request, response);
    }
}
