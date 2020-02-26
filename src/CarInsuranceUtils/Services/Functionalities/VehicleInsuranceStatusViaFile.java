package CarInsuranceUtils.Services.Functionalities;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Repositories.VehicleRepository;

import java.util.List;

public class VehicleInsuranceStatusViaFile {


    public VehicleInsuranceStatusViaFile() {
        //common code from CSV
        VehicleRepository repository = new VehicleRepository();
        List<Vehicle> vehicleList = repository.collect();

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //The Object Vehicle Must Not Be Here!!!!!!!!!!!!!!
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Vehicle vehicle = new Vehicle();
        vehicle.searchPlate(vehicleList);
    }

}
