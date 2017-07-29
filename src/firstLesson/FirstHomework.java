package firstLesson;

/**
 * Created by Dimaster on 11.06.2017.*
 */
public class FirstHomework {

    public static void main(String[] args) {

//        All variables in the program for mathematical and logical operations

        int number1 = 4;
        int number2 = 3;

//        All conclusions on the screen of mathematical and logical operations
//        Operators arithmetic

        System.out.println("-------------- Operators arithmetic --------------");
        System.out.println("-------------- variables --------------");
        System.out.println("number1 = " + (number1) );
        System.out.println("number2 = " + (number2) );
        System.out.println("-------------- Addition --------------");
        System.out.println("number1 + number2 = " + (number1 + number2) );
        System.out.println("-------------- Subtraction --------------");
        System.out.println("number1 - number2 = " + (number1 - number2) );
        System.out.println("-------------- Multiplication --------------");
        System.out.println("number1 * number2 = " + (number1 * number2) );
        System.out.println("-------------- Division with the formation int => double --------------");
        System.out.println("number1 / number2 = " + ((double)number1 / number2) );
        System.out.println("-------------- Calculating the remainder --------------");
        System.out.println("number1 % number2 = " + ((double)number1 % number2) );
        System.out.println("-------------- Increment number1++ --------------");
        System.out.println("number1++ = " + (number1++) );
        System.out.println("-------------- Increment ++number1 --------------");
        System.out.println("++number1 = " + (++number1) );
        System.out.println("-------------- Decrement number2-- --------------");
        System.out.println("number2-- = " + (number2--) );
        System.out.println("-------------- Decrement --number2 --------------");
        System.out.println("--number2 = " + (--number2) );

//        Assignment Operators

        System.out.println("-------------- Assignment Operators --------------");
        System.out.println("-------------- Variables--------------");
        System.out.println("number1 = " + (number1) );
        System.out.println("number2 = " + (number2) );
        System.out.println("-------------- Assignment number1 += number2 --------------");
        System.out.println("number1 += number2 = " + (number1 += number2) );
        System.out.println("-------------- Assignment number1 -= number2 --------------");
        number1 -= number2;
        System.out.println("number1 -= number2 = " + (number1) );
        System.out.println("-------------- Assignment number1 *= number2 --------------");
        number1 *= number2;
        System.out.println("number1 *= number2 = " + (number1) );
        System.out.println("-------------- Assignment number1 /= number2 --------------");
        number1 /= number2;
        System.out.println("number1 /= number2 = " + (number1) );
        System.out.println("-------------- Assignment number1 %= number2 --------------");
        number1 %= number2;
        System.out.println("number1 %= number2 = " + (number1) );

//        Logical Operators

        System.out.println("-------------- Logical Operators --------------");
        System.out.println("-------------- Variables --------------");
        System.out.println("number1 = " + (number1) );
        System.out.println("number2 = " + (number2) );
        System.out.println("-------------- Equally == --------------");
        System.out.println("number1 == number2 = " + (number1 == number2));
        System.out.println("-------------- Not equal != --------------");
        System.out.println("number1 != number2 = " + (number1 != number2));
        System.out.println("-------------- Less < --------------");
        System.out.println("number1 < number2 = " + (number1 < number2));
        System.out.println("-------------- Less or equal <= --------------");
        System.out.println("number1 <= number2 = " + (number1 <= number2));
        System.out.println("-------------- More > --------------");
        System.out.println("number1 > number2 = " + (number1 > number2));
        System.out.println("-------------- More or equal >= --------------");
        System.out.println("number1 >= number2 = " + (number1 >= number2));
        System.out.println("-------------- Negation ! --------------");
        System.out.println("number1 == number2 = " + (!(number1 == number2) ) );
        System.out.println("-------------- NaN and Infinity --------------");
        System.out.println((double)number2 / number1);
        System.out.println((double)number1 / number1);

    }



}
