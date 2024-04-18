package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static final String url = "jdbc:postgresql://ep-super-cake-a5cawzay.us-east-2.aws.neon.tech/devdb";
    static Properties props = new Properties();
    static {
        props.setProperty("user", "devdb_owner");
        props.setProperty("password", "RSkPuf23lCKg");
        props.setProperty("ssl", "require");
    }
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, props);
    }
}
