package exeptionsExample;

import java.util.Scanner;

/**
 * Created by Dimaster on 02.07.2017.7
 */
public class ConsolUtils {

    public static int getIntFromConsol() throws FieldInputException{
        System.out.println("Input number from 0 to 5");
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();

        int num = 0;
        try{
            num  = Integer.parseInt(inputLine);
            if (num < 0 || num > 5){
                throw new FieldInputException("num must be from 0 to 5");
            }
        }catch (NumberFormatException e){
            System.out.println("Vi vveli ne chislo");
            num = ConsolUtils.getIntFromConsol();
        }

        return num;
    }
}
