package CarInsuranceUtils.Factories.Exports;

import CarInsuranceUtils.Enumerations.ExportTypeEnum;
import CarInsuranceUtils.Utils.CSVManagement.CVSFileWriter;
import org.jetbrains.annotations.NotNull;

public class ResultsFactory {

    public static void getInstance(String results, @NotNull ExportTypeEnum exportOption){
        switch (exportOption) {
            case FILE:
                CVSFileWriter.writeToCsvFile(results);
            case CONSOLE:
                System.out.println(results);
        }
    }


}
