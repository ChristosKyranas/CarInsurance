package CarInsuranceUtils.Services;

import CarInsuranceUtils.Models.Vehicle;

import java.util.List;

public abstract class FineCalculation {

    public abstract void calculateFine(List<Vehicle> vehicleList);

}
