package secondLesson;

/**
 * Created by Dimaster on 12.06.2017.
 */
public class Array {
    public static void main(String[] args) {
        int[] ocenki = new int[12];
//        ocenki[0] = 1;
//        ocenki[1] = 2;
//        ocenki[2] = 3;
//        ocenki[3] = 4;
//        ocenki[4] = 5;
//        ocenki[5] = 6;
//        ocenki[6] = 7;
//        ocenki[7] = 8;
//        ocenki[8] = 9;
//        ocenki[9] = 10;
//        ocenki[10] = 11;
//        ocenki[11] = 12;
        for (int i = 1; i <= 12; i++){
            ocenki[i - 1] = i;
        }
        for (int i = 0; i < ocenki.length; i++){
            System.out.println(ocenki[i]);
        }


    }
}
