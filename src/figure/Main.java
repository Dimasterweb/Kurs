package figure;

/**
 * Created by Dimaster on 28.06.2017.*
 */
public abstract class Main {
    public static void main(String[] args) {
        FourUgolnik square = new FourUgolnik(2,3,4,5);
        FiveUgolnik star = new FiveUgolnik(2,3,4,5,6);
        System.out.println(square.perimitr());
        System.out.println(star.perimitr());
        Figure figure = new FourUgolnik();




    }
}
