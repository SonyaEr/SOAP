package ua.silentium.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ExitServlet", value = "/exit")
public class ExitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");

	HttpSession session = request.getSession();
	Enumeration eNames = session.getAttributeNames();
	while (eNames.hasMoreElements()) {
	  String attributeName = (String) eNames.nextElement();
	  session.removeAttribute(attributeName); 
	}
	
	response.sendRedirect(request.getContextPath() + "/index");
	
	
    }
}
