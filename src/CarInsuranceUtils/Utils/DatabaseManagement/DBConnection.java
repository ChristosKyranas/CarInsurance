package CarInsuranceUtils.Utils.DatabaseManagement;


import CarInsuranceUtils.Mappers.DBVehicleMapper;
import CarInsuranceUtils.Models.DatabaseConfiguration;
import CarInsuranceUtils.Models.Vehicle;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBConnection {

    public static Connection getConnection() {
        try {
            DatabaseConfiguration databaseConfiguration = loadDatabaseConfiguration();
            return DriverManager.getConnection(
                    databaseConfiguration.getDatabaseUrl(),
                    databaseConfiguration.getUsername(),
                    databaseConfiguration.getPassword()
            );
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }

    }

    private static DatabaseConfiguration loadDatabaseConfiguration() {
        Properties properties = new Properties();

        try (InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("Resources/application.properties")) {
            properties.load(input);

            return new DatabaseConfiguration(
                    properties.getProperty("database_user"),
                    properties.getProperty("database_password"),
                    properties.getProperty("database_url")
            );
        } catch (IOException ex) {
            throw new RuntimeException("Failed to connect to database");
        }
    }

   /* public static void main(String[] args) {


    }*/
}