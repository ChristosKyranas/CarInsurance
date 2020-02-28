package CarInsuranceUtils.Factories;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Repositories.VehicleRepository;
import CarInsuranceUtils.Repositories.VehicleRepositoryViaDatabaseImpl;
import CarInsuranceUtils.Repositories.VehicleRepositoryViaFileImpl;

public class VehicleRepositoryFactory {

    public static VehicleRepository getInstance(ImportTypeEnum importOption){
        switch (importOption) {
            case FILE:
                return new VehicleRepositoryViaFileImpl();
            case DATABASE:
                return new VehicleRepositoryViaDatabaseImpl();
        }
        return null;
    }

}
