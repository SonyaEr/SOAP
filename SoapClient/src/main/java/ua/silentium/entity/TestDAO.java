package ua.silentium.entity;

import java.text.ParseException;
import java.util.List;

import ua.silentium.OrderService;
import ua.silentium.OrderWebServiceSEI;
import ua.silentium.PersonService;
import ua.silentium.PersonWebServiceSEI;
import ua.silentium.TourService;
import ua.silentium.TourWebServiceSEI;
import ua.silentium.VoucherService;
import ua.silentium.VoucherWebServiceSEI;
import ua.silentium.entity.vouchers.Order;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;
import ua.silentium.entity.vouchers.TypeFood;
import ua.silentium.entity.vouchers.Voucher;

public class TestDAO {

    public static void main(String[] args) throws ParseException {

	//TourWebServiceSEI port = new TourService().getTourServicePort();
	// PersonWebServiceSEI port_person = new PersonService().getPersonServicePort();
	//OrderWebServiceSEI port_order = new OrderService().getOrderServicePort();
	VoucherWebServiceSEI port_voucher = new VoucherService().getVoucherServicePort();
//	System.out.println("Add tours:");
//	Tour new_tour = new Tour("France", "Bavarian Highlights with Oberammergau", 6, "Flyair", "Breakfast and dinner", "Airpale", "Excursion");
//	boolean result_add = port.addTour(new_tour);
//	System.out.println("add tour - " + ((result_add)  ?  "Tour exists" : "Tour added successfully" ));

//	System.out.println("Find all tours:");
//	List<Tour> result_add = port.findAllTours();
//	System.out.println("fine tours - " + result_add);

	// System.out.println("Get tourdates:");
	// List<TourDate> result = port.getTourDatesByTourId(1);
	// System.out.println("get tour=1 - " + result);

	// System.out.println("Find all orders:");
	// List<Order> result_add = port_order.findAllOrders();
	// System.out.println("Find orders - " + result_add);

//System.out.println("Get tours:");
	// System.out.println("get tour id=1 - " + port.getTour(1));

//	System.out.println("Add persons:");
//	Person new_person = new Person("admin", "Eroshenko", "admin@gmail.com", "1234");
//	boolean result_add = port_person.addPerson(new_person);
//	System.out.println("add person - " + ((result_add)  ? "Person exists" : "Person added successfully"));

//	System.out.println("Add order:");
//	Order order= new Order(2, 2, 2);
//	boolean result_add = port_order.addOrder(order);
//	System.out.println("add order - " + result_add);

	System.out.println("Find all vouchers:");
	List<Voucher> result_add = port_voucher.findAllVouchersbyPerson(3);
	System.out.println("Find vouchers - " + result_add);

    }

}
