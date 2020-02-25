package CarInsuranceUtils.Display.ViaConsole;

public class ImportTypeViaConsoleDisplay {

    public ImportTypeViaConsoleDisplay() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String display = (new StringBuilder())
                .append("***************************************\n")
                .append("*-------------------------------------*\n")
                .append("*----ENTER IMPORT TYPE:               *\n")
                .append("*1) File                              *\n")
                .append("*2) Database                          *\n")
                .append("*-------------------------------------*\n")
                .append("***************************************\n")
                .toString();
        return display;
    }

}
