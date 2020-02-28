package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.ExpiresDateByPlate;
import CarInsuranceUtils.Services.FunctionalitiesImplementations.ExpiresDateByPlateImpl;

public class ExpiresDateByPlateFactory {

    public static ExpiresDateByPlate getInstance(ImportTypeEnum importOption) {

        switch (importOption) {
            case FILE:
            case DATABASE:
                return new ExpiresDateByPlateImpl();
        }
        return null;

    }

}
