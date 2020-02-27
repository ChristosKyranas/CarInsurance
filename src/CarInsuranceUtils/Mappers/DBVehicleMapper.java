package CarInsuranceUtils.Mappers;


import CarInsuranceUtils.Models.Vehicle;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBVehicleMapper {

    private static final String PLATE_NUMBER = "platenumber";
    private static final String EXPIRY_DATE = "expiry_date";
    private static final String OWNER_ID = "owner_id";

    public static Vehicle mapVehicleToRs(ResultSet resultSet) throws SQLException {
        return new Vehicle(
                resultSet.getString(PLATE_NUMBER),
                resultSet.getString(EXPIRY_DATE),
                resultSet.getInt(OWNER_ID)
        );
    }

}
