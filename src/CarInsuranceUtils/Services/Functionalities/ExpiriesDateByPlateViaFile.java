package CarInsuranceUtils.Services.Functionalities;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Repositories.VehicleRepository;

import java.util.List;

public class ExpiriesDateByPlateViaFile {


    public ExpiriesDateByPlateViaFile() {
        //common code from CSV
        VehicleRepository repository = new VehicleRepository();
        List<Vehicle> vehicleList = repository.collect();

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //The Object Vehicle Must Not Be Here!!!!!!!!!!!!!!
        //Wrong to call expiriesByPlate via vehicle!!!!!!!!
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Vehicle vehicle = new Vehicle();
        vehicle.searchExpiriesByPlate(vehicleList);
    }
}
