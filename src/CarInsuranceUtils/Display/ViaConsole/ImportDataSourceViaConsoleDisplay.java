package CarInsuranceUtils.Display.ViaConsole;

public class ImportDataSourceViaConsoleDisplay {

    public ImportDataSourceViaConsoleDisplay() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String display = (new StringBuilder())
                .append("***************************************\n")
                .append("*-------------------------------------*\n")
                .append("*----ENTER DATA SOURCE:               *\n")
                .append("*1) File                              *\n")
                .append("*2) Database                          *\n")
                .append("*-------------------------------------*\n")
                .append("***************************************\n")
                .toString();
        return display;
    }

}
