package exeptionsExample;

/**
 * Created by Dimaster on 02.07.2017.8
 */
public class Main {
    public static void main(String[] args) {
        int inputNum = 0;
        try {
            inputNum = ConsolUtils.getIntFromConsol();
        } catch (FieldInputException e) {
            System.out.println("Input number from 0 to 5");
        }
        System.out.println(inputNum);
    }



}
