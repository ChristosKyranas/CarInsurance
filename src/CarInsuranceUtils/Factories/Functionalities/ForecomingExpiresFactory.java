package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.FineCalculation;
import CarInsuranceUtils.Services.ForecomingExpires;
import CarInsuranceUtils.Services.Functionalities.FineCalculationViaFileImpl;
import CarInsuranceUtils.Services.Functionalities.ForecomingExpiresViaFileImpl;

public class ForecomingExpiresFactory {

        public static ForecomingExpires getInstance(ImportTypeEnum importOption){

            switch (importOption) {
                case FILE:
                    return new ForecomingExpiresViaFileImpl();
                case DATABASE:
                    return null;
            }
            return null;


    }

}
