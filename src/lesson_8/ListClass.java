package lesson_8;

import java.util.*;

/**
 * Created by Nata on 03.07.2017.8
 */
public class ListClass {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(1212);
        numbers.add(2323);
        numbers.add(2);
        numbers.add(44);
        numbers.set(1,3333333);
        System.out.println("-------------ArrayList--------for each----");
        for (Integer num :numbers){
            System.out.println(num.toString());
        }

        List<Integer> numbers2 = new LinkedList<Integer>();
        numbers2.add(12);
        numbers2.add(1212);
        numbers2.add(2323);
        numbers2.add(2);
        numbers2.add(44);
        numbers2.set(1,3333333);

        System.out.println("-------------LinkedList--------index----");
        for (int i = 0; i < numbers2.size(); i++){
            System.out.println(numbers2.get(i));
        }

        System.out.println("-------------LinkedList--------iterator----");
        Collections.sort(numbers2, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (Iterator<Integer> iterator = numbers2.iterator(); iterator.hasNext(); ){
            System.out.println(iterator.next());
        }

    }
}
