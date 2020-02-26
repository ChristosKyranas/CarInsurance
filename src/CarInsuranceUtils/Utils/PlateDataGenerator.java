package CarInsuranceUtils.Utils;

import nl.flotsam.xeger.Xeger;

import java.util.ArrayList;
import java.util.List;

import static CarInsuranceUtils.Validations.InputPlateValidator.PLATE_NUMBER_FORMAT;


public class PlateDataGenerator {

    public static List<String> createRandomPlates(int number) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String regex = PLATE_NUMBER_FORMAT;
            Xeger generator = new Xeger(regex);
            String result = generator.generate();
            System.out.println(result);
            resultList.add(result);
        }
        return resultList;
    }

    public static List<String> createTaxId(int number) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String regex = "[123456789]{9}";
            Xeger generator = new Xeger(regex);
            String result = generator.generate();
            System.out.println(result);
            resultList.add(result);
        }
        return resultList;
    }

    public static List<String> createExpiryDate(int number) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String regex = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/2020";
            Xeger generator = new Xeger(regex);
            String result = generator.generate();
            System.out.println(result);
            resultList.add(result);
        }
        return resultList;
    }

/*

    public static void main(String[] args) {
        createExpiryDate(100);
    }
*/


}
