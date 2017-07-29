package FourLesson;

/**
 * Created by Dimaster on 20.06.2017.*
 */
public class StringBufferExample {
    public static void main(String[] args) {
        String text1 = "qwe12qwe345qwe78qwe46";
        String text2 = "qwe";
        StringBuffer text = new StringBuffer(text1);
        for (int i = -1;(i = text.toString().indexOf(text2))>=0;){
            text.delete(i, i + text2.length());
        }
        text1 = text.toString();
        System.out.println(text1);
    }
}
