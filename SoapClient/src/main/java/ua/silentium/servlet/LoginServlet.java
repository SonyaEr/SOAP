package ua.silentium.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.silentium.PersonService;
import ua.silentium.PersonWebServiceSEI;
import ua.silentium.entity.vouchers.Person;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	request.getRequestDispatcher("/login.jsp").forward(request, response);
//	processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	PersonWebServiceSEI port = new PersonService().getPersonServicePort();
	Person person = port.checkPerson(email, password);
	if (person == null) {
	    response.sendRedirect(request.getContextPath() + "/login");
	} else {
	    HttpSession session = request.getSession();
	    session.setAttribute("person", person);
	    response.sendRedirect(request.getContextPath() + "/index");
	}
    }
}
