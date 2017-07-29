package io.imple;

import java.util.List;

/**
 * Created by Dimaster on 17.07.2017.8
 */
public class Main {
    public static void main(String[] args) {
        IoUtilsImpl utils = new IoUtilsImpl();
        List<String> res = utils.findFiles("D:\\");
        for (String elem : res) {
            System.out.println(elem);
        }
    }
}
