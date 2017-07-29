package stringUtils;

import java.util.Scanner;

/**
 * Created by Admin on 07.07.2017.8
 */
public class StringUtils implements IStringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }

        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 not a number");
        }

        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 not a number");
        }


        if (num2 == 0) {
            throw new ArithmeticException("num2 cant be 0");
        }

        return num1/num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
