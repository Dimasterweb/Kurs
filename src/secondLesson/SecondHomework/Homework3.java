package secondLesson.SecondHomework;

/**
 * Created by Dimaster on 16.06.2017.*
 */
public class Homework3 {
    public static void main(String[] args) {
        char[] array1 = {'a','b','c','d'};
        char[] ar = reversArrayOfChars(array1);
        Homework1.printArrayOfChars(ar);

    }


    public static char[] reversArrayOfChars (char[] arr){
        char[] array2 = new char[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--){
            array2[i] = arr[j];
        }
        return array2;
    }
}
