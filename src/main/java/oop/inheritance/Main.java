package oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ModArrayList<Integer> test = new ModArrayList<Integer>();
        test.add(20);
        test.add(789);
        test.add(129);
        test.add(1291);
        test.add(75);
        System.out.println(test.getUsingMod(12));
    }
}
