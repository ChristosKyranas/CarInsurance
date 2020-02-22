package CarInsuranceUtils.Utils.CSVManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CVSFileWriter {

    //maybe add as parameter the filename
    private static String CSV_FILE = "VehicleExport.csv";

    public static void writeToCsvFile(String response) {

        try {
            //Save The Exported File In The "src/Exportions" Directory
            File dir = new File("src/Exportions");
            FileWriter writer = new FileWriter(new File(dir,CSV_FILE));
            writer.append(response);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    public static void main(String[] args) {
        writeToCsvFile("hello world");
    }
*/

}
