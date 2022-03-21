package ua.silentium.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ua.silentium.entity.vouchers.Order;

public class OrderDAO {

    static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/tour_agency?serverTimezone=UTC";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "12345";

    private static Connection con = null;
    Statement statement;
    private static String add_order = "INSERT INTO tour_agency.order(order_id, count, order_date, order_update_date, fk_client_id, fk_tour_date_id, fk_status_order_id) VALUES(?,?,?,?,?,?,?)";
    private static String delete_order = "DELETE FROM tour_agency.order where order_id = ?";
    private static String update_status_in_order_by_id = "UPDATE tour_agency.order SET fk_status_order_id = ? where order_id =?";
    private static String get_all_order = "SELECT * FROM tour_agency.order;";
    private static String get_all_order_by_person = "SELECT * FROM tour_agency.order where fk_client_id=? ;";

    private static String get_all_status_order = "SELECT * FROM tour_agency.status_order;";
    private static String get_status_order_by_id = "SELECT * FROM tour_agency.status_order where status_order_id=? limit 1";
    private static String get_status_order_id_name = "SELECT status_order_id FROM tour_agency.status_order where name =? limit 1";
    private static String get_all_statusvoucher = "SELECT * FROM tour_agency.status_voucher;";

    private static String get_order_by_id = "SELECT * FROM tour_agency.order where order_id =? limit 1";
    private static String get_order_id_desc = "SELECT order_id FROM tour_agency.order order by order_id DESC limit 1";
    private static String get_order_id_by_all = "SELECT order_id FROM tour_agency.order where count = ? and fk_client_id = ? and fk_tour_date_id =? limit 1";

    public OrderDAO() {
	initialize();
    }

