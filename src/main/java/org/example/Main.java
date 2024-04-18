package org.example;

import org.example.connection.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DBConnection.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM person");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name_person");
                String surname = resultSet.getString("surname");
                String birthDate = resultSet.getString("birth_date");
                String telephone = resultSet.getString("telephone");
                String city = resultSet.getString("city");
                String stateCity = resultSet.getString("state_city");

                System.out.printf("ID: %d, Name: %s %s, Birth Date: %s, Telephone: %s, City: %s, State: %s%n",
                        id, name, surname, birthDate, telephone, city, stateCity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}