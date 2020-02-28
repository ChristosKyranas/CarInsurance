package CarInsuranceUtils.Repositories;

import CarInsuranceUtils.Mappers.DBVehicleMapper;
import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Utils.DatabaseManagement.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryViaDatabaseImpl extends VehicleRepository {

    public List<Vehicle> collect() {
        Connection connection = DBConnection.getConnection();
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
        } catch (
                SQLException ex) {
            ex.printStackTrace();
        }
        return vehicles;
    }
    /*public static void main(String[] args) {
        collect();
    }*/
}
