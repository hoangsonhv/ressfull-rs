package com.example.ressfullrs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.regex.Pattern;

public class ConnectionHelper {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/web_service";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    public static Connection getConnection(){
        try {
            if (connection == null || connection.isClosed()){
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
                System.out.println("Connect success !");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
