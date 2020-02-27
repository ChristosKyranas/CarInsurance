package CarInsuranceUtils.Factories;


import CarInsuranceUtils.Mappers.DBVehicleMapper;
import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Utils.DatabaseManagement.DatabaseConfiguration;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBConnectionFactory {

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

        try (InputStream input = DBConnectionFactory.class.getClassLoader().getResourceAsStream("Resources/application.properties")) {
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

    public static void main(String[] args) {
        Connection connection = DBConnectionFactory.getConnection();
        List<Vehicle> vehicles = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT A.platenumber, B.expiry_date, C.owner_id  " +
                    "FROM VEHICLE_INSURANCE.vehicle A, VEHICLE_INSURANCE.insurance B, VEHICLE_INSURANCE.owner C " +
                    "WHERE A.insurance = B.insurance_id AND A.owner = C.owner_id " +
                    "ORDER BY A.insurance;");
            while (rs.next()) {
                vehicles.add(DBVehicleMapper.mapVehicleToRs(rs));
            }
            //System.out.println("Vehicle info: " + vehicles.get(0).getPlateNumber() );
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}