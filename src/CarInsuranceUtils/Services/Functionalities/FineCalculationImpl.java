package CarInsuranceUtils.Services.Functionalities;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Services.FineCalculation;
import CarInsuranceUtils.Utils.StringDateHelper;

import java.util.*;

public class FineCalculationImpl extends FineCalculation {


    public String calculateFine(List<Vehicle> vehicleList) {

        Scanner scan = new Scanner(System.in);
        int fineCost = scan.nextInt();

        StringDateHelper dateHelper = new StringDateHelper();
        boolean expires;
        List<Vehicle> vehicleExpiredList = new ArrayList<>();
        for(Vehicle e : vehicleList){
            expires = dateHelper.isExpiredInsurance(e.getInsuranceDate());
            if (expires == false){
                vehicleExpiredList.add(e);
                /*System.out.println("The " + e.getOwner()
                        + "'s vehicle plate number is " + e.getPlateNumber()
                        + " and has expired " + e.getInsuranceDate());*/
            }
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(Vehicle vehicle : vehicleExpiredList){
            Integer count = frequencyMap.get(vehicle.getOwner());
            if (count == null){
                count = 0;
            }
            frequencyMap.put(vehicle.getOwner(), count + 1);
        }
        String result = "";
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            //System.out.println(entry.getKey() + " " + entry.getValue());
            result += "The " + entry.getKey()
                    + " has to pay fine " + entry.getValue() * fineCost + "Eyros" + "\n";
        }
        //System.out.println(frequencyMap.size());
        return result;
    }




}
