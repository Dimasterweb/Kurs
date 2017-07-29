package lesson_8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Nata on 03.07.2017.
 */
public class SortedSetIntClass {

    public static void main(String[] args) {

        Student st1 = new Student(32,"11Vasya","9911Vasiliev");
        Student st2 = new Student(19,"22Vasya","22Vasiliev");
        Student st3 = new Student(67,"33Vasya","33Vasiliev");
        Student st4 = new Student(3,"44Vasya","44Vasiliev");
        Set<Student> set = new TreeSet<Student>(new StComparator());
        set.add(st1);
        set.add(st4);
        set.add(st3);
        set.add(st2);
        set.add(st1);
        set.add(st1);

        for (Iterator<Student> iterator = set.iterator(); iterator.hasNext(); ){
            System.out.println(iterator.next());
        }
    }
}
