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
import ua.silentium.TourService;
import ua.silentium.entity.vouchers.Order;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;

@WebServlet(name = "ListOrdersServlet", value = "/listOrders")
public class ListOrdersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	HttpSession session = request.getSession();
	Person person = (Person) session.getAttribute("person");
	List<Order> orders = null;
	if (person == null) {
	    request.getRequestDispatcher("/index").forward(request, response);
	} else {
	    if (person.getRole().getRoleName().equals("user")) {
		orders = new OrderService().getOrderServicePort().findAllOrdersbyPerson(person.getId());
	    } else {
		orders = new OrderService().getOrderServicePort().findAllOrders();
	    }
	}
	    request.setAttribute("orders", orders);
	    request.setAttribute("person_role", person.getRole().getRoleName());
	    request.setAttribute("person_name", person.getName());
	    request.getRequestDispatcher("/listOrders.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String order_id = request.getParameter("order_id");

	HttpSession session = request.getSession();
	session.setAttribute("order_id", order_id);
	response.sendRedirect(request.getContextPath() + "/tour");
	// processRequest(request, response);
    }
}
