package CarInsuranceUtils.Display.ViaConsole;

public class CarInsuranceIntroDisplay {

    public CarInsuranceIntroDisplay() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String display = (new StringBuilder())
                .append("***************************************\n")
                .append("*-------------------------------------*\n")
                .append("*               WELCOME               *\n")
                .append("*            CAR INSURANCE            *\n")
                .append("*     Powered by Christos Kyranas     *\n")
                .append("*-------------------------------------*\n")
                .append("***************************************\n")
                .toString();
        return display;
    }
}
