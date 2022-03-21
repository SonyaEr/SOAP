package ua.silentium.entity.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;

import ua.silentium.entity.TourDAO;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService (targetNamespace="http://silentium.ua")
public interface TourWebServiceSEI {

    @WebMethod
    Tour[] findAllTours();
    @WebMethod
    String[] findAllTypeFood();
    @WebMethod
    String[] findAllTypeTransport();
    @WebMethod
    String[] findAllTypeTour();
    
    @WebMethod
    boolean addTour(@WebParam(name = "tour") Tour tour);

   @WebMethod
   Tour getTour(@WebParam(name = "idTour") int idTour);
    
    @WebMethod
    boolean deleteTour(@WebParam(name = "idTour") int idTour);
    
    @WebMethod
    boolean updateTour(@WebParam(name = "tour") Tour tour);
    
    @WebMethod
    boolean addTourDate(@WebParam(name = "tourdate") TourDate tourdate);

    @WebMethod
    TourDate[] findAllTourDates();
    
    @WebMethod
    boolean deleteTourDate(@WebParam(name = "idTourDate") int idTourDate);
    
    @WebMethod
    TourDate[] getTourDatesByTourId(@WebParam(name = "idTour") int idTour);
    
    @WebMethod
    boolean updateTourDate(@WebParam(name = "tourdate") TourDate tourdate);

    @WebMethod
    Tour[] findToursByName(@WebParam(name = "tourName") String tourName);

    @WebMethod
    String TourServiceImpl();
   
}
