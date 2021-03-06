
package ua.silentium;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.3.2 Generated source
 * version: 2.2
 * 
 */
@WebService(name = "TourWebServiceSEI", targetNamespace = "http://silentium.ua")
@XmlSeeAlso({ ua.silentium.ObjectFactory.class, ua.silentium.entity.ObjectFactory.class,
	ua.silentium.entity.vouchers.ObjectFactory.class })
public interface TourWebServiceSEI {

    /**
     * 
     * @param tour
     * @return returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addTour", targetNamespace = "http://silentium.ua", className = "ua.silentium.AddTour")
    @ResponseWrapper(localName = "addTourResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.AddTourResponse")
    public boolean addTour(@WebParam(name = "tour", targetNamespace = "") Tour tour);

    /**
     * 
     * @param tourdate
     * @return returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addTourDate", targetNamespace = "http://silentium.ua", className = "ua.silentium.AddTourDate")
    @ResponseWrapper(localName = "addTourDateResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.AddTourDateResponse")
    public boolean addTourDate(@WebParam(name = "tourdate", targetNamespace = "") TourDate tourdate);

    /**
     * 
     * @param idTourDate
     * @return returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteTourDate", targetNamespace = "http://silentium.ua", className = "ua.silentium.DeleteTourDate")
    @ResponseWrapper(localName = "deleteTourDateResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.DeleteTourDateResponse")
    public boolean deleteTourDate(@WebParam(name = "idTourDate", targetNamespace = "") int idTourDate);

    /**
     * 
     * @param tourName
     * @return returns java.util.List<ua.silentium.entity.vouchers.Tour>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findToursByName", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindToursByName")
    @ResponseWrapper(localName = "findToursByNameResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindToursByNameResponse")
    public List<Tour> findToursByName(@WebParam(name = "tourName", targetNamespace = "") String tourName);

    /**
     * 
     * @return returns java.util.List<ua.silentium.entity.vouchers.Tour>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllTours", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllTours")
    @ResponseWrapper(localName = "findAllToursResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllToursResponse")
    public List<Tour> findAllTours();

    /**
     * 
     * @return returns java.util.List<ua.silentium.entity.vouchers.TypeFood>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllTypeFood", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllTypeFood")
    @ResponseWrapper(localName = "findAllTypeFoodResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllTypeFoodResponse")
    public List<String> findAllTypeFood();

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllTypeTransport", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllTypeTransport")
    @ResponseWrapper(localName = "findAllTypeTransportResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllTypeTransportResponse")
    public List<String> findAllTypeTransport();

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllTypeTour", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllTypeTour")
    @ResponseWrapper(localName = "findAllTypeTourResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllTypeTourResponse")
    public List<String> findAllTypeTour();

   

    /**
     * 
     * @param tour
     * @return returns java.util.List<ua.silentium.entity.vouchers.TourDate>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTourDatesByTourId", targetNamespace = "http://silentium.ua", className = "ua.silentium.GetTourDatesByTourId")
    @ResponseWrapper(localName = "getTourDatesByTourIdResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.GetTourDatesByTourIdResponse")
    public List<TourDate> getTourDatesByTourId( @WebParam(name = "idTour", targetNamespace = "") int idTour);

    /**
     * 
     * @param tour
     * @return returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateTour", targetNamespace = "http://silentium.ua", className = "ua.silentium.UpdateTour")
    @ResponseWrapper(localName = "updateTourResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.UpdateTourResponse")
    public boolean updateTour(@WebParam(name = "tour", targetNamespace = "") Tour tour);

    /**
     * 
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "TourServiceImpl")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "TourServiceImpl", targetNamespace = "http://silentium.ua", className = "ua.silentium.TourServiceImpl")
    @ResponseWrapper(localName = "TourServiceImplResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.TourServiceImplResponse")
    public String tourServiceImpl();

    /**
     * 
     * @return returns java.util.List<ua.silentium.entity.vouchers.TourDate>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllTourDates", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllTourDates")
    @ResponseWrapper(localName = "findAllTourDatesResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllTourDatesResponse")
    public List<TourDate> findAllTourDates();

    /**
     * 
     * @param idTour
     * @return returns ua.silentium.entity.vouchers.Tour
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTour", targetNamespace = "http://silentium.ua", className = "ua.silentium.GetTour")
    @ResponseWrapper(localName = "getTourResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.GetTourResponse")
    public Tour getTour(@WebParam(name = "idTour", targetNamespace = "") int idTour);

    /**
     * 
     * @param tourdate
     * @return returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateTourDate", targetNamespace = "http://silentium.ua", className = "ua.silentium.UpdateTourDate")
    @ResponseWrapper(localName = "updateTourDateResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.UpdateTourDateResponse")
    public boolean updateTourDate(@WebParam(name = "tourdate", targetNamespace = "") TourDate tourdate);

    /**
     * 
     * @param idTour
     * @return returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteTour", targetNamespace = "http://silentium.ua", className = "ua.silentium.DeleteTour")
    @ResponseWrapper(localName = "deleteTourResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.DeleteTourResponse")
    public boolean deleteTour(@WebParam(name = "idTour", targetNamespace = "") int idTour);

}
