package fiveLesson;

/**
 * Created by Dimaster on 20.06.2017.*
 */
public class Main {
    public static void main(String[] args) {
        Student vasy = new Student();
        Student pety = new Student();
        Student sergei = new Student();
        vasy.zadatName("Vasy");
        pety.zadatName("Pety");
        sergei.zadatName("Sergei");
        vasy.hello();
        pety.hello();
        sergei.hello();
    }
}
