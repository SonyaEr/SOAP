package ua.silentium.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ua.silentium.TourService;
import ua.silentium.TourServiceData;
import ua.silentium.TourWebServiceSEI;
import ua.silentium.entity.vouchers.Order;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;

@WebServlet(name = "AddOrderServlet", value = "/addOrder")
public class AddOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String tour_date_id = request.getParameter("tour_date_id");
	String person_id = request.getParameter("person_id");
	// tourdate = TourServiceData.getWorker().getTourDate(Integer.parseInt(tour_date_id));
	// Person person = TourServiceData.getWorker().getPerson(Integer.parseInt(person_id));
//	List<String> statusorder = new OrderService().getTourServicePort().findAllStatusOrder();
	// request.setAttribute("tourdate", tourdate);
	// request.setAttribute("person", person);
//	request.setAttribute("status_order", statusorder);
//	request.getRequestDispatcher("/addTour.jsp").forward(request, response);

	// request.setAttribute("tourdate", tourdate);
	// request.setAttribute("person", person);
	request.getRequestDispatcher("/addOrder.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	/*
	 * XMLGregorianCalendar date_arrival = null;
	 *  try { String FORMATER =
	 * "yyyy-MM-dd"; DateFormat format = new SimpleDateFormat(FORMATER); Date date =
	 * new Date(); date_arrival =
	 * DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date)); }
	 * catch (DatatypeConfigurationException e) { e.printStackTrace(); } BigDecimal
	 * price = request.getParameter("price"); String name =
	 * request.getParameter("name");
	 */
	String count = request.getParameter("count");
	String status_order = request.getParameter("status_order_name");
//	String order_date
	TourDate tourDate = new TourDate();
	Person person = new Person();

	TourWebServiceSEI port = new TourService().getTourServicePort();

	// Order order = new Order(Integer.parseInt(count), order_date, order_update_date, person, status_order, tourDate);
	//boolean result_add = port.addOrder(order);
	response.sendRedirect(request.getContextPath() + "/listOrder");

    }
}
