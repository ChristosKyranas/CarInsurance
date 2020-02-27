package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.FineCalculation;
import CarInsuranceUtils.Services.Functionalities.ExpiresDateByPlateViaFileImpl;
import CarInsuranceUtils.Services.Functionalities.FineCalculationViaFileImpl;

public class FineCalculationFactory {

    public static FineCalculation getInstance(ImportTypeEnum importOption){

        switch (importOption) {
            case FILE:
                return new FineCalculationViaFileImpl();
            case DATABASE:
                return null;
        }
        return null;


    }

}
