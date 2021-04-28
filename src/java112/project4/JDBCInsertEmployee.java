package java112.project4;

import java.io.*;
import java.sql.*;

public class JDBCInsertEmployee {
    public void runSample(String[] arg) {

        if (arg.length != 6) {

            for (String item : arg) {
                System.out.println(item);
            }

            System.out.println("Please enter 6 arguments on the command line");
            return;
        }

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String f_Name = arg[0];
        String l_Name = arg[1];
        String ssn = arg[2];
        String dept = arg[3];
        String room = arg[4];
        String phone = arg[5];

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/student", "student", "student");

            statement = connection.createStatement();

            //String name = "Smith";
            String queryString = String.format("INSERT INTO employees "
                    + "(emp_id, first_name, last_name, ssn, dept, room, phone)"
                    + " VALUES (null, '%s', '%s', '%s', '%s', '%s', '%s');"
                    , f_Name, l_Name, ssn, dept, room, phone);

            System.out.println("\nqueryString: " + queryString + "\n\n");

            int rowsAffected = statement.executeUpdate(queryString);

            System.out.println("Rows updated: " + rowsAffected);

            queryString = String.format("SELECT * FROM employees WHERE "
                    + "first_name = '%s' AND last_name = '%s';", f_Name, l_Name);

            System.out.println("\nqueryString: " + queryString + "\n\n");

            resultSet = statement.executeQuery(queryString);

            while (resultSet.next()) {
                String employeeId = resultSet.getString("emp_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                System.out.println(" Row: " + employeeId + " "
                            + firstName + " " + lastName);
            }

            System.out.println();

            //ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            //int columns = resultSetMetaData.getColumnCount();
            //String nameOne = resultSetMetaData.getColumnName(1);
            //String typeOne = resultSetMetaData.getColumnTypeName(1);
            //String labelOne = resultSetMetaData.getColumnLabel(1);
            //System.out.println(" Column count : " + columns);
            //System.out.println(" Column 1 name : " + nameOne);
            //System.out.println(" Column 1 type : " + typeOne);
            //System.out.println(" Column 1 label name : " + labelOne);

            //System.out.println();

        } catch (ClassNotFoundException classNotFound) {
            classNotFound.printStackTrace();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /**
     *  The main program for the JDBCSelectWhereExample class
     *
     *@param  args  The command line arguments
     *
     *@since
     *
     */
    public static void main(String[] args) {


        JDBCInsertEmployee employees = new JDBCInsertEmployee();

        employees.runSample(args);

    }
}
