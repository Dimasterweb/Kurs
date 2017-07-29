package fractionNumbers;

/**
 * Created by Dimaster on 25.06.2017.*
 */
public class FractionNumber implements IFractionNumber{
    private int dividend = 0;
    private int divisor = IFractionNumber.DEFAULT_DIVISOR_VALUE;

    public FractionNumber(int div, int divis) throws IllegalArgumentException{
        dividend = div;
        if (divis == 0){
            throw new IllegalArgumentException("Divisor must not be 0");
        }
        divisor = divis;
    }

    public FractionNumber(int div){
        dividend = div;
    }

    public FractionNumber(){

    }

    public void setDividend (int div){
        dividend = div;
    }

    public void setDivisor (int div) throws IllegalArgumentException{
        if (div == 0){
            throw new IllegalArgumentException("Divisor != 0");
        }
        divisor = div;
    }

    public int getDividend() {
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public double value (){
        return dividend /(double)divisor;
    }

    public void printToConsole (){
        System.out.println(dividend + " / " + divisor);
    }

    public void simples (){
        boolean isMinusDivident = false;
        if (dividend < 0){
            isMinusDivident = true;
            dividend = -dividend;
        }
        boolean isMinusDivisor = false;
        if (divisor < 0){
            isMinusDivisor = true;
            divisor = -divisor;
        }
        int min = 0;
        if (dividend > divisor){
            min = divisor;
        }else {
            min = dividend;
        }
        int delitel = 1;
        for (int i = 2; i <= min; i++){
            if (dividend %i == 0 && divisor%i == 0){
                delitel = i;
            }
        }
        dividend = dividend / delitel;
        divisor = divisor / delitel;
        if (isMinusDivident){
            dividend = -dividend;
        }
        if (isMinusDivisor){
            divisor = -divisor;
        }
    }
}