    /*
     * This initialize method will initialize database connection to MySQL database
     */
    public void initialize() {
	try {
	    con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

	    if (con != null) {
		System.out.println("Connected to the database!");
	    } else {
		System.out.println("Failed to make connection!");
	    }

	} catch (SQLException e) {

	    System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getStackTrace());
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    String ResponseMessage = "";

    public boolean addOrder(Order order) {
	try {

	    PreparedStatement insert_order = con.prepareStatement(add_order);
	    PreparedStatement get_order_IdDesc = con.prepareStatement(get_order_id_desc);
	    PreparedStatement get_order_IdAll = con.prepareStatement(get_order_id_by_all);
	    PreparedStatement get_status_order_id_ByName = con.prepareStatement(get_status_order_id_name);
	    PreparedStatement get_status_order_all = con.prepareStatement(get_all_status_order);
	    boolean result_add;
	    int id = 0;
	    int count = order.getOrderCount();
	    Timestamp date = new Timestamp(new Date().getTime());
	    int person_id = order.getPerson().getId();
	    int tourdate_id = order.getTourDate().getId();
	    int status_id = 1;
	    insert_order.setInt(1, id);
	    insert_order.setInt(2, count);
	    insert_order.setTimestamp(3, date);
	    insert_order.setTimestamp(4, date);
	    insert_order.setInt(5, person_id);
	    insert_order.setInt(6, tourdate_id);
	    insert_order.setInt(7, status_id);
	    int res_add = insert_order.executeUpdate();
	    if (res_add == 0) {
		result_add = false;
	    } else {
		result_add = true;
	    }
	    return result_add;

	} catch (

	Exception e) {
	    e.printStackTrace();
	    ResponseMessage = "Error inserting order";
	    return false;
	} 
    }

    public Order[] findAllOrdersbyPerson(int personId) {
	try {
	    PreparedStatement get_orders = con.prepareStatement(get_all_order);
	    PreparedStatement get_status_order_id = con.prepareStatement(get_status_order_by_id);
	    PreparedStatement get_orders_by_person = con.prepareStatement(get_all_order_by_person);

	    get_orders_by_person.setInt(1, personId);
	    ResultSet resultSet = get_orders_by_person.executeQuery();
//   	    ArrayList<Tour> result = new ArrayList<Tour>();
	    List<Order> result = new ArrayList<Order>();
	    while (resultSet.next()) {
		Object[] resobj = new Object[7];
		resobj[0] = resultSet.getInt("order_id");
		resobj[1] = resultSet.getInt("count");

		XMLGregorianCalendar xmlDate = null;
		Timestamp d = null;
		GregorianCalendar gc = new GregorianCalendar();

		d = resultSet.getTimestamp("order_date");
		gc.setTime(d);
		try {
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		resobj[2] = xmlDate;

		xmlDate = null;
		d = resultSet.getTimestamp("order_update_date");
		gc.setTime(d);
		try {
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		resobj[3] = xmlDate;

		resobj[4] = resultSet.getInt("fk_client_id");
		resobj[5] = resultSet.getInt("fk_tour_date_id");
		get_status_order_id.setInt(1, resultSet.getInt("fk_status_order_id"));
		ResultSet resultStatusOrder = get_status_order_id.executeQuery();
		if (resultStatusOrder.next() == true) {
		    resobj[6] = resultStatusOrder.getString("name");
		}
		result.add(new Order((int) resobj[0], (int) resobj[1], (XMLGregorianCalendar) resobj[2],
			(XMLGregorianCalendar) resobj[3], (int) resobj[4], (int) resobj[5], (String) resobj[6]));
	    }
	    Order[] result_list = result.toArray(new Order[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    public Order[] findAllOrders() {
	try {
	    PreparedStatement get_orders = con.prepareStatement(get_all_order);
	    PreparedStatement get_status_order_id = con.prepareStatement(get_status_order_by_id);
	    ResultSet resultSet = get_orders.executeQuery();
//   	    ArrayList<Tour> result = new ArrayList<Tour>();
	    List<Order> result = new ArrayList<Order>();
	    while (resultSet.next()) {
		Object[] resobj = new Object[7];
		resobj[0] = resultSet.getInt("order_id");
		resobj[1] = resultSet.getInt("count");

		XMLGregorianCalendar xmlDate = null;
		Timestamp d = null;
		GregorianCalendar gc = new GregorianCalendar();

		d = resultSet.getTimestamp("order_date");
		gc.setTime(d);
		try {
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		resobj[2] = xmlDate;

		xmlDate = null;
		d = resultSet.getTimestamp("order_update_date");
		gc.setTime(d);
		try {
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		resobj[3] = xmlDate;

		resobj[4] = resultSet.getInt("fk_client_id");
		resobj[5] = resultSet.getInt("fk_tour_date_id");
		get_status_order_id.setInt(1, resultSet.getInt("fk_status_order_id"));
		ResultSet resultStatusOrder = get_status_order_id.executeQuery();
		if (resultStatusOrder.next() == true) {
		    resobj[6] = resultStatusOrder.getString("name");
		}
		result.add(new Order((int) resobj[0], (int) resobj[1], (XMLGregorianCalendar) resobj[2],
			(XMLGregorianCalendar) resobj[3], (int) resobj[4], (int) resobj[5], (String) resobj[6]));
	    }
	    Order[] result_list = result.toArray(new Order[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    /*
     * public Order getOrder(int orderId) { try {
     * 
     * PreparedStatement get_order = con.prepareStatement(get_order_by_id);
     * PreparedStatement get_statusorder =
     * con.prepareStatement(get_status_order_by_id);
     * 
     * get_order.setInt(1, orderId); ResultSet resultSet = get_order.executeQuery();
     * if (resultSet.next()) { Object[] resobj = new Object[7]; resobj[0] =
     * resultSet.getInt("order_id"); resobj[1] = resultSet.getString("count");
     * resobj[2] = resultSet.getString("order_date"); resobj[3] =
     * resultSet.getInt("order_update_date"); resobj[4] =
     * resultSet.getString("fk_client_id"); resobj[5] =
     * resultSet.getString("fk_tour_date_id"); get_statusorder.setInt(1,
     * resultSet.getInt("fk_status_order_id")); ResultSet resultStatusOrder =
     * get_statusorder.executeQuery(); if (resultStatusOrder.next() == true) {
     * resobj[6] = resultStatusOrder.getString("name"); } // Order result = new
     * Order((int) resobj[0], (inr) resobj[1], (XMLGregorianCalendar) resobj[2], //
     * (XMLGregorianCalendar) resobj[3], (int) resobj[4], (int) resobj[5], (String)
     * resobj[6])); // return result; } else { // return new Order(); }
     * 
     * } catch (Exception ex) { System.out.println("Query failed...");
     * System.out.println(ex); return null; }
     * 
     * }
     */

    public String[] findAllStatusOrder() {
	try {
	    PreparedStatement get_all_statusOrder = con.prepareStatement(get_all_status_order);
	    ResultSet resultSet = get_all_statusOrder.executeQuery();
	    List<String> result = new ArrayList<String>();
	    while (resultSet.next()) {
		result.add(resultSet.getString("name"));
	    }
	    String[] result_list = result.toArray(new String[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query status_order_id failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    public boolean updateOrder(String status_order) {
	try {

	    PreparedStatement update_order = con.prepareStatement(update_status_in_order_by_id);
	    PreparedStatement get_status_order_id_ByName = con.prepareStatement(get_status_order_id_name);
	    int fk_status_order_id = 0;
	    get_status_order_id_ByName.setString(1, status_order);
	    ResultSet statusorder = get_status_order_id_ByName.executeQuery();
	    if (statusorder.next() == true) {
		fk_status_order_id = statusorder.getInt("status_order_id");
	    }
	    update_order.setString(1, status_order);
	    update_order.setInt(1, fk_status_order_id);
	    int result_update = update_order.executeUpdate();
	    if (result_update == 0)
		return false;
	    else
		return true;

	} catch (

	Exception e) {
	    e.printStackTrace();
	    ResponseMessage = "Error updating order";
	    return false;
	} finally {
	    if (con != null)
		try {
		    con.close();
		} catch (Exception e) {
		}
	}
    }

}
