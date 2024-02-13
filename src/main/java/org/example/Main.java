package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

        System.out.println(names);
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
        System.out.println(reverseList(names));
        System.out.println(replaceName(names, "Anna", "Joanna"));

    }

    private static List<String> reverseList(List<String> list) {
        List<String> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
    private static List<String> replaceName(List<String> list, String oldName, String newName) {
        List<String> replacedList = new ArrayList<>();
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i).equals(oldName)) {
                replacedList.add(newName);
            } else {
                replacedList.add(list.get(i));
            }
        }
        return replacedList;
    }
}