package FourLesson;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dimaster on 25.06.2017.*
 */
public class HomeWorkReg {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
//        Matcher matcher = pat.matcher(str);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
//    }
    private static void regularExpression(Scanner sc){
        System.out.print("Enter your line : ");
        String str = sc.nextLine();
        Pattern regularExpression = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Matcher matcher = regularExpression.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        regularExpression(sc);
    }
}

