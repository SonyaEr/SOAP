package ua.silentium.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.silentium.TourServiceData;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;

@WebServlet(name = "EditTourDatesServlet", value = "/editTourDates")
public class EditTourDatesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String tour_id = request.getParameter("tour_id");
	Tour tour = TourServiceData.getWorker().getTour(Integer.parseInt(tour_id));
	List<TourDate> tourdates = TourServiceData.getWorker().getTourDatesByTourId(Integer.parseInt(tour_id));
	request.setAttribute("tour", tour);
	request.setAttribute("tourdates", tourdates);
	HttpSession session = request.getSession();
	Person person = (Person) session.getAttribute("person");
	if (person == null) {
	    request.setAttribute("person_role", "none");
	} else {
	    request.setAttribute("person_role", person.getRole().getRoleName());
	    request.setAttribute("person_name", person.getName());
	}
	request.getRequestDispatcher("/editTourDates.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String tour_date_id = request.getParameter("tour_date_id");
	String mode = request.getParameter("mode");

	HttpSession session = request.getSession();
	session.setAttribute("tour_date_id", tour_date_id);
	session.setAttribute("mode", mode);

	if (mode.equals("update")) {
	    response.sendRedirect(request.getContextPath() + "/updateTourDates");

	} else
	    response.sendRedirect(request.getContextPath() + "/deleteTourDates");
    }
}