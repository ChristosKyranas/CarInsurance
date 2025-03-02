package CarInsuranceUtils.Display.ViaConsole;

public class ExportTypeViaConsoleDisplay {

    public ExportTypeViaConsoleDisplay() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String display = (new StringBuilder())
                .append("***************************************\n")
                .append("*-------------------------------------*\n")
                .append("*----ENTER EXPORT TYPE:               *\n")
                .append("*1) File                              *\n")
                .append("*2) Console                           *\n")
                .append("*-------------------------------------*\n")
                .append("***************************************\n")
                .toString();
        return display;
    }

}
