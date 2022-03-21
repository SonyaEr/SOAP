package ua.silentium.entity.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ua.silentium.entity.OrderDAO;
import ua.silentium.entity.TourDAO;
import ua.silentium.entity.vouchers.Order;
import ua.silentium.entity.vouchers.Tour;


@WebService(targetNamespace="http://silentium.ua", endpointInterface = "ua.silentium.entity.service.OrderWebServiceSEI", portName = "OrderServicePort", serviceName = "OrderService")
public class OrderService implements OrderWebServiceSEI{

    private static List <Order> orders;

    
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public Order[] findAllOrders() {
	return new OrderDAO().findAllOrders();
    }
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public Order[] findAllOrdersbyPerson(@WebParam(name = "idPerson") int idPerson) {
	return new OrderDAO().findAllOrdersbyPerson(idPerson);
    }
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public boolean addOrder(@WebParam(name = "order") Order order) {
	return new OrderDAO().addOrder(order);
    }
    
    
//    public Order getOrder(int id) {
//	for(Order t : orders){
//	    if (t.getId() == id){
//		return t;
//	    } 
//	}
//	return new Order();
  //  }
/*
    public boolean addOrder(Order order) {
        if (orders == null) {
            orders = new ArrayList<Order>();
        }
        orders.add(order);
	return true;
    }
    
    public Order[] findAllOrders(){
   	Order[] o = new Order[orders.size()];
   	orders.toArray(o);
   	return o;
   	}    
   	*/

    public boolean updateOrder(Order order) {
   	int id = order.getId();
   	for(Order t : orders){
   	    if (t.getId() == id){
                   t.updateOrder(order);
               	return true;
   	    } 
   	}
           return false;
       }
    public boolean deleteOrder(int id) {
        Iterator itr = orders.iterator();
        while (itr.hasNext()) {
            Order t = (Order)itr.next();
            if (t.getId() == id) {
                itr.remove();
            	return true;
            	}
        }
        return false;
    }
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public String[] findAllStatusOrder() {
	return new OrderDAO().findAllStatusOrder();
    }
    
    
    

}
