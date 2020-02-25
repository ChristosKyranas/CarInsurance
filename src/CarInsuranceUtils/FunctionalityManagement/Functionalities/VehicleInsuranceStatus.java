package CarInsuranceUtils.FunctionalityManagement.Functionalities;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Repositories.VehicleRepository;
import CarInsuranceUtils.Validations.InputPlateValidator;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;


public class VehicleInsuranceStatus {

    private String plate;
    private boolean acceptablePlateFormat = false;

    public VehicleInsuranceStatus() {
        VehicleRepository repository = new VehicleRepository();
        List<Vehicle> vehicleList = repository.collect();

        InputPlateValidator input = new InputPlateValidator();
        Scanner scan = new Scanner(System.in);

        plate = scan.nextLine();
        do {
            if (input.validatePlateNumber(plate)) {
                acceptablePlateFormat = true;
                for (Vehicle e : vehicleList) {
                    if (e.getPlateNumber().equals(plate)) {
                        System.out.println(e.getOwner() + " " + e.getPlateNumber() + " " + e.getInsuranceDate());
                    }
                }
            }
            else{
                System.out.println("Give The Right Format Input\n"
                        + "Example: <<XXX-1111>>" );
                plate = scan.nextLine();
            }
        }while (acceptablePlateFormat);
        //When User Has Typed Correct Plate Number Format
        //Either It Was Found In The Repository Or Not
    }

}
