package FourLesson;

import java.util.Scanner;

/**
 * Created by Dimaster on 20.06.2017.*
 */
public class StringsUtils {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сколько отработано лет ");
        String inputLine = sc.nextLine();
        double inputNumber = Double.parseDouble(inputLine);
        int sumHolidays = (int)(inputNumber * 12);
        System.out.println("У Вас отгулов " + sumHolidays);
    }
}
