package collections;

import java.util.*;

/**
 * Created by Admin on 29.07.2017.8
 */
public class Main_SetUtils {
    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<>();
        coll.add(5);
        coll.add(6);
        coll.add(7);
        coll.add(8);
        coll.add(9);
        Set<String> st2 = new HashSet<>();
        st2.add("2");
        st2.add("3");
        st2.add("4");
        SetUtilsRelise result = new SetUtilsRelise();
        try {
            System.out.println(result.orderedSet(coll,st2));
        }catch (NullPointerException e){
            System.out.println("coll || st2 = null");
        }



    }
}
