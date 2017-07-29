package secondLesson.SecondHomework;

/**
 * Created by Dimaster on 16.06.2017.*
 */
public class Homework4 {
    public static void main(String[] args) {
        String text = "У меня все хорошо, замечательно, у меня все - получается!";
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length; i++){
            if (array[i] == ',' || array[i] == '-' || array[i] == '!'){
                array[i] = ' ';
            }
            System.out.print(array[i]);
        }
    }
}
