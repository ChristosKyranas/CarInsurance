package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.Functionalities.InsuranceStatusViaFileImpl;
import CarInsuranceUtils.Services.InsuranceStatus;


public class InsuranceStatusFactory {

    public static InsuranceStatus getInstance(ImportTypeEnum importOption) {

        switch (importOption) {
            case FILE:
                return new InsuranceStatusViaFileImpl();
            case DATABASE:
                return null;
        }
        return null;
    }
}
