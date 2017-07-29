package figure;

/**
 * Created by Dimaster on 28.06.2017.
 */
public class FiveUgolnik extends FourUgolnik implements Figure{
    private int e;

    public FiveUgolnik (){
        super();
    }

    public FiveUgolnik (int a, int b, int c, int d, int e){
        super(a,b,c,d);
        this.e = e;
    }

    public int perimitr (){
        return super.perimitr() + e;
    }

    @Override
    public int plochad() {
        return super.plochad() * e;
    }

    public int perimitr2 (){
        return super.perimitr() + e;
    }


}
