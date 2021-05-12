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
     *
     */
    public int insertEmployee(String first_name, String last_name, String ssn, String dept, String room, String phone) {

        System.out.println("Hello Sir" + first_name);

        Connection con = null;
        PreparedStatement insertEmployee = null;
        int rowsUpdated = 0;

        try {

            con = createConnection();

            String insertString = "Insert INTO employees (first_name, last_name, ssn, dept, room, phone) VALUES (?, ?, ?, ?, ?, ?)";

            insertEmployee = con.prepareStatement(insertString);

            insertEmployee.setString(1, first_name);
            insertEmployee.setString(2, last_name);
            insertEmployee.setString(3, ssn);
            insertEmployee.setString(4, dept);
            insertEmployee.setString(5, room);
            insertEmployee.setString(6, phone);

            System.out.println(insertEmployee);

            rowsUpdated = insertEmployee.executeUpdate();

            insertEmployee.close();
            con.close();

            return rowsUpdated;

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Failed to execute query");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return rowsUpdated;
    }


    public Search search(String searchTerm, String searchType) {
        Search search;

        if (searchType.equals("emp_id")) {
            String selectString = "SELECT * FROM employees WHERE emp_id LIKE ?";
            search = databaseSearch(searchTerm, selectString);
        } else if (searchType.equals("first_name")) {
            String selectString = "SELECT * FROM employees WHERE first_name LIKE ?";
            search = databaseSearch(searchTerm, selectString);
        } else {
            String selectString = "SELECT * FROM employees WHERE last_name LIKE ?";
            search = databaseSearch(searchTerm, selectString);
        }

        return search;
    }

    private Search databaseSearch(String searchTerm, String selectString) {
        ResultSet result = null;
        PreparedStatement statement = null;
        Connection con = null;

        Search search = new Search();
        Employee employee;



        search.setResponse(false);

        try {
            con = createConnection();

            statement = con.prepareStatement(selectString);
            statement.setString(1, searchTerm);
            System.out.println(statement);
            result = statement.executeQuery();

            if (result.isBeforeFirst()) {

                search.setResponse(true);

                while (result.next()) {

                    employee = new Employee();

                    employee.setEmployeeId(result.getString("emp_id"));
                    employee.setFirstName(result.getString("first_name"));
                    employee.setLastName(result.getString("last_name"));
                    employee.setSsn(result.getString("ssn"));
                    employee.setDepartment(result.getString("dept"));
                    employee.setRoomNumber(result.getString("room"));
                    employee.setPhoneNumber(result.getString("phone"));

                    search.addFoundEmployee(employee);
                }
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (Exception exception) {
        exception.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                //log("sql error in finally block");
            } catch (Exception exception) {
                exception.printStackTrace();
                //log("Error in exception finally block");
            }
        }

        return search;
    }
}
