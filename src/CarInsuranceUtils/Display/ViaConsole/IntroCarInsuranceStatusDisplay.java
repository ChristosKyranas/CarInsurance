package CarInsuranceUtils.Display.ViaConsole;

public class IntroCarInsuranceStatusDisplay {

    public IntroCarInsuranceStatusDisplay() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String display = (new StringBuilder())
                .append("***************************************\n")
                .append("*-------------------------------------*\n")
                .append("*               WELCOME               *\n")
                .append("*            CAR INSURANCE            *\n")
                .append("*-------------------------------------*\n")
                .append("***************************************\n")
                .toString();
        return display;
    }
}
