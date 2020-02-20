package TerminalDisplay;

public class DisplayIntroCarInsuranceStatus {

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
