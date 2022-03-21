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
import ua.silentium.VoucherService;
import ua.silentium.entity.vouchers.Order;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Voucher;

@WebServlet(name = "ListVouchersServlet", value = "/listVouchers")
public class ListVouchersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	HttpSession session = request.getSession();
	Person person = (Person) session.getAttribute("person");
	List<Voucher> vouchers = null;
	if (person == null) {
	    request.getRequestDispatcher("/index").forward(request, response);
	} else {
	    if (person.getRole().getRoleName().equals("user")) {
		vouchers = new VoucherService().getVoucherServicePort().findAllVouchersbyPerson(person.getId());
	    } else {
		vouchers = new VoucherService().getVoucherServicePort().findAllVouchers();
	    }
	}
	    request.setAttribute("vouchers", vouchers);
	    request.setAttribute("person_role", person.getRole().getRoleName());
	    request.setAttribute("person_name", person.getName());
	    request.getRequestDispatcher("/listVouchers.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String voucher_id = request.getParameter("voucher_id");

	HttpSession session = request.getSession();
	session.setAttribute("voucher_id", voucher_id);
	response.sendRedirect(request.getContextPath() + "/updateStatusVoucher");
	// processRequest(request, response);
    }
}