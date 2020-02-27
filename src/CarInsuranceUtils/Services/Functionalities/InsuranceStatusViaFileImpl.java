package CarInsuranceUtils.Services.Functionalities;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Services.InsuranceStatus;
import CarInsuranceUtils.Validations.InputPlateValidator;

import java.util.List;
import java.util.Scanner;

public class InsuranceStatusViaFileImpl extends InsuranceStatus {

    public void searchPlate(List<Vehicle> vehicleList){
        boolean acceptablePlateFormat = false;

        InputPlateValidator input = new InputPlateValidator();
        Scanner scan = new Scanner(System.in);
        String plate = scan.nextLine();

        do {
            //Check Plate's Format Validation
            if (input.validatePlateNumber(plate)) {

                //Option 1
                //Search Via "for()"
                for (Vehicle e : vehicleList) {
                    if (e.getPlateNumber().equals(plate)) {
                        System.out.println("1) Via for(): " + e.toString());
                        //If Plate Is Found, Break
                        break;
                    }
                }

                //Option 2
                //Search Via "stream()"
                String finalPlate = plate;
                System.out.print("2) Via stream(): ");
                vehicleList.stream()
                        .filter(e -> e.getPlateNumber().equals(finalPlate))
                        .forEach(System.out::println);

                acceptablePlateFormat = true;
            }
            else{
                System.out.println("Give The Right Format Input\n"
                        + "Example: <<XXX-1111>>" );
                plate = scan.nextLine();
            }
        }while (!acceptablePlateFormat);
        //When User Has Typed Correct Plate Number Format
        //Either It Was Found In The Repository Or Not
    }
}
