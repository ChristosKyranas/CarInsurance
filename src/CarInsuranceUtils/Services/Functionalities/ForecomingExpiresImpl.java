package CarInsuranceUtils.Services.Functionalities;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Services.ForecomingExpires;
import CarInsuranceUtils.Utils.StringDateHelper;

import java.util.List;
import java.util.Scanner;

public class ForecomingExpiresImpl extends ForecomingExpires {

    public void searchForecomingExpires(List<Vehicle> vehicleList){
        Scanner scan = new Scanner(System.in);
        System.out.println("daysRange: ");
        String daysRange = scan.nextLine();
        StringDateHelper dateHelper = new StringDateHelper();
        boolean expires;
        for(Vehicle e : vehicleList){
            expires = dateHelper.expiresInRange(e.getInsuranceDate(), daysRange);
            if (expires){
                System.out.println("The " + e.getOwner()
                        + "'s vehicle plate number is " + e.getPlateNumber()
                        + " and has expired " + e.getInsuranceDate());
            }
        }

    }

}
