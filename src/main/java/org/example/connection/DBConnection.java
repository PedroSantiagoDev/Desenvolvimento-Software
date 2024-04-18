package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static final String url = "";
    static Properties props = new Properties();
    static {
        props.setProperty("user", "");
        props.setProperty("password", "");
        props.setProperty("ssl", "require");
    }
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, props);
    }
}
