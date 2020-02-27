package CarInsuranceUtils.Enumerations;

public enum ImportTypeEnum {

    FILE(1),
    DATABASE(2);

    private final int option;

    ImportTypeEnum(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }

    public static ImportTypeEnum getImportTypeEnum(Integer inputValue) {
        for (ImportTypeEnum value : ImportTypeEnum.values() ){
            if (inputValue.equals(value.getOption())){
                return value;
            }
        }
        //Default Option
        return FILE;
    }
}
