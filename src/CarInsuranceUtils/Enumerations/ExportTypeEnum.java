package CarInsuranceUtils.Enumerations;

public enum ExportTypeEnum {

    FILE(1),
    CONSOLE(2);

    private final int option;

    ExportTypeEnum(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }

    public static ExportTypeEnum getExportTypeEnum(Integer inputValue) {
        for (ExportTypeEnum value : ExportTypeEnum.values() ){
            if (inputValue.equals(value.getOption())){
                return value;
            }
        }
        //Default Option
        return FILE;
    }
}
