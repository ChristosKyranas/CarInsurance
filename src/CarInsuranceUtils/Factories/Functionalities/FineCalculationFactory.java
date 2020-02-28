package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.FineCalculation;
import CarInsuranceUtils.Services.Functionalities.FineCalculationImpl;

public class FineCalculationFactory {

    public static FineCalculation getInstance(ImportTypeEnum importOption){

        switch (importOption) {
            case FILE:
            case DATABASE:
                return new FineCalculationImpl();
        }
        return null;


    }

}
