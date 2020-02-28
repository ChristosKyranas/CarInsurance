package CarInsuranceUtils.Services.Functionalities;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Services.ExpiresDateByPlate;
import CarInsuranceUtils.Utils.StringDateHelper;

import java.util.ArrayList;
import java.util.List;

public class ExpiresDateByPlateImpl extends ExpiresDateByPlate {

    public String searchExpiresByPlate(List<Vehicle> vehicleList){
        StringDateHelper dateHelper = new StringDateHelper();
        boolean expires;
        List<Vehicle> vehicleExpiredList = new ArrayList<>();
        List<Vehicle> sortedVehicleExpiredList;
        String result = "";
        for(Vehicle e : vehicleList){
            expires = dateHelper.isExpiredInsurance(e.getInsuranceDate());
            if (expires == false){
                vehicleExpiredList.add(e);
                /*System.out.println("The " + e.getOwner()
                        + "'s vehicle plate number is " + e.getPlateNumber()
                        + " and has expired " + e.getInsuranceDate());*/
            }
        }
        if (!vehicleExpiredList.isEmpty()){
            sortedVehicleExpiredList = sortVehicleList(vehicleExpiredList);
            System.out.println("SortedList");
            for (Vehicle e : sortedVehicleExpiredList){
                result += e.toString();
            }
        }
        return result;
    }

    private static List<Vehicle> sortVehicleList(List<Vehicle> vehicleList) {

        for (int i = vehicleList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vehicleList.get(j + 1) == null) {
                    continue;
                }
                if (vehicleList.get(j) == null || vehicleList.get(j + 1).compareTo(vehicleList.get(j)) < 0) {
                    Vehicle temp = vehicleList.get(j + 1);
                    vehicleList.set(j + 1, vehicleList.get(j));
                    vehicleList.set(j, temp);
                }
            }
        }
        return vehicleList;
    }


}
