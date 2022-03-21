package ua.silentium.entity.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ua.silentium.entity.vouchers.Order;

@WebService(targetNamespace = "http://silentium.ua")
public interface OrderWebServiceSEI {

    // @WebMethod
    // Order getOrder(@WebParam(name = "idOrder") int idOrder);

    @WebMethod
    boolean addOrder(@WebParam(name = "order") Order order);

    @WebMethod
    boolean deleteOrder(@WebParam(name = "idOrder") int idOrder);

    @WebMethod
    Order[] findAllOrdersbyPerson(@WebParam(name = "idPerson") int idPerson);

    @WebMethod
    Order[] findAllOrders();

    @WebMethod
    boolean updateOrder(@WebParam(name = "order") Order order);

    @WebMethod
    String[] findAllStatusOrder();

}
