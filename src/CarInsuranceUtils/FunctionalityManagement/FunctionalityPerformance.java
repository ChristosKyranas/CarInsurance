package CarInsuranceUtils.FunctionalityManagement;


import CarInsuranceUtils.Enumerations.FunctionalityEnum;

public class FunctionalityPerformance {

    public FunctionalityPerformance(FunctionalityEnum functionalityOption) {

        switch (functionalityOption) {
            case VEHICLE_INSURANCE_STATUS:
                System.out.println("VEHICLE_INSURANCE_STATUS");

                break;
            case FORECOMING_EXPIRIES:
                System.out.println("FORECOMING_EXPIRIES");

                break;
            case OWNERS_FINE:
                System.out.println("OWNERS_FINE");

                break;

        }
    }
}
