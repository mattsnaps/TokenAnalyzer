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
    public void insertEmployee() {

        Connection con = createConnection();

        Employee employee = new Employee();

        String insertString = "Insert INTO employees (emp_id, first_name, last_name, "
                + "ssn, dept, room, phone) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement insertEmployee = con.prepareStatement(insertString)) {

            insertEmployee.setString(1, employee.getEmployeeId());
            insertEmployee.setString(2, employee.getFirstName());
            insertEmployee.setString(3, employee.getLastName());
            insertEmployee.setString(4, employee.getSsn());
            insertEmployee.setString(5, employee.getDepartment());
            insertEmployee.setString(6, employee.getRoomNumber());
            insertEmployee.setString(7, employee.getPhoneNumber());

            insertEmployee.executeUpdate();

            insertEmployee.close();
            con.close();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Failed to execute query");
        }
    }


    public void search(String searchTerm, String searchType) {
    }

    /**
     * [searchDatabase description]
     * @param searchTerm [description]
     * @param searchType [description]
     */
    private void searchDatabase(String searchTerm, String searchType) {
        Search search = new Search();
        Connection con =createConnection();

        String selectString = "SELECT * FROM employees WHERE ? LIKE '?'";

        try(PreparedStatement selectStatement = con.prepareStatement(selectString)) {

            selectStatement.setString(1, searchType);
            selectStatement.setString(2, searchTerm);

            ResultSet result = selectStatement.executeQuery();

            if (result != null) {
                search.setResponse(true);

                Employee employee = new Employee();

                while (result.next()) {
                    employee.setEmployeeId(result.getString("emp_id"));
                    employee.setFirstName(result.getString("first_name"));
                    employee.setLastName(result.getString("last_name"));
                    employee.setSsn(result.getString("ssn"));
                    employee.setDepartment(result.getString("dept"));
                    employee.setRoomNumber(result.getString("room"));
                    employee.setPhoneNumber(result.getString("phone"));

                    search.addFoundEmployee(employee);

                }

            } else {
                search.setResponse(false);
            }

            result.close();
            selectStatement.close();
            con.close();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Select Statement error");
        }
    }
}
