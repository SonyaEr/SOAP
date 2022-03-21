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
import ua.silentium.TourWebServiceSEI;
import ua.silentium.entity.vouchers.Tour;

@WebServlet(name = "DeleteTourServlet", value = "/deleteTour")
public class DeleteTourServlet extends HttpServlet {
  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	HttpSession session = request.getSession();
	String tour_id = (String) session.getAttribute("tour_id");
	Tour tour =  new TourService().getTourServicePort().getTour(Integer.parseInt(tour_id));
	request.setAttribute("tour", tour);
	request.setCharacterEncoding("UTF-8");
	request.getRequestDispatcher("/deleteTour.jsp").forward(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	
	String tour_id = request.getParameter("tour_id");
	String mode = request.getParameter("mode");

	if (mode.equals("delete")) {
	    TourWebServiceSEI port = new TourService().getTourServicePort();
	    boolean result_delete = port.deleteTour(Integer.parseInt(tour_id));
	    response.sendRedirect(request.getContextPath() + "/editTour");
	}
	else {
	    response.sendRedirect(request.getContextPath() + "/editTour");    
	}
    }
}
