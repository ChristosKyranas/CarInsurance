package CarInsuranceUtils.Factories.Functionalities;

import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.UpcomingExpires;
import CarInsuranceUtils.Services.FunctionalitiesImplementations.UpcomingExpiresImpl;

public class UpcomingExpiresFactory {
        //return instance of upcomingExpiresImpl
        public static UpcomingExpires getInstance(ImportTypeEnum importOption){

            switch (importOption) {
                case FILE:
                case DATABASE:
                    return new UpcomingExpiresImpl();
            }
            return null;


    }

}
