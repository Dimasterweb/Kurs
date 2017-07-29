package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 28.07.2017.8
 */
public class Main_ListUtils {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        doubles.add(2.00);
        doubles.add(3.00);
        doubles.add(4.00);
        doubles.add(5.00);
        doubles.add(6.00);
        ListUtilsRelise result = new ListUtilsRelise();
        try {
            System.out.println(result.sortedList(doubles));
        }catch (NullPointerException e){
            System.out.println("doubles == null");
        }
        String[] st = {"mama","papa","ded"};
        System.out.println(result.asList(st));
    }
}
