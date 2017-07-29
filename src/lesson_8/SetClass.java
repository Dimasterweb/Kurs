package lesson_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Nata on 03.07.2017.*
 */
public class SetClass {
    public static void main(String[] args) {
        Student st1 = new Student(43,"11Vasya","9911Vasiliev");
        Student st2 = new Student(19,"22Vasya","7722Vasiliev");
        Student st3 = new Student(32,"33Vasya","33Vasiliev");
        Student st4 = new Student(15,"44Vasya","44Vasiliev");
        Set<Student> set = new LinkedHashSet<Student>();
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
