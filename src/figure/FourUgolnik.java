package figure;

/**
 * Created by Dimaster on 28.06.2017.
 */
public class FourUgolnik implements Figure{
    private int a;
    private int b;
    private int c;
    private int d;

    public FourUgolnik (){

    }
    public FourUgolnik (int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public int perimitr (){
        return a+b+c+d;
    }

    @Override
    public int plochad() {
        return a*b*c*d;
    }


}
