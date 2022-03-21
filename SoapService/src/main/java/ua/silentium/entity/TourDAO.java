package ua.silentium.entity;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;



import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;
import ua.silentium.entity.vouchers.TypeFood;

public class TourDAO {

    static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/tour_agency?serverTimezone=UTC";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "12345";

    private static Connection con = null;
    Statement statement;
    private static String add_tour = "INSERT INTO tour_agency.tour(tour_id, name, description, quantity_night, tour_operator, fk_type_food_id,  fk_type_transport_id, fk_type_tour_id) VALUES(?,?,?,?,?,?,?,?)";
    private static String delete_tour = "DELETE FROM tour_agency.tour where tour_id = ?";
    private static String update_tour_by_id = "UPDATE tour_agency.tour SET name = ?, description = ?, quantity_night = ?, tour_operator = ?, fk_type_food_id =?, fk_type_transport_id =?, fk_type_tour_id =? where tour_id =?";
    private static String get_all_tour = "SELECT * FROM tour_agency.tour;";

    private static String get_all_typefood = "SELECT * FROM tour_agency.type_food;";
    private static String get_all_typetransport = "SELECT * FROM tour_agency.type_transport;";
    private static String get_all_typetour = "SELECT * FROM tour_agency.type_tour;";
    
    private static String get_typefood_by_id = "SELECT * FROM tour_agency.type_food where type_food_id =? limit 1";
    private static String get_typetransport_by_id = "SELECT * FROM tour_agency.type_transport where type_transport_id =? limit 1";
    private static String get_typetour_by_id = "SELECT * FROM tour_agency.type_tour where type_tour_id =? limit 1";
    private static String get_tour_by_id = "SELECT * FROM tour_agency.tour where tour_id =? limit 1";
    private static String get_tour_id_desc = "SELECT tour_id FROM tour_agency.tour order by tour_id DESC limit 1";
    private static String get_tour_id_by_all = "SELECT tour_id FROM tour_agency.tour where name = ? and description = ? and quantity_night = ? and tour_operator = ? and fk_type_food_id =? and fk_type_transport_id =? and fk_type_tour_id =? limit 1";

    private static String add_tourdate = "INSERT INTO tour_agency.tour_date(tour_date_id, date_arrival, price, name, fk_tour_id ) VALUES(?,?,?,?,?)";
    private static String get_tourdate_by_id = "SELECT * FROM tour_agency.tour_date where tour_date_id =? limit 1";
    private static String get_tourdate_id_desc = "SELECT tour_date_id FROM tour_agency.tour_date order by tour_date_id DESC limit 1";
    private static String get_tourdate_id_by_all = "SELECT tour_date_id FROM tour_agency.tour_date where date_arrival = ? and price = ? and name = ? and fk_tour_id =?  limit 1";
    private static String get_tourdates_by_id = "SELECT * FROM tour_agency.tour_date where fk_tour_id =? ";

    private static String get_type_food_id_name = "SELECT type_food_id FROM tour_agency.type_food where name = ? limit 1";
    private static String get_type_food = "SELECT * FROM tour_agency.type_food";

    private static String get_type_transport_id_name = "SELECT type_transport_id FROM tour_agency.type_transport where name = ? limit 1";
    private static String get_type_transport = "SELECT * FROM tour_agency.type_transport ";

    private static String get_type_tour_id_name = "SELECT type_tour_id FROM tour_agency.type_tour where name = ? limit 1";
    private static String get_type_tour = "SELECT * FROM tour_agency.type_tour";

