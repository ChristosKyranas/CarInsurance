package CarInsuranceUtils.Services;

import CarInsuranceUtils.Models.Vehicle;

import java.util.List;

public abstract class InsuranceStatus {

    public abstract String searchPlate(List<Vehicle> vehicleList);

}
