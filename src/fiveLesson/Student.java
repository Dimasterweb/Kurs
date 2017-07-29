package fiveLesson;

/**
 * Created by Dimaster on 20.06.2017.*
 */
public class Student {
    String name;

    public void zadatName(String nameq){
        name = nameq;
    }


    public  void hello(){
        System.out.println("Hello, I'm student " + name);
    }
}
