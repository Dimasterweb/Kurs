package fractionNumbers;

/**
 * Created by Dimaster on 25.06.2017.*
 */
public class FractionNumberOperations extends FractionNumber implements IFractionNumberOperation {


    public  FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException{
        if (a == null || b == null){
            throw new NullPointerException("a == null || b == null");
        }
        FractionNumber c = new FractionNumber();
        int div1 = a.getDividend();
        int div2 = b.getDividend();
        int dis1 = a.getDivisor();
        int dis2 = b.getDivisor();
        int commonDis = dis1*dis2;
        int commonDiv = (div1*dis2) + (div2*dis1);
        c.setDividend(commonDiv);
        c.setDivisor(commonDis);
        c.simples();
        return c;
    }
    public  FractionNumber sub (FractionNumber a, FractionNumber b) throws NullPointerException{
        if (a == null || b == null){
            throw new NullPointerException("a == null || b == null");
        }
        FractionNumber c = new FractionNumber();
        int div1 = a.getDividend();
        int div2 = b.getDividend();
        int dis1 = a.getDivisor();
        int dis2 = b.getDivisor();
        int commonDis = dis1 * dis2;
        int commonDiv = (div1*dis2) - (div2 * dis1);
        c.setDividend(commonDiv);
        c.setDivisor(commonDis);
        c.simples();
        return c;
    }
    public  FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException{
        if (a == null || b == null){
            throw new NullPointerException("a == null || b == null");
        }
        FractionNumber c = new FractionNumber();
        int div1 = a.getDividend();
        int div2 = b.getDividend();
        int dis1 = a.getDivisor();
        int dis2 = b.getDivisor();
        int commonDis = dis1 * dis2;
        int commonDiv = div1 * div2;
        c.setDividend(commonDiv);
        c.setDivisor(commonDis);
        c.simples();
        return c;
    }
    public  FractionNumber div (FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException{
        if (a == null || b == null){
            throw new NullPointerException("a == null || b == null");
        }else if (b.getDividend() == 0){
            throw new ArithmeticException("Delenie na 0");
        }
        int div1 = b.getDividend();
        int dis1 = b.getDivisor();
        FractionNumber e = new FractionNumber(dis1,div1);
        FractionNumber c = mul(a,e);
        c.simples();
        return c;
    }
}

