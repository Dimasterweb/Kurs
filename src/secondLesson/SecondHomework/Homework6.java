package secondLesson.SecondHomework;

/**
 * Created by Dimaster on 16.06.2017.*
 */
public class Homework6 {
    public static void main(String[] args) {
        int[] array1 = new int[101];
        fellArray(array1,90);
        int delitel = 7;
        dell3(array1,delitel);
    }
    public static void del3 (){
        int k = 3;
        int[] array1 = new int[101];
        double[] array2 = new double[101];
        for (int i = 0; i < array1.length; i++){
            array1[i] = i + 1;
            array2[i] = (double)array1[i] / k;
            System.out.println(array2[i]);
        }
    }
    public static void dell3 (int[] array, int delitel){
        int[] result = new int[(array.length / delitel) + 1];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % delitel == 0){
                result[j] = array[i];
                j++;
            }
        }
        Homework1.printArrayOfInteger(result);
    }
    public static void fellArray (int[] ar, int fromNumber){
        for (int i = 0; i < ar.length; i ++){
            ar[i] = fromNumber++;
        }
    }
}
