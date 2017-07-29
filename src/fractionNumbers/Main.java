package fractionNumbers;

/**
 * Created by Dimaster on 25.06.2017.*
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- Sum ---------------");
        FractionNumber num1 = null;
        try {
             num1 = new FractionNumber(-2,0);
        }catch (IllegalArgumentException e){
            System.out.println("Divisor must not be ");
        }
        FractionNumber num2 = new FractionNumber(3, 5);
        FractionNumber num3 = new FractionNumber(5,7);
        FractionNumber num4 = new FractionNumber(23,44);
        FractionNumber num5 = new FractionNumber(108,174);
        FractionNumber num6 = new FractionNumber(540, 678);
        FractionNumber num7 = new FractionNumber(-54,66);
        FractionNumber num8 = new FractionNumber(18, -26);
        FractionNumber num9 = new FractionNumber(10568,12349);
        FractionNumber num10 = new FractionNumber(30418,42522);

        FractionNumberOperations res1 = new FractionNumberOperations();

        try{
            FractionNumber result1 = res1.add(num1,num2);
            result1.printToConsole();
        }catch (NullPointerException e){
            System.out.println("a == null || b == null");
        }
        FractionNumber result2 = res1.add(num3,num4);
        result2.printToConsole();
        FractionNumber result3 = res1.add(num5, num6);
        result3.printToConsole();
        FractionNumber result4 = res1.add(num7,num8);
        result4.printToConsole();
        FractionNumber result5 = res1.add(num9,num10);
        result5.printToConsole();

        System.out.println("--------------- Minus --------------");

        FractionNumber num11 = null;
        try {
            num11 = new FractionNumber(-2,0);
        }catch (IllegalArgumentException e){
            System.out.println("Divisor must not be ");
        }

        FractionNumber num12 = new FractionNumber(3,5);
        FractionNumber num13 = new FractionNumber(5,7);
        FractionNumber num14 = new FractionNumber(23,44);
        FractionNumber num15 = new FractionNumber(108,174);
        FractionNumber num16 = new FractionNumber(540, 678);
        FractionNumber num17 = new FractionNumber(-54,66);
        FractionNumber num18 = new FractionNumber(18, -26);
        FractionNumber num19 = new FractionNumber(10568,12349);
        FractionNumber num20 = new FractionNumber(30418,42522);
        try {
            FractionNumber result6 = res1.sub(num11,num12);
            result6.printToConsole();
        }catch (NullPointerException e){
            System.out.println("a == null || b == null");
        }
        FractionNumber result7 = res1.sub(num13,num14);
        result7.printToConsole();
        FractionNumber result8 = res1.sub(num15,num16);
        result8.printToConsole();
        FractionNumber result9 = res1.sub(num17,num18);
        result9.printToConsole();
        FractionNumber result10 = res1.sub(num19,num20);
        result10.printToConsole();

        System.out.println("--------------- Multiplication --------------");

        FractionNumber num21 = new FractionNumber(-2,4);
        FractionNumber num22 = new FractionNumber(3,5);
        FractionNumber num23 = new FractionNumber(5,7);
        FractionNumber num24 = new FractionNumber(23,44);
        FractionNumber num25 = new FractionNumber(108,174);
        FractionNumber num26 = new FractionNumber(540, 678);
        FractionNumber num27 = new FractionNumber(-54,66);
        FractionNumber num28 = new FractionNumber(18, -26);
        FractionNumber num29 = new FractionNumber(10568,12349);
        FractionNumber num30 = new FractionNumber(30418,42522);


        FractionNumber result11 = res1.mul(num21,num22);
        result11.printToConsole();
        FractionNumber result12 = res1.mul(num23,num24);
        result12.printToConsole();
        FractionNumber result13 = res1.mul(num25,num26);
        result13.printToConsole();
        FractionNumber result14 = res1.mul(num27,num28);
        result14.printToConsole();
        FractionNumber result15 = res1.mul(num29,num30);
        result15.printToConsole();

        System.out.println("--------------- Division --------------");

        FractionNumber num31 = new FractionNumber(-2,4);
        FractionNumber num32 = new FractionNumber(0,5);
        FractionNumber num33 = new FractionNumber(5,7);
        FractionNumber num34 = new FractionNumber(23,44);
        FractionNumber num35 = new FractionNumber(108,174);
        FractionNumber num36 = new FractionNumber(540, 678);
        FractionNumber num37 = new FractionNumber(-54,66);
        FractionNumber num38 = new FractionNumber(18, -26);
        FractionNumber num39 = new FractionNumber(10568,12349);
        FractionNumber num40 = new FractionNumber(30418,42522);


        try {
            FractionNumber result16 = res1.div(num31,num32);
            result16.printToConsole();
        }catch (ArithmeticException e){
            System.out.println("Delenie na 0");
        }
        FractionNumber result17 = res1.div(num33,num34);
        result17.printToConsole();
        FractionNumber result18 = res1.div(num35,num36);
        result18.printToConsole();
        FractionNumber result19 = res1.div(num37,num38);
        result19.printToConsole();
        FractionNumber result20 = res1.div(num39,num40);
        result20.printToConsole();
    }
}
