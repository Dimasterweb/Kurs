package methodsForArrays;

/**
 * Created by Dimaster on 20.06.2017.*
 */
public class FillingArrays {
    public static void fillingArray (int[] array, int fromNumber){
        for (int i = 0; i < array.length; i++){
            array[i] = fromNumber++;
        }
    }
    public static void fillingArray (double[] array, double fromNumber){
        for (int i = 0; i < array.length; i++){
            array[i] = fromNumber++;
        }
    }
    public static void fillingArray (String[] arraytext){
        for (int i = 0; i < arraytext.length; i++){
            arraytext[i] = "jhtrhjt" + i;
        }
    }
    public static void fillingArray (char[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = (char) (122 + i);

        }
    }

    public static void main(String[] args) {
       char[] array = new char[15];
       fillingArray(array);
       PrintArrays.printArray(array);
       PrintArrays utils = new PrintArrays();



    }

}
