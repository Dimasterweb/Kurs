package secondLesson;

/**
 * Created by Dimaster on 12.06.2017.
 */
public class CirclFor {

    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("Pusk");
        for (int i = 0; i <= 100; i = i + 2){
            System.out.println(i);
        }
        int result = 0;
        for (int i = 1000; i <= 1200; i++){
            result = result + i;
        }
        System.out.println(result);
    }
}
