package CarInsuranceUtils.FunctionalityManagement;


import CarInsuranceUtils.Enumerations.FunctionalityEnum;
import CarInsuranceUtils.FunctionalityManagement.Functionalities.VehicleInsuranceStatus;

public class FunctionalityPerformance {

    public FunctionalityPerformance(FunctionalityEnum functionalityOption) {


        switch (functionalityOption) {
            case VEHICLE_INSURANCE_STATUS:
                System.out.println("VEHICLE_INSURANCE_STATUS");
                //Do smt
                new VehicleInsuranceStatus();
                break;
            case FORECOMING_EXPIRIES:
                System.out.println("FORECOMING_EXPIRIES");
                //Do smt
                break;
            case OWNERS_FINE:
                System.out.println("OWNERS_FINE");
                //Do smt
                break;
        }
    }
}
