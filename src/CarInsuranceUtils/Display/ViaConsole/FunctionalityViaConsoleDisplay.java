package CarInsuranceUtils.Display.ViaConsole;

public class FunctionalityViaConsoleDisplay {

    public FunctionalityViaConsoleDisplay() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String display = (new StringBuilder())
                .append("***************************************\n")
                .append("*-------------------------------------*\n")
                .append("*----SELECT FUNCTIONALITY TO PERFORM: *\n")
                .append("*1) Vehicle Insurance Status          *\n")
                .append("*2) Forecoming Expiries               *\n")
                .append("*3) Expiries By Plate (Ordered)       *\n")
                .append("*4) Fine Calculation                  *\n")
                .append("*-------------------------------------*\n")
                .append("***************************************\n")
                .toString();
        return display;
    }

}
