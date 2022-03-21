
package ua.silentium;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ua.silentium.entity.vouchers.Order;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrderWebServiceSEI", targetNamespace = "http://silentium.ua")
@XmlSeeAlso({
    ua.silentium.ObjectFactory.class,
    ua.silentium.entity.ObjectFactory.class,
    ua.silentium.entity.vouchers.ObjectFactory.class
})
public interface OrderWebServiceSEI {


    /**
     * 
     * @param idPerson
     * @return
     *     returns java.util.List<ua.silentium.entity.vouchers.Order>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllOrdersbyPerson", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllOrdersbyPerson")
    @ResponseWrapper(localName = "findAllOrdersbyPersonResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllOrdersbyPersonResponse")
    public List<Order> findAllOrdersbyPerson(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @return
     *     returns java.util.List<ua.silentium.entity.vouchers.Order>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllOrders", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllOrders")
    @ResponseWrapper(localName = "findAllOrdersResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllOrdersResponse")
    public List<Order> findAllOrders();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllStatusOrder", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllStatusOrder")
    @ResponseWrapper(localName = "findAllStatusOrderResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.FindAllStatusOrderResponse")
    public List<String> findAllStatusOrder();

    /**
     * 
     * @param order
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateOrder", targetNamespace = "http://silentium.ua", className = "ua.silentium.UpdateOrder")
    @ResponseWrapper(localName = "updateOrderResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.UpdateOrderResponse")
    public boolean updateOrder(
        @WebParam(name = "order", targetNamespace = "")
        Order order);

    /**
     * 
     * @param order
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addOrder", targetNamespace = "http://silentium.ua", className = "ua.silentium.AddOrder")
    @ResponseWrapper(localName = "addOrderResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.AddOrderResponse")
    public boolean addOrder(
        @WebParam(name = "order", targetNamespace = "")
        Order order);

    /**
     * 
     * @param idOrder
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteOrder", targetNamespace = "http://silentium.ua", className = "ua.silentium.DeleteOrder")
    @ResponseWrapper(localName = "deleteOrderResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.DeleteOrderResponse")
    public boolean deleteOrder(
        @WebParam(name = "idOrder", targetNamespace = "")
        int idOrder);

}
