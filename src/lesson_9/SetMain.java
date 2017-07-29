package lesson_9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by Dimaster on 16.07.2017.
 */
public class SetMain {
    public static void main(String[] args) {
        HashSet<String> set = new LinkedHashSet<>();
        set.add("abcd");
        set.add("1abcd");
        set.add("2abcd");
        set.add("3abcd");
        set.add("abcd");

        for (Iterator<String> iter = set.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }

}
