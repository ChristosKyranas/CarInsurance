package CarInsuranceUtils.Enumerations;

public enum FunctionalityEnum {

    VEHICLE_INSURANCE_STATUS(1),
    FORECOMING_EXPIRIES(2),
    ORDER_VEHICLES(3),
    OWNERS_FINE(4);

    private final int option;

    FunctionalityEnum(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }

    public static FunctionalityEnum getFunctionalityEnum(Integer inputValue) {
        for (FunctionalityEnum value : FunctionalityEnum.values() ){
            if (inputValue.equals(value.getOption())){
                return value;
            }
        }
        //Default Option
        return VEHICLE_INSURANCE_STATUS;
    }
}
