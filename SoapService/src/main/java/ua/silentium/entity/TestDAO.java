package ua.silentium.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ua.silentium.entity.service.OrderService;
import ua.silentium.entity.service.PersonService;
import ua.silentium.entity.service.TourService;
import ua.silentium.entity.vouchers.Order;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;
import ua.silentium.entity.vouchers.TypeFood;

public class TestDAO {

    public static void main(String[] args) throws ParseException {

	TourService port = new TourService();
	PersonService port_person = new PersonService();
	OrderService port_order = new OrderService();
//	System.out.println("Add tours:");
//	Tour new_tour = new Tour("France", "Bavarian Highlights with Oberammergau", 5, "Flyair", "Breakfast and dinner", "Airpale", "Excursion");
//	boolean result_add = port.addTour(new_tour);
//	System.out.println("add tour - " + ((result_add)  ? "Tour added successfully" : "Tour exists"));
//	System.out.println("Update tour:");
//	Tour update = new Tour(7, "France", "Bavarian Highlights with Oberammergau6", 5, "Flyair", "Breakfast and dinner", "Airpale", "Excursion");
//	boolean result_add1 = port.updateTour(update);
//	System.out.println("update tour - " + result_add1); 

//	System.out.println("Get tours:");
//	System.out.println("get tour id=1 - " + port.getTour(1));
	
/*	System.out.println("Add tourdate:");
	Date date = new Date (2021-11-21);
	BigDecimal decimal = new BigDecimal("100");
	TourDate new_tourdate = new TourDate(date, decimal, "ToueDate name", 1);
	boolean result_add_tourdate = port.addTourDate(new_tourdate);
	System.out.println("add tourdate - " + result_add_tourdate); 
*/
	
	// System.out.println("Get tourdates:");
	//TourDate [] result = port.getTourDatesByTourId(1);
	// System.out.println("get tourdates by tour id=1 - " + result.toString());
	
//	System.out.println("Add persons:");
//	Person new_person = new Person("Sonya", "Er", "sonya@gmail.com", "1234");
//	boolean result_add = port_person.addPerson(new_person);
//	System.out.println("add person - " + ((result_add)  ? "Person exists" : "Person added successfully"));
//	
//	boolean result_delete = port.deleteTour(4);
//	System.out.println("delete tour - " + result_delete); 
	
	// System.out.println("Find All orders:");
	//Order [] result_1 = port_order.findAllOrdersbyPerson(3);
     //   System.out.println("find all order - " + result_1.toString());
        
        System.out.println("Add order:");
	Order order= new Order(1, 1, 1);
	boolean result_add = port_order.addOrder(order);
	System.out.println("add order - " + ((result_add)  ? "Tour added successfully" : "Tour exists"));
    }

}
