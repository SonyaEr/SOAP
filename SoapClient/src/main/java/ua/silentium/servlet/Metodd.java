package ua.silentium.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/m")
public class Metodd extends HttpServlet{

    private String responseTemplate = "<html>\n" + "<body>\n" + "<h2>Hello from Simple Servlet</h2>\n" + "</body>\n"
	    + "</html>";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	this.process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	this.process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
	response.setStatus(200);
	response.getWriter().write(responseTemplate);
    }
}
