package lesson_9.treeSetStudent;

/**
 * Created by Dimaster on 16.07.2017.
 */
public class Person implements Comparable<Person> {
    private int age;
    private String name;
    private String surName;

    public Person(int age, String name, String surName) {
        this.age = age;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public int compareTo(Person person) {
        Integer age1 = this.getAge();
        Integer age2 = person.getAge();
        return age1.compareTo(age2);
    }
}
