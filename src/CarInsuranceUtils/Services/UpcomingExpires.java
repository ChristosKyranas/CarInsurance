package CarInsuranceUtils.Services;

import CarInsuranceUtils.Models.Vehicle;

import java.util.List;

public abstract class UpcomingExpires {

    public abstract String searchUpcomingExpires(List<Vehicle> vehicleList);

}
