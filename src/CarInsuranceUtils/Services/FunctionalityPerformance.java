package CarInsuranceUtils.Services;

import CarInsuranceUtils.Enumerations.ExportTypeEnum;
import CarInsuranceUtils.Enumerations.FunctionalityEnum;
import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Factories.Functionalities.ExpiresDateByPlateFactory;
import CarInsuranceUtils.Factories.Functionalities.FineCalculationFactory;
import CarInsuranceUtils.Factories.Functionalities.UpcomingExpiresFactory;
import CarInsuranceUtils.Factories.Functionalities.InsuranceStatusFactory;
import CarInsuranceUtils.Factories.Repository.VehicleRepositoryFactory;
import CarInsuranceUtils.Models.Vehicle;
import CarInsuranceUtils.Repositories.VehicleRepository;
import CarInsuranceUtils.Factories.Exports.ResultsFactory;

import java.util.List;

public class FunctionalityPerformance {

    public FunctionalityPerformance(FunctionalityEnum functionalityOption, ImportTypeEnum importOption, ExportTypeEnum exportOption) {

        VehicleRepository repository = VehicleRepositoryFactory.getInstance(importOption);
        List<Vehicle> vehicleList = repository.collect();

        switch (functionalityOption) {
            case VEHICLE_INSURANCE_STATUS:
                System.out.println("VEHICLE_INSURANCE_STATUS");
                //InsuranceStatus insuranceStatus = InsuranceStatusFactory.getInstance(importOption);
                InsuranceStatus insuranceStatus = InsuranceStatusFactory.getInstance(importOption);
                //via File or via Database
                ResultsFactory.getInstance(insuranceStatus.searchPlate(vehicleList), exportOption);
                break;
            case UPCOMING_EXPIRES:
                System.out.println("UPCOMING_EXPIRES");
                //UpcomingExpires upcomingExpires = UpcomingExpiresFactory.getInstance(importOption);
                UpcomingExpires upcomingExpires = UpcomingExpiresFactory.getInstance(importOption);
                //via File or via Database
                ResultsFactory.getInstance(upcomingExpires.searchUpcomingExpires(vehicleList), exportOption);
                break;
            case ORDER_VEHICLES:
                System.out.println("ORDER_VEHICLES");
                //ExpiresDateByPlate expiresDateByPlate = ExpiresDateByPlateFactory.getInstance(importOption);
                ExpiresDateByPlate expiresDateByPlate = ExpiresDateByPlateFactory.getInstance(importOption);
                //via File or via Database
                ResultsFactory.getInstance(expiresDateByPlate.searchExpiresByPlate(vehicleList), exportOption);
                break;
            case OWNERS_FINE:
                System.out.println("OWNERS_FINE");
                //FineCalculation fineCalculation = FineCalculationFactory.getInstance(importOption);
                FineCalculation fineCalculation = FineCalculationFactory.getInstance(importOption);
                //via File or via Database
                ResultsFactory.getInstance(fineCalculation.calculateFine(vehicleList), exportOption);
                break;
        }
    }
}
