package CarInsuranceUtils.Services.FunctionalitiesImplementations;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Services.UpcomingExpires;
import CarInsuranceUtils.Utils.StringDateHelper;

import java.util.List;
import java.util.Scanner;

public class UpcomingExpiresImpl extends UpcomingExpires {

    public String searchUpcomingExpires(List<Vehicle> vehicleList){
        Scanner scan = new Scanner(System.in);
        System.out.println("daysRange: ");
        String daysRange = scan.nextLine();
        StringDateHelper dateHelper = new StringDateHelper();
        String result = "";
        boolean expires;
        for(Vehicle e : vehicleList){
            expires = dateHelper.expiresInRange(e.getInsuranceDate(), daysRange);
            if (expires){
                result += e.toString();
            }
        }
        return result;
    }

}
