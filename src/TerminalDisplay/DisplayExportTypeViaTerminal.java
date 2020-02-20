package TerminalDisplay;

public class DisplayExportTypeViaTerminal {

    @Override
    public String toString() {
        String display = (new StringBuilder())
                .append("***************************************\n")
                .append("*-------------------------------------*\n")
                .append("*----ENTER EXPORT TYPES:              *\n")
                .append("*1) File                              *\n")
                .append("*2) Console                           *\n")
                .append("*-------------------------------------*\n")
                .append("***************************************\n")
                .toString();
        return display;
    }

}
