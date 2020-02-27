package CarInsuranceUtils.Services;


import CarInsuranceUtils.Enumerations.FunctionalityEnum;
import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Factories.Functionalities.ExpiresDateByPlateFactory;
import CarInsuranceUtils.Factories.Functionalities.FineCalculationFactory;
import CarInsuranceUtils.Factories.Functionalities.ForecomingExpiresFactory;
import CarInsuranceUtils.Factories.Functionalities.InsuranceStatusFactory;
import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Repositories.VehicleRepositoryViaFileImpl;

import java.util.List;

public class FunctionalityPerformance {

    public FunctionalityPerformance(FunctionalityEnum functionalityOption, ImportTypeEnum importOption) {

        /*switch (importOption) {
            case FILE:
                repository = new VehicleRepository();
            case DATABASE:
                //repository = new ...
        }*/
        VehicleRepositoryViaFileImpl repository = new VehicleRepositoryViaFileImpl();
        List<Vehicle> vehicleList = repository.collect();

        switch (functionalityOption) {
            case VEHICLE_INSURANCE_STATUS:
                System.out.println("VEHICLE_INSURANCE_STATUS");
                InsuranceStatus insuranceStatus = InsuranceStatusFactory.getInstance(importOption);
                //via File or via Database
                insuranceStatus.searchPlate(vehicleList);
                break;
            case FORECOMING_EXPIRES:
                System.out.println("FORECOMING_EXPIRIES");
                //via File or via Database
                ForecomingExpires forecomingExpires = ForecomingExpiresFactory.getInstance(importOption);
                forecomingExpires.searchForecomingExpires(vehicleList);
                break;
            case ORDER_VEHICLES:
                System.out.println("ORDER_VEHICLES");
                //via File or via Database
                ExpiresDateByPlate expiresDateByPlate = ExpiresDateByPlateFactory.getInstance(importOption);
                expiresDateByPlate.searchExpiresByPlate(vehicleList);
                break;
            case OWNERS_FINE:
                System.out.println("OWNERS_FINE");
                //via File or via Database
                FineCalculation fineCalculation = FineCalculationFactory.getInstance(importOption);
                fineCalculation.calculateFine(vehicleList);
                break;
        }
    }
}
