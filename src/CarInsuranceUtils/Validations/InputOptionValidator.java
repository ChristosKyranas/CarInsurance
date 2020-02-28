package CarInsuranceUtils.Validations;

import java.util.Scanner;

public class InputOptionValidator {

    //check the inputOption's bounds and return if correct
    public static int fetchAndCheckBoundsValidation(int lowLimit, int upperLimit){

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
            if(input >= lowLimit && input <= upperLimit){
                return input;
            }
            else{
                System.out.println("Your Input Out Of Bounds\n"
                                + "Give Your Option Again");
                fetchAndCheckBoundsValidation(lowLimit, upperLimit);
            }
            return input;
    }
}
