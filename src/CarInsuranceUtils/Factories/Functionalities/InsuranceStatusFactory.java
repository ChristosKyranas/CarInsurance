package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.Functionalities.InsuranceStatusImpl;
import CarInsuranceUtils.Services.InsuranceStatus;


public class InsuranceStatusFactory {

    public static InsuranceStatus getInstance(ImportTypeEnum importOption) {

        switch (importOption) {
            case FILE:
                return new InsuranceStatusImpl();
            case DATABASE:
                return null;
        }
        return null;
    }
}
