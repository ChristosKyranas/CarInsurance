package CarInsuranceUtils.Mappers;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Repositories.VehicleRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileToVehicleMapper {

    public FileToVehicleMapper() {
        VehicleRepository repository = new VehicleRepository();
        List<Vehicle> vehicleList = repository.collect();

        //Map "Owner" with Vehicles
        Map<Integer, Vehicle> mappedVehicles = new HashMap<>();

        for(Vehicle e: vehicleList ){
            mappedVehicles.put(e.getOwner(), e);
        }

    }
}
