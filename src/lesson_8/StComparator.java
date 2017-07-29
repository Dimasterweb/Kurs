package lesson_8;

import java.util.Comparator;

/**
 * Created by Nata on 03.07.2017.8
 */
public class StComparator implements Comparator<Student> {


    public int compare(Student o1, Student o2) {
        return - o1.getName().compareTo(o2.getName());
    }
}
