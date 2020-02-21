package TerminalDisplay;

import Validations.validationInputOption;

import java.util.Scanner;

public class Display {


    public void start(){

        //Display The Intro
        new DisplayIntroCarInsuranceStatus();

        //Display Functionality Options
        new DisplayFunctionalityViaTerminal();

        validationInputOption input = new validationInputOption();

        //Read User's Functionality Option
        int fuctionalityOption = input.fetchAndCheckBoundsValidation(1, 3);

        //Display Export Type Options
        new DisplayExportTypeViaTerminal();

        //Read User's ExportType Option
        int exportTypeOption = input.fetchAndCheckBoundsValidation(1, 2);
        System.out.println("Your Functionality Option is: "+ fuctionalityOption + "\n"
                + "Your ExportType Option is: "+ exportTypeOption +"\n");
    }

}
