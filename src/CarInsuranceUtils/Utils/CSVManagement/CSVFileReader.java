package CarInsuranceUtils.Utils.CSVManagement;

import java.io.*;

public class CSVFileReader {

    //------------------------------------------------------------
    //Be Careful With File's Path
    //------------------------------------------------------------
    private static String CSV_FILE = "Resources/CSV/VehiclesData.csv";
    public static int MAX_ARRAY_ROW_SIZE = 110;
    public static int MAX_ARRAY_COLUMN_SIZE = 5;

    public static String[][] readCSV() {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        String[][] parsedVehiclesData = new String[MAX_ARRAY_ROW_SIZE][MAX_ARRAY_COLUMN_SIZE];
        try {
            br = new BufferedReader(new FileReader(getFileResource()));
            //System.out.println("Get this file" + br +"\n");
            int rowCount = 0;
            while ((line = br.readLine()) != null) {
                //Separate The Line From Commas
                parsedVehiclesData[rowCount] = line.split(cvsSplitBy);
                rowCount++;
                //System.out.println("Row: " + rowCount + " with data: " + line + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return parsedVehiclesData;
        }

    }

    private static File getFileResource() {
        ClassLoader classLoader = CSVFileReader.class.getClassLoader();
        //System.out.println("here what?" + classLoader.getResource(CSV_FILE) + "\n");
        return new File(classLoader.getResource(CSV_FILE).getFile());
    }

    public static void main(String[] args) {
        readCSV();
    }
}