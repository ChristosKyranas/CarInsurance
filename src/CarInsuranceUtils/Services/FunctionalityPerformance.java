package CarInsuranceUtils.Services;


import CarInsuranceUtils.Enumerations.FunctionalityEnum;
import CarInsuranceUtils.Services.Functionalities.ExpiriesDateByPlateViaFile;
import CarInsuranceUtils.Services.Functionalities.FineCalculationViaFile;
import CarInsuranceUtils.Services.Functionalities.ForecomingExpiresViaFile;
import CarInsuranceUtils.Services.Functionalities.VehicleInsuranceStatusViaFile;

public class FunctionalityPerformance {

    public FunctionalityPerformance(FunctionalityEnum functionalityOption) {

        switch (functionalityOption) {
            case VEHICLE_INSURANCE_STATUS:
                System.out.println("VEHICLE_INSURANCE_STATUS");
                //Do smt
                new VehicleInsuranceStatusViaFile();
                break;
            case FORECOMING_EXPIRIES:
                System.out.println("FORECOMING_EXPIRIES");
                //Do smt
                new ForecomingExpiresViaFile();
                break;
            case ORDER_VEHICLES:
                System.out.println("ORDER_VEHICLES");
                //Do smt
                new ExpiriesDateByPlateViaFile();
                break;
            case OWNERS_FINE:
                System.out.println("OWNERS_FINE");
                //Do smt
                new FineCalculationViaFile();
                break;
        }
    }
}
