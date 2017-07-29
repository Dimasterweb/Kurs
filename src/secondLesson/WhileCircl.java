package secondLesson;

/**
 * Created by Dimaster on 12.06.2017.
 */
public class WhileCircl {
    public static void main(String[] args) {
        String text = "hu bhukbh vgjyvyt";
        char[] textToChar = text.toCharArray();
        for (int i = 0; i < textToChar.length; i++){
            System.out.println(textToChar[i]);
            if (textToChar[i] == ' '){
                break;
            }
        }

//        System.out.println("-----------------------------------");
//        int i = 0;
//        while (i < textToChar.length){
//            System.out.println(textToChar[i]);
//            i++;
//        }
//        int q = 10;
//        do{
//            System.out.println("cfdfgd");
//        }while (q < 5 );
//
//        while (true){
//            System.out.println("dfd");
//        }
    }
}
