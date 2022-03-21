package ua.silentium.entity.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ua.silentium.entity.TourDAO;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;

@SuppressWarnings("unused")
@WebService(targetNamespace = "http://silentium.ua", endpointInterface = "ua.silentium.entity.service.TourWebServiceSEI", serviceName = "TourService")
public class TourService implements TourWebServiceSEI {

    TourDAO tourdao;

    private static List<Tour> tours;
    private static List<TourDate> tourdates;

    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public Tour[] findAllTours() {
	return new TourDAO().findAllTours();
    }
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public String[] findAllTypeFood() {
	return new TourDAO().findAllTypeFood();
    }
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public String[] findAllTypeTransport() {
	return new TourDAO().findAllTypeTransport();
    }
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public String[] findAllTypeTour() {
	return new TourDAO().findAllTypeTour();
    }
   

    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public boolean addTour(@WebParam(name = "Tour") Tour tour) {
	return new TourDAO().addTour(tour);
    }
    
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public boolean updateTour(@WebParam(name = "Tour") Tour tour) {
	return new TourDAO().updateTour(tour);
    }

    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public Tour getTour(@WebParam(name = "idTour") int idTour) {
	return new TourDAO().getTour(idTour);

    }
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public TourDate[] getTourDatesByTourId(@WebParam(name = "idTour") int idTour) {
	return new TourDAO().getTourDatesByTourId(idTour);

    }
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public boolean addTourDate(@WebParam(name = "TourDate") TourDate tourDate) {
	return new TourDAO().addTourDate(tourDate);
    }
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public boolean deleteTour(@WebParam(name = "idTour") int idTour) {
	return new TourDAO().deleteTour(idTour);
    }
    
    /*
    public boolean deleteTour(int id) {
	Iterator itr = tours.iterator();
	while (itr.hasNext()) {
	    Tour t = (Tour) itr.next();
	    if (t.getId() == id) {
		itr.remove();
		Iterator itr1 = tourdates.iterator();
		while (itr1.hasNext()) {
		    TourDate td = (TourDate) itr1.next();
		    if (td.getTour().getId() == id)
			itr1.remove();
		}
		return true;
	    }
	}
	return false;
    }
    */
    /*
    public boolean updateTour(Tour tour) {
	int id = tour.getId();
	for (Tour t : tours) {
	    if (t.getId() == id) {
		t.updateTour(tour);
		return true;
	    }
	}
	return false;
    }
    */

   public TourDate[] findAllTourDates() {
	TourDate[] t = new TourDate[tourdates.size()];
	tourdates.toArray(t);
	return t;
    }
  

 
    public boolean deleteTourDate(int id) {
	Iterator itr = tourdates.iterator();
	while (itr.hasNext()) {
	    TourDate t = (TourDate) itr.next();
	    if (t.getId() == id) {
		itr.remove();
		return true;
	    }
	}
	return false;
    }

    

    public boolean updateTourDate(TourDate tourdate) {
	int id = tourdate.getId();
	for (TourDate t : tourdates) {
	    if (t.getId() == id) {
		t.updateTourDate(tourdate);
		return true;
	    }
	}
	return false;
    }

    public Tour[] findToursByName(String tourName) {
	List<Tour> find_tours = new ArrayList<Tour>();
	for (Tour t : tours) {
	    if (t.getTourName().equals(tourName)) {
		find_tours.add(t);
	    }
	}
	Tour[] t = new Tour[find_tours.size()];
	find_tours.toArray(t);
	return t;
    }

    @Override
    public String TourServiceImpl() {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * public Tour getTour(int id) { for(Tour t : tours){ if (t.getId() == id){
     * return t; } } return new Tour(); }
     */


    // }

    /*
     * public Tour[] findAllTours(){ Tour[] t= new Tour[tours.size()];
     * tours.toArray(t); return t; }
     */
    
    /*
    public boolean addTourDate(TourDate tourdate) {
	if (tourdates == null) {
	    tourdates = new ArrayList<TourDate>();
	}
	tourdates.add(tourdate);
	return true;
    }
*/
    /* 
    public TourDate[] getTourDatesByTour(Tour tour) {
	int id_tour = tour.getId();
	List<TourDate> find_tourDates = new ArrayList<TourDate>();
	for (TourDate t : tourdates) {
	    if (t.getTour().getId() == id_tour) {
		find_tourDates.add(t);
	    }
	}
	TourDate[] t = new TourDate[find_tourDates.size()];
	find_tourDates.toArray(t);
	return t;
    }
      */

}
