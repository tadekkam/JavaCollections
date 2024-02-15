package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(1, "first");
        System.out.println(pair);

        pair.setFirst(2);
        pair.setSecond("second");
        System.out.println(pair);

        Integer firstElement = pair.getFirst();
        String secondElement = pair.getSecond();

        System.out.println(firstElement + " " + secondElement);

    }

}