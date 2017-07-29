package secondLesson.SecondHomework;

/**
 * Created by Dimaster on 16.06.2017.*
 */
public class Homework5 {
    public static void main(String[] args) {
//       repleasChars();
        char[] charFrom = {'a', 'b', 'c', 'd'};
        char[] charToo = {'q', 'w', 'e', 'r'};
        repleasChars2("Are you ready to start studying of programming?",charFrom,charToo);
    }
    public static void repleasChars (){
        String text = "Are you ready to start studying of programming?";
        char[] array1 = text.toCharArray();
        for (int i = 0; i < array1.length; i++){
            if (array1[i] == 'a' || array1[i] == 'A'){
                array1[i] = 'q';
            } else if (array1[i] == 'b'){
                array1[i] = 'w';
            } else if (array1[i] == 'c'){
                array1[i] = 'e';
            } else if (array1[i] == 'd'){
                array1[i] = 'r';
            }
            System.out.print(array1[i]);
        }
    }

    public static void repleasChars2 (String text, char[]charFrom, char[] charToo){
        if (charFrom.length != charToo.length){
            System.out.println("charFrom.length must == charToo.length");
            return;
        }

        String textLower = text.toLowerCase();
        char[] textChars = textLower.toCharArray();
        for (int i = 0; i < textChars.length; i++){
           char currentchar = textChars[i];
           for (int j = 0; j < charFrom.length; j++){
               char currentcharFrom = charFrom[j];
               if (currentchar == currentcharFrom){
                   textChars[i] = charToo[j];
               }
           }
        }
        Homework1.printArrayOfChars(textChars);
    }
}
