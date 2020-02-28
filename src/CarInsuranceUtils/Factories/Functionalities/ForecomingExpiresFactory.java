package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.ForecomingExpires;
import CarInsuranceUtils.Services.Functionalities.ForecomingExpiresImpl;

public class ForecomingExpiresFactory {

        public static ForecomingExpires getInstance(ImportTypeEnum importOption){

            switch (importOption) {
                case FILE:
                    return new ForecomingExpiresImpl();
                case DATABASE:
                    return null;
            }
            return null;


    }

}
