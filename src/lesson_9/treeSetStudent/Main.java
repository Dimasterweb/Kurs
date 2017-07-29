package lesson_9.treeSetStudent;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Dimaster on 16.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person number1 = new Person(17,"Vasya","Vasiliev");
        Person number2 = new Person(19,"Petia","Grishen");
        Person number3 = new Person(16,"Dima","Nazuta");

        TreeSet<Person> treeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return - person.getSurName().compareTo(t1.getSurName());
            }
        });

        treeSet.add(number1);
        treeSet.add(number2);
        treeSet.add(number3);

        for (Iterator<Person> iter = treeSet.iterator(); iter.hasNext();){
            System.out.println(iter.next());

        }
    }
}
