package CarInsuranceUtils.Display.ViaConsole;

import CarInsuranceUtils.Enumerations.ExportTypeEnum;
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

        //Read User's Functionality Option
        int functionalityOption = InputOptionValidator.fetchAndCheckBoundsValidation(1, 4);

        //Display ImportDataSource Options
        new ImportDataSourceViaConsoleDisplay();

        //Read User's Import Option
        int importOption = InputOptionValidator.fetchAndCheckBoundsValidation(1, 2);

        //Display Export Type Options
        new ExportTypeViaConsoleDisplay();

        //Read User's Export Type Option
        int exportOption = InputOptionValidator.fetchAndCheckBoundsValidation(1, 2);

        new FunctionalityPerformance(FunctionalityEnum.getFunctionalityEnum(functionalityOption), ImportTypeEnum.getImportTypeEnum(importOption), ExportTypeEnum.getExportTypeEnum(exportOption));

        System.out.println("Your Functionality Option is: "+ functionalityOption + "\n"
                + "Your ExportType Option is: "+ exportOption +"\n");
    }

}
