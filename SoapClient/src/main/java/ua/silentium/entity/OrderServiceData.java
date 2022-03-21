package ua.silentium.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ua.silentium.OrderService;
import ua.silentium.OrderWebServiceSEI;
import ua.silentium.entity.vouchers.Order;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;

public class OrderServiceData {
    private static OrderWebServiceSEI orderService;

    public static OrderWebServiceSEI getWorker() {
        return orderService;
    }

    static {
        OrderService service = new OrderService();
        orderService = service.getOrderServicePort();
        List<Order> data = null;
        try {
            data = loadData();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        if (!Objects.isNull(data) && orderService.findAllOrders().size() == 0) {
            for (int i = 0; i < data.size(); i++) {
        	orderService.addOrder(data.get(i));
            }
        }
    }

    private static List<Order> loadData() throws DatatypeConfigurationException {
        List<Order> data = new ArrayList<>();
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar("2021-12-16");
        Person person = new Person();
        TourDate tourDate = new TourDate();
        data.add(new Order(1, tourDate, person, date, "Waiting for"));
        data.add(new Order(2, tourDate, person, date, "Waiting for"));
        data.add(new Order(3, tourDate, person, date, "Waiting for"));
        data.add(new Order(4, tourDate, person, date, "Waiting for"));
        return data;
    }

}
