package Validations;

import java.util.Scanner;

public class validationInputOption {

    boolean inputValid;
    Scanner scan = new Scanner(System.in);
    int input;

    public int fetchAndCheckBoundsValidation(int lowLimit, int upperLimit){
        input = scan.nextInt();
        inputValid = false;
        do {
            if(input >= lowLimit && input <= upperLimit){
                inputValid = true;
                return input;
            }
            else{
                System.out.println("Your Input Out Of Bounds\n"
                                + "Give Your Option Again");
                fetchAndCheckBoundsValidation(lowLimit, upperLimit);
            }
        }while (inputValid = true);
        return input;
    }
}
