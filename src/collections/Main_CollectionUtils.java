package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Dimaster on 23.07.2017.8
 */
public class Main_CollectionUtils {
    public static void main(String[] args) {
        Collection<Integer> a = new ArrayList<>();
        a.add(8);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(6);
        Collection<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(5);
        b.add(6);
        CollectionUtilsRelise res = new CollectionUtilsRelise();
        try {
            System.out.println("----------Union----------");
            System.out.println(res.union(a, b));
            System.out.println("----------Intersection----------");
            System.out.println(res.intersection(a, b));
            System.out.println("----------UnionWithoutDuplicate----------");
            System.out.println(res.unionWithoutDuplicate(a, b));
            System.out.println("----------IntersectionWithoutDuplicate----------");
            System.out.println(res.intersectionWithoutDuplicate(a, b));
            System.out.println("----------Difference----------");
            System.out.println(res.difference(a, b));
        } catch (NullPointerException e) {
            System.out.println("a == null || b == null");
        }
    }
}
