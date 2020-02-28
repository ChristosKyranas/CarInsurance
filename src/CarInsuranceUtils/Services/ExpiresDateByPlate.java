package CarInsuranceUtils.Services;

import CarInsuranceUtils.Models.Vehicle;

import java.util.List;

public abstract class ExpiresDateByPlate {

    public abstract String searchExpiresByPlate(List<Vehicle> vehicleList);
}
