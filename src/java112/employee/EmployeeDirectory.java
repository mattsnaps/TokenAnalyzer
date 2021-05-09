package java112.employee;

import java.util.*;
import java.sql.*;
/**
 * @author mbpriebe
 *
 */

public class EmployeeDirectory {
    Properties properties;

    /**
     * Constructor class
     */
    public EmployeeDirectory() {

    }

    /**
     * Constructor class
     * @param properties properties file passed in.
     */
    public EmployeeDirectory(Properties properties) {
        this();
        this.properties = properties;
    }

    /**
     * [createConnection description]
     * @return [description]
     */
    private Connection createConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/student", "student", "student");


        } catch(ClassNotFoundException classNotFound) {
            classNotFound.printStackTrace();
            System.out.println("Class not found exception. Create Connection");
        } catch(SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Connection to mySQL server Error.");
        }

        return connection;
    }

    /**
     * [insertEmployee description]
     * @param id          [description]
     * @param firstName   [description]
     * @param lastName    [description]
     * @param ssn         [description]
     * @param department  [description]
     * @param roomNumber  [description]
     * @param phoneNumber [description]
     */
    public void insertEmployee(String id, String firstName, String lastName,
            String ssn, String department, String roomNumber, String phoneNumber) {

        Connection con = createConnection();

        String insertString = "Insert INTO employees (emp_id, first_name, last_name, "
                + "ssn, dept, room, phone) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement insertEmployee = con.prepareStatement(insertString)) {

            insertEmployee.setString(1, id);
            insertEmployee.setString(2, firstName);
            insertEmployee.setString(3, lastName);
            insertEmployee.setString(4, ssn);
            insertEmployee.setString(5, department);
            insertEmployee.setString(6, roomNumber);
            insertEmployee.setString(7, phoneNumber);

            insertEmployee.executeUpdate();


        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Failed to execute query");
        }
    }


    public Search search() {


    }

}
