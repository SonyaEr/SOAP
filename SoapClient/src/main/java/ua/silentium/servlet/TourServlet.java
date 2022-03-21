package ua.silentium.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.silentium.OrderService;
import ua.silentium.OrderWebServiceSEI;
import ua.silentium.TourService;
import ua.silentium.TourServiceData;
import ua.silentium.TourWebServiceSEI;
import ua.silentium.entity.vouchers.Order;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;

@WebServlet(name = "TourServlet", value = "/tour")
public class TourServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String tour_id = request.getParameter("tour_id");
	Tour tour = TourServiceData.getWorker().getTour(Integer.parseInt(tour_id));
	List<TourDate> tourdates = TourServiceData.getWorker().getTourDatesByTourId(Integer.parseInt(tour_id));
	request.setAttribute("count", 1);
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
	request.getRequestDispatcher("/tour.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	HttpSession session = request.getSession();
	Person person = (Person) session.getAttribute("person");
	int person_id = person.getId();
	int tour_date_id = Integer.parseInt(request.getParameter("tour_date_id"));
	int tour_date_count = Integer.parseInt(request.getParameter("tour_date_count"));
	OrderWebServiceSEI port = new OrderService().getOrderServicePort();
	Order new_order = new Order((int) tour_date_count, (int) person_id, (int) tour_date_id);
	boolean result_add = port.addOrder(new_order);
	if (person==null) { request.getRequestDispatcher("/login").forward(request, response);
	} else {
	    if (result_add == true) {
		request.getRequestDispatcher("/listOrder").forward(request, response);
	    } else {
		request.getRequestDispatcher("/tour").forward(request, response);
	    }
	}
    }
}
