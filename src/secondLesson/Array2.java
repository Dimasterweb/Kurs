package secondLesson;

/**
 * Created by Dimaster on 12.06.2017.
 */
public class Array2 {
    public static void main(String[] args) {
        String text = "Read Java";
        char[] array = text.toCharArray();
        for (int i = 0;i < array.length; i++){
            if (array[i] == 'a' || array[i] == 'e'){
                array[i] = '!';
            }
        }

        for (int i = 0; i < array.length; i++){
           System.out.println(array[i]);
      }
    }
}
