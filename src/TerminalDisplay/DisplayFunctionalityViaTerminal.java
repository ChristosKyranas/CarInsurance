package TerminalDisplay;

public class DisplayFunctionalityViaTerminal {

    @Override
    public String toString() {
        String display = (new StringBuilder())
                .append("***************************************\n")
                .append("*-------------------------------------*\n")
                .append("*----SELECT FUNCTIONALITY TO PERFORM: *\n")
                .append("*1) Vehicle Insurance Status          *\n")
                .append("*2) Forecoming Expiries               *\n")
                .append("*3) Expiries By Plate                 *\n")
                .append("*-------------------------------------*\n")
                .append("***************************************\n")
                .toString();
        return display;
    }

}
