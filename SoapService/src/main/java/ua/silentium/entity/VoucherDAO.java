package ua.silentium.entity;

import java.math.BigDecimal;
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
import ua.silentium.entity.vouchers.Voucher;

public class VoucherDAO {
    static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/tour_agency?serverTimezone=UTC";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "12345";

    private static Connection con = null;
    Statement statement;
    private static String update_status_in_voucher_by_id = "UPDATE tour_agency.voucher SET fk_status_voucher_id = ? where voucher_id =?";
    private static String get_all_voucher = "SELECT * FROM tour_agency.voucher;";
    private static String get_all_voucher_by_person = "SELECT voucher_id, v.count, amount, voucher_date, voucher_update_date, fk_order_id, v.fk_tour_date_id, fk_manager_id, fk_status_voucher_id FROM tour_agency.voucher v  left join tour_agency.order o on o.order_id= v.fk_order_id where fk_client_id=?";

    private static String get_all_status_voucher = "SELECT * FROM tour_agency.status_voucher;";
    private static String get_status_voucher_by_id = "SELECT * FROM tour_agency.status_voucher where status_voucher_id=? limit 1";
    private static String get_status_voucher_id_name = "SELECT status_voucher_id FROM tour_agency.status_voucher where name =? limit 1";
    private static String get_all_statusvoucher = "SELECT * FROM tour_agency.status_voucher;";

    private static String get_voucher_by_id = "SELECT * FROM tour_agency.voucher where voucher_id =? limit 1";
    private static String get_voucher_id_desc = "SELECT voucher_id FROM tour_agency.voucher order by voucher_id DESC limit 1";
    private static String get_voucher_id_by_all = "SELECT voucher_id FROM tour_agency.voucher where count = ? and amount=? and fk_client_id = ? and fk_order_id=? and fk_tour_date_id =? limit 1";

    public VoucherDAO() {
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

  
    public Voucher[] findAllVouchersbyPerson(int personId) {
	try {
	    PreparedStatement get_vouchers = con.prepareStatement(get_all_voucher);
	    PreparedStatement get_status_voucher_id = con.prepareStatement(get_status_voucher_by_id);
	    PreparedStatement get_vouchers_by_person = con.prepareStatement(get_all_voucher_by_person);

	    get_vouchers_by_person.setInt(1, personId);
	    ResultSet resultSet = get_vouchers_by_person.executeQuery();
//   	    ArrayList<Tour> result = new ArrayList<Tour>();
	    List<Voucher> result = new ArrayList<Voucher>();
	    while (resultSet.next()) {
		Object[] resobj = new Object[9];
		resobj[0] = resultSet.getInt("voucher_id");
		resobj[1] = resultSet.getInt("count");
		resobj[2] = resultSet.getBigDecimal("amount");

		XMLGregorianCalendar xmlDate = null;
		Timestamp d = null;
		GregorianCalendar gc = new GregorianCalendar();

		d = resultSet.getTimestamp("voucher_date");
		gc.setTime(d);
		try {
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		resobj[3] = xmlDate;

		xmlDate = null;
		d = resultSet.getTimestamp("voucher_update_date");
		gc.setTime(d);
		try {
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		resobj[4] = xmlDate;

		resobj[5] = resultSet.getInt("fk_order_id");
		resobj[6] = resultSet.getInt("fk_manager_id");
		get_status_voucher_id.setInt(1, resultSet.getInt("fk_status_voucher_id"));
		ResultSet resultStatusVoucher = get_status_voucher_id.executeQuery();
		if (resultStatusVoucher.next() == true) {
		    resobj[7] = resultStatusVoucher.getString("name");
		}
		result.add(new Voucher((int) resobj[0], (int) resobj[1], (BigDecimal) resobj[2], (XMLGregorianCalendar) resobj[3],
			(XMLGregorianCalendar) resobj[4], (int) resobj[5], (int) resobj[6], (String) resobj[7]));
	    }
	    Voucher[] result_list = result.toArray(new Voucher[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    public Voucher[] findAllVouchers() {
	try {
	    PreparedStatement get_vouchers = con.prepareStatement(get_all_voucher);
	    PreparedStatement get_status_voucher_id = con.prepareStatement(get_status_voucher_by_id);
	    ResultSet resultSet = get_vouchers.executeQuery();
//   	    ArrayList<Tour> result = new ArrayList<Tour>();
	    List<Voucher> result = new ArrayList<Voucher>();
	    while (resultSet.next()) {
		Object[] resobj = new Object[8];
		resobj[0] = resultSet.getInt("voucher_id");
		resobj[1] = resultSet.getInt("count");
		resobj[2] = resultSet.getBigDecimal("amount");

		XMLGregorianCalendar xmlDate = null;
		Timestamp d = null;
		GregorianCalendar gc = new GregorianCalendar();

		d = resultSet.getTimestamp("voucher_date");
		gc.setTime(d);
		try {
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		resobj[3] = xmlDate;

		xmlDate = null;
		d = resultSet.getTimestamp("voucher_update_date");
		gc.setTime(d);
		try {
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		resobj[4] = xmlDate;

		resobj[5] = resultSet.getInt("fk_order_id");
		resobj[6] = resultSet.getInt("fk_manager_id");
		get_status_voucher_id.setInt(1, resultSet.getInt("fk_status_voucher_id"));
		ResultSet resultStatusVoucher = get_status_voucher_id.executeQuery();
		if (resultStatusVoucher.next() == true) {
		    resobj[7] = resultStatusVoucher.getString("name");
		}
		result.add(new Voucher((int) resobj[0], (int) resobj[1], (BigDecimal)resobj[2], (XMLGregorianCalendar) resobj[3],
			(XMLGregorianCalendar) resobj[4], (int) resobj[5], (int) resobj[6],(String) resobj[7]));
	    }
	    Voucher[] result_list = result.toArray(new Voucher[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    public String[] findAllStatusVoucher() {
   	try {
   	    PreparedStatement get_all_statusVoucher = con.prepareStatement(get_all_status_voucher);
   	    ResultSet resultSet = get_all_statusVoucher.executeQuery();
   	    List<String> result = new ArrayList<String>();
   	    while (resultSet.next()) {
   		result.add(resultSet.getString("name"));
   	    }
   	    String[] result_list = result.toArray(new String[result.size()]);
   	    return result_list;

   	} catch (Exception ex) {
   	    System.out.println("Query status_voucher_id failed...");
   	    System.out.println(ex);
   	    return null;
   	}
       }

}
