import TerminalDisplay.DisplayExportTypeViaTerminal;
import TerminalDisplay.DisplayFunctionalityViaTerminal;
import TerminalDisplay.DisplayIntroCarInsuranceStatus;

public class CarInsuranceApp {

    public static void main(String[] args) {

        DisplayIntroCarInsuranceStatus diplayIntro = new DisplayIntroCarInsuranceStatus();
        System.out.println(diplayIntro.toString());
        DisplayFunctionalityViaTerminal displayFunctionality = new DisplayFunctionalityViaTerminal();
        System.out.println(displayFunctionality.toString());
        DisplayExportTypeViaTerminal displayExportType = new DisplayExportTypeViaTerminal();
        System.out.println(displayExportType.toString());

    }
}
