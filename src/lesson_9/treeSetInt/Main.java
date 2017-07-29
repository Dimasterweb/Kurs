package lesson_9.treeSetInt;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Dimaster on 16.07.2017.8
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return - integer.compareTo(t1);
            }
        });
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        for (Iterator<Integer> iter = treeSet.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
