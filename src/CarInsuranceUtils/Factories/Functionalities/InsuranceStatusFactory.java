package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.FunctionalitiesImplementations.InsuranceStatusImpl;
import CarInsuranceUtils.Services.InsuranceStatus;
import org.jetbrains.annotations.NotNull;


public class InsuranceStatusFactory {

    public static InsuranceStatus getInstance(@NotNull ImportTypeEnum importOption) {

        switch (importOption) {
            case FILE:
            case DATABASE:
                return new InsuranceStatusImpl();
        }
        return null;
    }
}
