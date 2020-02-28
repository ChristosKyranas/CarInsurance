package CarInsuranceUtils.Services;

import CarInsuranceUtils.Models.Vehicle;

import java.util.List;

public abstract class FineCalculation {

    public abstract String calculateFine(List<Vehicle> vehicleList);

}
