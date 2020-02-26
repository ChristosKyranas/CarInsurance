package CarInsuranceUtils.Validations;

import CarInsuranceUtils.Factories.InputValidator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputPlateValidator {

    public static final String PLATE_NUMBER_FORMAT = "[ABCDEFGHIJKLMNOPQRSTUVWXYZ]{3}-[0123456789]{4}";

    public static boolean validatePlateNumber(String plateNumber) {

        final Pattern pattern = Pattern.compile(PLATE_NUMBER_FORMAT);
        if (!pattern.matcher(plateNumber).matches()) {
            return false;
        }
        return true;
    }

/*

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String plate = scan.nextLine();
        if (!validatePlateNumber(plate)) System.out.println("Wrong Format");

    }
*/

}