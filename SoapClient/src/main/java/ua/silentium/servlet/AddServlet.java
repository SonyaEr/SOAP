package ua.silentium.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.silentium.Path;
import ua.silentium.TourService;
import ua.silentium.TourWebServiceSEI;
import ua.silentium.entity.Test;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TypeFood;
import ua.silentium.entity.vouchers.TypeTour;
import ua.silentium.entity.vouchers.TypeTransport;

import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  {
    String command = request.getParameter("command");
    if ("redirect".equals(command)) {
        RequestDispatcher disp = request.getRequestDispatcher(Path.ADD);
        disp.forward(request, response);
    } else if ("add".equals(command)) {
        Tour tour = inputData(request);
       
        
        response.sendRedirect("/index");
    }   
}

    private Tour inputData(HttpServletRequest request) {
	// TODO Auto-generated method stub
	TypeFood typefood= new TypeFood(1,"Breakfast");
	TypeTransport typetransport= new TypeTransport(1,"Bus");
	TypeTour typetour= new TypeTour(1,"Excursion");
	
	Tour tour = new Tour();
	tour.setId(new Integer(request.getParameter("id")));
	tour.setTourName(request.getParameter("name"));
	tour.setTourDescription(request.getParameter("description"));
	tour.setQuantityNight(new Integer(request.getParameter("quantityNight")));
	tour.setTypeFood(typefood);
	tour.setTypeTransport(typetransport);
	tour.setTypeTour(typetour);
        return tour;
    }
}
