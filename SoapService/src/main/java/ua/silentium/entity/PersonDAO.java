package ua.silentium.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;

public class PersonDAO {

    static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/tour_agency?serverTimezone=UTC";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "12345";

    private static Connection con = null;
    Statement statement;
    private static String add_person = "INSERT INTO tour_agency.person(person_id, name, surname, email, password, fk_role_id) VALUES(?,?,?,?,?,?)";
    private static String get_all_person = "SELECT * FROM tour_agency.person;";
    private static String get_person_by_email_password = "SELECT * FROM tour_agency.person where email = ? and password = ? limit 1";
    private static String get_person_id_desc = "SELECT person_id FROM tour_agency.person order by role_id DESC limit 1";
    private static String get_person_id_by_all = "SELECT person_id FROM tour_agency.person where name = ? and surname = ? and email = ? and password = ? and fk_role_id =? limit 1";

    private static String get_all_role = "SELECT * FROM tour_agency.role;";
    private static String get_role_by_id = "SELECT * FROM tour_agency.role where role_id =? limit 1";
    private static String get_role_id_name = "SELECT role_id FROM tour_agency.role where name = ? limit 1";

    public PersonDAO() {
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

    public boolean addPerson(Person person) {
	try {

	    PreparedStatement insert_person = con.prepareStatement(add_person);
	    PreparedStatement get_person_IdDesc = con.prepareStatement(get_person_id_desc);
	    PreparedStatement get_person_IdAll = con.prepareStatement(get_person_id_by_all);
	    PreparedStatement get_role_id_ByName = con.prepareStatement(get_role_id_name);
	    PreparedStatement get_role_all = con.prepareStatement(get_all_role);

	    int id = person.getId();
	    String name = person.getName();
	    String surname = person.getSurname();
	    String email = person.getEmail();
	    String password = person.getPassword();

	    int fk_role_id = 0;
	    get_role_id_ByName.setString(1, "user");
	    ResultSet role_id = get_role_id_ByName.executeQuery();
	    if (role_id.next() == true) {
		fk_role_id = role_id.getInt("role_id");
	    }

	    get_person_IdAll.setString(1, name);
	    get_person_IdAll.setString(2, surname);
	    get_person_IdAll.setString(3, email);
	    get_person_IdAll.setString(4, password);
	    get_person_IdAll.setInt(5, fk_role_id);
	    ;
	    ResultSet persons_id = get_person_IdAll.executeQuery();
	    int person_id = 0;
	    boolean result_add;
	    if (persons_id.next() == false) {
		insert_person.setInt(1, id);
		insert_person.setString(2, name);
		insert_person.setString(3, surname);
		insert_person.setString(4, email);
		insert_person.setString(5, password);
		insert_person.setInt(6, fk_role_id);
		insert_person.executeUpdate();
		ResultSet resultSet = get_person_IdDesc.executeQuery();
		resultSet.next();
		person_id = resultSet.getInt("person_id");
		result_add = true;
	    } else {
		person_id = persons_id.getInt("person_id");
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

    public Person checkPerson(String email, String password) {
	try {

	    PreparedStatement ps_get_person_by_email_password = con.prepareStatement(get_person_by_email_password);
	    PreparedStatement ps_get_role_by_id = con.prepareStatement(get_role_by_id);
	    ps_get_person_by_email_password.setString(1, email);
	    ps_get_person_by_email_password.setString(2, password);
	    ResultSet rs_person = ps_get_person_by_email_password.executeQuery();

	    Person result = null;
	    if (rs_person.next()) {
		Object[] resobj = new Object[8];
		resobj[0] = rs_person.getInt("person_id");
		resobj[1] = rs_person.getString("name");
		resobj[2] = rs_person.getString("surname");
		resobj[3] = rs_person.getString("email");

		ps_get_role_by_id.setInt(1, rs_person.getInt("fk_role_id"));
		ResultSet rs_rolee = ps_get_role_by_id.executeQuery();
		if (rs_rolee.next() == true) {
		    resobj[4] = rs_rolee.getString("name");
		}
		result = new Person((int) resobj[0], (String) resobj[1], (String) resobj[2], (String) resobj[3], "",(String) resobj[4]);
	    }
	    return result;

	} catch (

	Exception e) {
	    e.printStackTrace();
	    ResponseMessage = "Error inserting tour";
	    return null;
	}
    }

}
