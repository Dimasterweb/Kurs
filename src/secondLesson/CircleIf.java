package secondLesson;

/**
 * Created by Dimaster o* 12.06.2017.
 */
public class CircleIf {
    public static void main(String[] args) {
        int ocenka = 59;
//
//        if (ocenka < 2 || ocenka > 5 ){
//            System.out.println("Uncurrent input value");
//            return;
//        }
        if (ocenka == 2){
            System.out.println("Neud");
        } else if (ocenka == 3){
            System.out.println("Bad");
        } else if (ocenka == 4){
            System.out.println("Norm");
        } else if (ocenka == 5){
            System.out.println("Verywell");
        } else {
            System.out.println("Uncurrent input value");
        }


    }
}
