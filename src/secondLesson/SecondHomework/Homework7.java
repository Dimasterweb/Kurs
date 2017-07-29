package secondLesson.SecondHomework;

/**
 * Created by Dimaster on 18.06.2017.*
 */
public class Homework7 {
    public static void main(String[] args) {
        int[] a = new int[100];
        Homework6.fellArray(a,1);
        int[] result = sum3Index(a);
        Homework1.printArrayOfInteger(result);

    }
    public static int[] sum3Index (int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            if (i == 0){
                b[i] = a[i] + a[i +1];
            }else if (i == a.length - 1){
                b[i] = a[i] + a[i-1];
            } else{
                b[i] = a[i] + a[i+1] + a[i-1];
            }

        }
        return b;
    }
}
