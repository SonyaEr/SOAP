package ua.silentium.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.silentium.PersonService;
import ua.silentium.PersonWebServiceSEI;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Role;

@WebServlet(name = "RegistrationServlet", value = "/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	request.getRequestDispatcher("/registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String surname = request.getParameter("surname");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	PersonWebServiceSEI port = new PersonService().getPersonServicePort();

	Person person = new Person(name, surname, email, password);
	boolean result_add = port.addPerson(person);
	if(result_add==true) {
	response.sendRedirect(request.getContextPath() + "/index");}
	else response.sendRedirect(request.getContextPath() + "/registration");
	// processRequest(request, response);
    }
}
