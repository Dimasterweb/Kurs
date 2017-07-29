package secondLesson;

/**
 * Created by Dimaster on 12.06.2017.
 */
public class ContinueArray {
    public static void main(String[] args) {
        String text = "Read Java";
        char[] textToChar = text.toCharArray();
        for (int i = 0; i < textToChar.length; i++){
            if (i >= 3 && i < 7){
                continue;
            }
            System.out.println(textToChar[i]);

        }
    }
}
