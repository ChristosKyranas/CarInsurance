package CarInsuranceUtils.Models;

import CarInsuranceUtils.Utils.StringDateHelper;
import CarInsuranceUtils.Validations.InputPlateValidator;

import java.util.*;

public class Vehicle {

    private static final int PLATE_NUMBER_LENGTH = 7;
    private Integer owner;
    private String plateNumber;
    private String insuranceDate;

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(String insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

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
                        System.out.println(toString(e));
                        //If Plate Is Found, Break
                        break;
                    }
                }

                //Option 2
                //Search Via "stream()"
                String finalPlate = plate;
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

    public void searchForecomingExpires(List<Vehicle> vehicleList, String daysRange){
        StringDateHelper dateHelper = new StringDateHelper();
        boolean expires;
        for(Vehicle e : vehicleList){
            expires = dateHelper.expiresInRange(e.getInsuranceDate(), daysRange);
            if (expires == false){
                System.out.println("The " + e.getOwner()
                        + "'s vehicle plate number is " + e.getPlateNumber()
                        + " and has expired " + e.getInsuranceDate() + "\n");
            }
        }

    }

    public void searchExpiriesByPlate(List<Vehicle> vehicleList){
        StringDateHelper dateHelper = new StringDateHelper();
        boolean expires;
        List<Vehicle> vehicleExpiredList = new ArrayList<>();
        List<Vehicle> sortedVehicleExpiredList;
        for(Vehicle e : vehicleList){
            expires = dateHelper.isExpiredInsurance(e.getInsuranceDate());
            if (expires == false){
                vehicleExpiredList.add(e);
                System.out.println("The " + e.getOwner()
                        + "'s vehicle plate number is " + e.getPlateNumber()
                        + " and has expired " + e.getInsuranceDate());
            }
        }
        if (!vehicleExpiredList.isEmpty()){
            sortedVehicleExpiredList = sortVehicleList(vehicleExpiredList);
            System.out.println("SortedList");
            for (Vehicle e : sortedVehicleExpiredList){
                System.out.println(toString(e));
            }
        }
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

    public int compareTo(Vehicle o) {
        return compare(this.getPlateNumber(), o.getPlateNumber());
    }

    private int compare(String plateNumber1, String plateNumber2) {
        int comparison = 0;
        while (comparison == 0) {
            int index = 0;
            while (index <= (PLATE_NUMBER_LENGTH) && comparison == 0) {
                if (plateNumber1.charAt(index) != plateNumber2.charAt(index)) {
                    comparison = plateNumber1.charAt(index) - plateNumber2.charAt(index);
                }
                index++;
            }
        }
        return comparison;
    }

    public void calculateFine(List<Vehicle> vehicleList, int fineCost) {

        StringDateHelper dateHelper = new StringDateHelper();
        boolean expires;
        List<Vehicle> vehicleExpiredList = new ArrayList<>();
        for(Vehicle e : vehicleList){
            expires = dateHelper.isExpiredInsurance(e.getInsuranceDate());
            if (expires == false){
                vehicleExpiredList.add(e);
                System.out.println("The " + e.getOwner()
                        + "'s vehicle plate number is " + e.getPlateNumber()
                        + " and has expired " + e.getInsuranceDate());
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

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            //System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println("The " + entry.getKey()
                    + " has to pay fine " + entry.getValue() * fineCost + "Eyros");
        }
        //System.out.println(frequencyMap.size());
    }

    @Override
    public String toString() {
        return "The " + getOwner()
                + "'s vehicle plate number is " + getPlateNumber()
                + " and expires in " + getInsuranceDate() + "\n";

    }

    public String toString(Vehicle vehicle){
        return "The " + vehicle.getOwner()
                + "'s vehicle plate number is " + vehicle.getPlateNumber()
                + " and expires in " + vehicle.getInsuranceDate();
    }

}