    public TourDAO() {
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

    public boolean addTour(Tour tour) {
	try {

	    PreparedStatement insert_tour = con.prepareStatement(add_tour);
	    PreparedStatement get_tour_IdDesc = con.prepareStatement(get_tour_id_desc);
	    PreparedStatement get_tour_IdAll = con.prepareStatement(get_tour_id_by_all);
	    PreparedStatement get_type_food_id_ByName = con.prepareStatement(get_type_food_id_name);
	    PreparedStatement get_type_transport_id_ByName = con.prepareStatement(get_type_transport_id_name);
	    PreparedStatement get_type_tour_id_ByName = con.prepareStatement(get_type_tour_id_name);
	    PreparedStatement get_type_food_all = con.prepareStatement(get_type_food);
	    PreparedStatement get_type_transport_all = con.prepareStatement(get_type_transport);
	    PreparedStatement get_type_tour_all = con.prepareStatement(get_type_tour);

	    int id = tour.getId();
	    String name = tour.getTourName();
	    String description = tour.getTourDescription();
	    int quantity_night = tour.getQuantityNight();
	    String tour_operator = tour.getTourOperator();
	    String typefood = tour.getTypeFood().getTypeFoodName();
	    String typetransport = tour.getTypeTransport().getTypeTransportName();
	    String typetour = tour.getTypeTour().getTypeTourName();

	    int fk_type_food_id = 0;
	    get_type_food_id_ByName.setString(1, typefood);
	    ResultSet type_food = get_type_food_id_ByName.executeQuery();
	    if (type_food.next() == true) {
		fk_type_food_id = type_food.getInt("type_food_id");
	    }

	    int fk_type_transport_id = 0;
	    get_type_transport_id_ByName.setString(1, typetransport);
	    ResultSet type_transport = get_type_transport_id_ByName.executeQuery();
	    if (type_transport.next() == true) {
		fk_type_transport_id = type_transport.getInt("type_transport_id");
	    }

	    int fk_type_tour_id = 0;
	    get_type_tour_id_ByName.setString(1, typetour);
	    ResultSet type_tour = get_type_tour_id_ByName.executeQuery();
	    if (type_tour.next() == true) {
		fk_type_tour_id = type_tour.getInt("type_tour_id");
	    }

	    get_tour_IdAll.setString(1, name);
	    get_tour_IdAll.setString(2, description);
	    get_tour_IdAll.setInt(3, quantity_night);
	    get_tour_IdAll.setString(4, tour_operator);
	    get_tour_IdAll.setInt(5, fk_type_food_id);
	    get_tour_IdAll.setInt(6, fk_type_transport_id);
	    get_tour_IdAll.setInt(7, fk_type_tour_id);
	    ResultSet tours_id = get_tour_IdAll.executeQuery();
	    int tour_id = 0;
	    boolean result_add;
	    if (tours_id.next() == false) {
		insert_tour.setInt(1, id);
		insert_tour.setString(2, name);
		insert_tour.setString(3, description);
		insert_tour.setInt(4, quantity_night);
		insert_tour.setString(5, tour_operator);
		insert_tour.setInt(6, fk_type_food_id);
		insert_tour.setInt(7, fk_type_transport_id);
		insert_tour.setInt(8, fk_type_tour_id);
		insert_tour.executeUpdate();
		ResultSet resultSet = get_tour_IdDesc.executeQuery();
		resultSet.next();
		tour_id = resultSet.getInt("tour_id");
		result_add = true;
	    } else {
		tour_id = tours_id.getInt("tour_id");
		result_add = false;
	    }

	    return result_add;

	} catch (Exception e) {
	    e.printStackTrace();
	    ResponseMessage = "Error inserting tour";
	    return false;
	} finally {
	    if (con != null)
		try {
		    con.close();
		} catch (Exception e) {
		}
	}
    }

    public String[] findAllTypeFood() {
	try {
	    PreparedStatement get_all_typeFood = con.prepareStatement(get_all_typefood);
	    ResultSet resultSet = get_all_typeFood.executeQuery();
	    List<String> result = new ArrayList<String>();
	    while (resultSet.next()) {
		result.add(resultSet.getString("name"));
	    }
	    String[] result_list = result.toArray(new String[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query type_food_id failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    public String[] findAllTypeTransport() {
	try {
	    PreparedStatement get_all_typeTransport = con.prepareStatement(get_all_typetransport);
	    ResultSet resultSet = get_all_typeTransport.executeQuery();
	    List<String> result = new ArrayList<String>();
	    while (resultSet.next()) {
		result.add(resultSet.getString("name"));
	    }
	    String[] result_list = result.toArray(new String[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query type_transport_id failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    public String[] findAllTypeTour() {
	try {
	    PreparedStatement get_all_typeTour = con.prepareStatement(get_all_typetour);
	    ResultSet resultSet = get_all_typeTour.executeQuery();
	    List<String> result = new ArrayList<String>();
	    while (resultSet.next()) {
		result.add(resultSet.getString("name"));
	    }
	    String[] result_list = result.toArray(new String[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query type_tour_id failed...");
	    System.out.println(ex);
	    return null;
	}
    }

   

    public Tour[] findAllTours() {
	try {
	    PreparedStatement get_tours = con.prepareStatement(get_all_tour);

	    PreparedStatement get_type_food_by_id = con.prepareStatement(get_typefood_by_id);
	    PreparedStatement get_type_transport_by_id = con.prepareStatement(get_typetransport_by_id);
	    PreparedStatement get_type_tour_by_id = con.prepareStatement(get_typetour_by_id);
	    ResultSet resultSet = get_tours.executeQuery();
//	    ArrayList<Tour> result = new ArrayList<Tour>();
	    List<Tour> result = new ArrayList<Tour>();
	    while (resultSet.next()) {
		Object[] resobj = new Object[8];
		resobj[0] = resultSet.getInt("tour_id");
		resobj[1] = resultSet.getString("name");
		resobj[2] = resultSet.getString("description");
		resobj[3] = resultSet.getInt("quantity_night");
		resobj[4] = resultSet.getString("tour_operator");
		get_type_food_by_id.setInt(1, resultSet.getInt("fk_type_food_id"));
		ResultSet resultTypeFood = get_type_food_by_id.executeQuery();
		if (resultTypeFood.next() == true) {
		    resobj[5] = resultTypeFood.getString("name");
		}
		get_type_transport_by_id.setInt(1, resultSet.getInt("fk_type_transport_id"));
		ResultSet resultTypeTransport = get_type_transport_by_id.executeQuery();
		if (resultTypeTransport.next() == true) {
		    resobj[6] = resultTypeTransport.getString("name");
		}
		get_type_tour_by_id.setInt(1, resultSet.getInt("fk_type_tour_id"));
		ResultSet resultTypeTour = get_type_tour_by_id.executeQuery();
		if (resultTypeTour.next() == true) {
		    resobj[7] = resultTypeTour.getString("name");
		}
		result.add(new Tour((int) resobj[0], (String) resobj[1], (String) resobj[2], (int) resobj[3],
			(String) resobj[4], (String) resobj[5], (String) resobj[6], (String) resobj[7]));
	    }
	    Tour[] result_list = result.toArray(new Tour[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    public Tour getTour(int tour_id) {
	try {

	    PreparedStatement get_tour = con.prepareStatement(get_tour_by_id);
	    PreparedStatement get_typefood = con.prepareStatement(get_typefood_by_id);
	    PreparedStatement get_typetransport = con.prepareStatement(get_typetransport_by_id);
	    PreparedStatement get_typetour = con.prepareStatement(get_typetour_by_id);

	    get_tour.setInt(1, tour_id);
	    ResultSet resultSet = get_tour.executeQuery();
	    if (resultSet.next()) {

		Object[] resobj = new Object[8];
		resobj[0] = resultSet.getInt("tour_id");
		resobj[1] = resultSet.getString("name");
		resobj[2] = resultSet.getString("description");
		resobj[3] = resultSet.getInt("quantity_night");
		resobj[4] = resultSet.getString("tour_operator");

		get_typefood.setInt(1, resultSet.getInt("fk_type_food_id"));
		ResultSet resultTypeFood = get_typefood.executeQuery();
		if (resultTypeFood.next() == true) {
		    resobj[5] = resultTypeFood.getString("name");
		}
		get_typetransport.setInt(1, resultSet.getInt("fk_type_transport_id"));
		ResultSet resultTypeTransport = get_typetransport.executeQuery();
		if (resultTypeTransport.next() == true) {
		    resobj[6] = resultTypeTransport.getString("name");
		}
		get_typetour.setInt(1, resultSet.getInt("fk_type_tour_id"));
		ResultSet resultTypeTour = get_typetour.executeQuery();
		if (resultTypeTour.next() == true) {
		    resobj[7] = resultTypeTour.getString("name");
		}
		Tour result = new Tour((int) resobj[0], (String) resobj[1], (String) resobj[2], (int) resobj[3],
			(String) resobj[4], (String) resobj[5], (String) resobj[6], (String) resobj[7]);
		return result;
	    } else {
		return new Tour();
	    }

	} catch (Exception ex) {
	    System.out.println("Query failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    public boolean updateTour(Tour tour) {
	try {

	    PreparedStatement update_tour = con.prepareStatement(update_tour_by_id);
	    PreparedStatement get_type_food_id_ByName = con.prepareStatement(get_type_food_id_name);
	    PreparedStatement get_type_transport_id_ByName = con.prepareStatement(get_type_transport_id_name);
	    PreparedStatement get_type_tour_id_ByName = con.prepareStatement(get_type_tour_id_name);
	    PreparedStatement get_type_food_all = con.prepareStatement(get_type_food);
	    PreparedStatement get_type_transport_all = con.prepareStatement(get_type_transport);
	    PreparedStatement get_type_tour_all = con.prepareStatement(get_type_tour);

	    PreparedStatement get_typefood = con.prepareStatement(get_typefood_by_id);
	    PreparedStatement get_typetransport = con.prepareStatement(get_typetransport_by_id);
	    PreparedStatement get_typetour = con.prepareStatement(get_typetour_by_id);

	    PreparedStatement get_tour_IdAll = con.prepareStatement(get_tour_id_by_all);
	    PreparedStatement get_tour_IdDesc = con.prepareStatement(get_tour_id_desc);

	    int id = tour.getId();
	    String name = tour.getTourName();
	    String description = tour.getTourDescription();
	    int quantity_night = tour.getQuantityNight();
	    String tour_operator = tour.getTourOperator();
	    String typefood = tour.getTypeFood().getTypeFoodName();
	    String typetransport = tour.getTypeTransport().getTypeTransportName();
	    String typetour = tour.getTypeTour().getTypeTourName();

	    int fk_type_food_id = 0;
	    get_type_food_id_ByName.setString(1, typefood);
	    ResultSet type_food = get_type_food_id_ByName.executeQuery();
	    if (type_food.next() == true) {
		fk_type_food_id = type_food.getInt("type_food_id");
	    }

	    int fk_type_transport_id = 0;
	    get_type_transport_id_ByName.setString(1, typetransport);
	    ResultSet type_transport = get_type_transport_id_ByName.executeQuery();
	    if (type_transport.next() == true) {
		fk_type_transport_id = type_transport.getInt("type_transport_id");
	    }

	    int fk_type_tour_id = 0;
	    get_type_tour_id_ByName.setString(1, typetour);
	    ResultSet type_tour = get_type_tour_id_ByName.executeQuery();
	    if (type_tour.next() == true) {
		fk_type_tour_id = type_tour.getInt("type_tour_id");
	    }

	    /*
	     * get_typefood.setInt(1, fk_type_food_id); get_typetransport.setInt(1,
	     * fk_type_transport_id); get_typetour.setInt(1, fk_type_tour_id); ResultSet
	     * typefood_by_fk = get_typefood.executeQuery(); ResultSet typetransport_by_fk =
	     * get_typetransport.executeQuery(); ResultSet typetour_by_fk =
	     * get_typetour.executeQuery();
	     */
	    update_tour.setString(1, name);
	    update_tour.setString(2, description);
	    update_tour.setInt(3, quantity_night);
	    update_tour.setString(4, tour_operator);
	    update_tour.setInt(5, fk_type_food_id);
	    update_tour.setInt(6, fk_type_transport_id);
	    update_tour.setInt(7, fk_type_tour_id);
	    update_tour.setInt(8, id);
	    int result_update = update_tour.executeUpdate();
	    if (result_update == 0)
		return false;
	    else
		return true;

	} catch (

	Exception e) {
	    e.printStackTrace();
	    ResponseMessage = "Error updating tour";
	    return false;
	} finally {
	    if (con != null)
		try {
		    con.close();
		} catch (Exception e) {
		}
	}
    }

    public boolean addTourDate(TourDate tourdate) {
	try {

	    PreparedStatement insert_tourdate = con.prepareStatement(add_tourdate);
	    PreparedStatement get_tourdate_IdDesc = con.prepareStatement(get_tourdate_id_desc);
	    PreparedStatement get_tourdate_IdAll = con.prepareStatement(get_tourdate_id_by_all);
	    PreparedStatement get_tour = con.prepareStatement(get_tour_by_id);

	    int id = tourdate.getId();
	    XMLGregorianCalendar date_arrival = tourdate.getDateArrival();
	    BigDecimal price = tourdate.getPrice();
	    String name = tourdate.getTourDateName();

	    int tour_id = tourdate.getTour().getId();

	    int fk_tour_id = 0;
	    get_tour.setInt(1, tour_id);
	    ResultSet tour = get_tour.executeQuery();
	    if (tour.next() == true) {
		fk_tour_id = tour.getInt("tour_id");
	    }

	    get_tourdate_IdAll.setDate(1, (Date) date_arrival.toGregorianCalendar().getTime());
	    get_tourdate_IdAll.setBigDecimal(2, price);
	    get_tourdate_IdAll.setString(3, name);
	    get_tourdate_IdAll.setInt(4, fk_tour_id);

	    ResultSet tourdates_id = get_tourdate_IdAll.executeQuery();
	    int tourdate_id = 0;
	    boolean result_add;
	    if (tourdates_id.next() == false) {
		insert_tourdate.setInt(1, id);
		insert_tourdate.setDate(2, (Date) date_arrival.toGregorianCalendar().getTime());
		insert_tourdate.setBigDecimal(3, price);
		insert_tourdate.setString(4, name);
		insert_tourdate.setInt(4, fk_tour_id);
		insert_tourdate.executeUpdate();
		ResultSet resultSet = get_tourdate_IdDesc.executeQuery();
		resultSet.next();
		tourdate_id = resultSet.getInt("tour_date_id");
		result_add = true;
	    } else {
		tourdate_id = tourdates_id.getInt("tour_date_id");
		result_add = false;
	    }

	    return result_add;

	} catch (Exception e) {
	    e.printStackTrace();
	    ResponseMessage = "Error inserting tourdate";
	    return false;
	} finally {
	    if (con != null)
		try {
		    con.close();
		} catch (Exception e) {
		}
	}
    }

    public TourDate[] getTourDatesByTourId(int tour_id) {
	try {

	    List<TourDate> result = new ArrayList<TourDate>();

	    PreparedStatement get_tourdates = con.prepareStatement(get_tourdates_by_id);
	    PreparedStatement get_tour = con.prepareStatement(get_tour_by_id);

	    Tour tour = getTour(tour_id);

	    get_tourdates.setInt(1, tour_id);
	    ResultSet result_tourdate = get_tourdates.executeQuery();
	    while (result_tourdate.next()) {
		Object[] resobj = new Object[5];
		resobj[0] = result_tourdate.getInt("tour_date_id");
		System.out.println("String= " + result_tourdate.getTimestamp("date_arrival"));
		System.out.println("Date= " + result_tourdate.getDate("date_arrival"));
		Date d = result_tourdate.getDate("date_arrival");
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);
		XMLGregorianCalendar xmlDate = null;
		try {
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		resobj[1] = xmlDate;
		resobj[2] = result_tourdate.getBigDecimal("price");
		resobj[3] = result_tourdate.getString("name");
		result.add(new TourDate((int) resobj[0], (XMLGregorianCalendar) resobj[1], (BigDecimal) resobj[2],
			(String) resobj[3], tour));
	    }
	    TourDate[] result_list = result.toArray(new TourDate[result.size()]);
	    return result_list;

	} catch (Exception ex) {
	    System.out.println("Query failed...");
	    System.out.println(ex);
	    return null;
	}
    }

    public boolean deleteTour(int tour_id) {

	try {
	    PreparedStatement delete_tour_by_id = con.prepareStatement(delete_tour);
	    delete_tour_by_id.setInt(1, tour_id);
	    delete_tour_by_id.executeUpdate();
	    int result_delete = delete_tour_by_id.executeUpdate();
	    if (result_delete == 0)
		return true;
	    else
		return false;

	} catch (Exception e) {
	    e.printStackTrace();
	    ResponseMessage = "Error deleting tour";
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
