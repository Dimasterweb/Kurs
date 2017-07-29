package secondLesson.SecondHomework;



/**
 * Created by Dimaster on 13.06.2017.*
 */
public class Homework2 {
    public static void main(String[] args) {
        char[] array1 = {'a','b','c','d'};
        char[] array2 = {'q','w','e','r'};
//        sumArrayOfChars(array2,array1);
        char[] r = sumArrayOfChars2(array1,array2);
        Homework1.printArrayOfChars(r);
    }
    public static char[] sumArrayOfChars (char[] a, char[] b){
        char[] array3 = new char[8];
        for (int i = 0, j = 0; i < a.length; i++, j++){
            array3[j] = a[i];
        }
        for (int i = 0, j = 4; i < b.length; i++,j++){
            array3[j] = b[i];
        }
       Homework1.printArrayOfChars(array3);
        return array3;
    }

    public static char[] sumArrayOfChars2 (char[] a, char[] b){
        char[] result = new char[a.length + b.length];
        for (int i = 0; i < a.length; i++){
            result[i] = a[i];
        }
        for (int i =0; i < b.length; i++){
            result[i + a.length] = b[i];
        }
        return result;
    }
}
