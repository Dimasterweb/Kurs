package stringUtils;

/**
 * Created by Admin on 07.07.2017.8
 */
public class Main {
    public static void main(String[] args) {
        String s = null;
        String s1 = "a";
        StringUtils result = new StringUtils();
        try{
            System.out.println(result.div(s, s1));
        } catch (NullPointerException e){
            System.out.println("catch null");
        } catch (NumberFormatException e){
            System.out.println("catch NumberFormatExeption");
        } catch (ArithmeticException e){
            System.out.println("catch ArithmeticExeption");
        }

    }
}
