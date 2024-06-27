//package com.example.web_application;
//
//import java.sql.*;
//
//public class DatabaseConnectionTest {
//    public static void main(String[] args) {
//        String url = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes) " +
//                "(ADDRESS=(PROTOCOL=TCP)(HOST=phaisoracdbp04)(PORT=1521))" +
//                "(CONNECT_DATA=(SERVICE_NAME=ORCL)" +
//                "(FAILOVER_MODE =" +
//                "(TYPE = SELECT)" +
//                "(METHOD = BASIC)" +
//                "(RETRIES = 10)" +
//                "(DELAY = 1)" +
//                ")" +
//                ")" +
//                ")";
//        String username = "RAUL";
//        String password = "ais123";
//
//        try {
//            Connection connection = DriverManager.getConnection(url, username, password);
//            if (connection != null) {
//                System.out.println("Connected to the database!");
//                Statement statement = connection.createStatement();
//                ResultSet resultSet = statement.executeQuery("SELECT table_name FROM user_tables");
//
//                System.out.println("List of tables:");
//                while (resultSet.next()) {
//                    System.out.println(resultSet.getString("table_name"));
//                }
//
//                // Close the statement and connection
//                statement.close();
//                connection.close();
//            } else {
//                System.out.println("Failed to make connection!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
