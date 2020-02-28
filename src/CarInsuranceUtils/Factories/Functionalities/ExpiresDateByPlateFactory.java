package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.ExpiresDateByPlate;
import CarInsuranceUtils.Services.Functionalities.ExpiresDateByPlateImpl;

public class ExpiresDateByPlateFactory {

    public static ExpiresDateByPlate getInstance(ImportTypeEnum importOption) {

        switch (importOption) {
            case FILE:
                return new ExpiresDateByPlateImpl();
            case DATABASE:
                return null;
        }
        return null;

    }

}
