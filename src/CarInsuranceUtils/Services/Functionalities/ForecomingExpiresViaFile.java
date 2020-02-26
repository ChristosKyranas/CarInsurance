package CarInsuranceUtils.Services.Functionalities;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Repositories.VehicleRepository;

import java.util.List;
import java.util.Scanner;

public class ForecomingExpiresViaFile {

    public ForecomingExpiresViaFile() {
        //common code from CSV
        VehicleRepository repository = new VehicleRepository();
        List<Vehicle> vehicleList = repository.collect();

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //The Object Vehicle Must Not Be Here!!!!!!!!!!!!!!
        //Wrong to call forecomingExpires via vehicle!!!!!!
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Vehicle vehicle = new Vehicle();
        Scanner scan = new Scanner(System.in);
        String daysRange = scan.nextLine();
        vehicle.searchForecomingExpires(vehicleList, daysRange);
    }

}
