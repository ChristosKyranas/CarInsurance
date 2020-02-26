package CarInsuranceUtils.Services.Functionalities;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Repositories.VehicleRepository;

import java.util.List;
import java.util.Scanner;

public class FineCalculationViaFile {

    public FineCalculationViaFile() {
        //common code from CSV
        VehicleRepository repository = new VehicleRepository();
        List<Vehicle> vehicleList = repository.collect();

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //The Object Vehicle Must Not Be Here!!!!!!!!!!!!!!
        //Wrong to call calculateFine via vehicle!!!!!!!!!!
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Vehicle vehicle = new Vehicle();
        Scanner scan = new Scanner(System.in);
        int fineCost = scan.nextInt();
        vehicle.calculateFine(vehicleList, fineCost);

    }
}
