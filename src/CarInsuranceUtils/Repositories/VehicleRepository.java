package CarInsuranceUtils.Repositories;

import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Utils.CSVManagement.CSVFileReader;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {

    public static List<Vehicle> collect(){

        CSVFileReader parsedData = new CSVFileReader();

        List<Vehicle> vehicleList = new ArrayList<>();

        String data[][] = parsedData.readCSV();

        for(int i = 0; i < data.length; i++){
            if (data[i][0] != null && data[i][1] != null && data[i][2] != null){
                Vehicle vehicle = new Vehicle();
                vehicle.setPlateNumber(data[i][0]);
                vehicle.setOwner(Integer.parseInt(data[i][1]));
                vehicle.setInsuranceDate(data[i][2]);
                vehicleList.add(vehicle);
                //System.out.println("Example: " + vehicle.getPlateNumber() + " " + vehicle.getOwner() + " " + vehicle.getInsuranceDate());
            }
        }

        //System.out.println(vehicleList);
        return vehicleList;
    }

    /*public static void main(String[] args) {
        collect();
    }*/
}
