package CarInsuranceUtils.Display.ViaConsole;

import CarInsuranceUtils.Enumerations.FunctionalityEnum;
import CarInsuranceUtils.Enumerations.ImportTypeEnum;
import CarInsuranceUtils.Services.FunctionalityPerformance;
import CarInsuranceUtils.Validations.InputOptionValidator;

public class AppConsoleDisplay {

    public void start(){

        //Display The Intro
        new CarInsuranceIntroDisplay();

        //Display Functionality Options
        new FunctionalityViaConsoleDisplay();


        //Create an InputOption Validator
        InputOptionValidator input = new InputOptionValidator();

        //Read User's Functionality Option
        int fuctionalityOption = input.fetchAndCheckBoundsValidation(1, 4);

        //Display ImportDataSource Options
        new ImportDataSourceViaConsoleDisplay();

        //Read User's Import Option
        int importOption = input.fetchAndCheckBoundsValidation(1, 2);
        new FunctionalityPerformance(FunctionalityEnum.getFunctionalityEnum(fuctionalityOption), ImportTypeEnum.getImportTypeEnum(importOption));

        //Display Export Type Options
        new ExportTypeViaConsoleDisplay();

        //Read User's Export Type Option
        int exportTypeOption = input.fetchAndCheckBoundsValidation(1, 2);

        System.out.println("Your Functionality Option is: "+ fuctionalityOption + "\n"
                + "Your ExportType Option is: "+ exportTypeOption +"\n");
    }

}
