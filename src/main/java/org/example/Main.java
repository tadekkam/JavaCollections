package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Person> persons = new TreeSet<>();

        persons.add(new Person("Tomasz", "Kowalski", 2001, 170, 78));
        persons.add(new Person("Adam", "Borek", 2002, 185, 88));
        persons.add(new Person("Fred", "Norek", 2003, 175, 105));
        persons.add(new Person("Tadeusz", "Nowak", 2000, 186, 96));

        System.out.println(persons);

        Set<Person> personsByHeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });

        personsByHeight.addAll(persons);
        System.out.println(personsByHeight);

        Set<Person> personsByWeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getWeight(), o2.getWeight());
            }
        });

        personsByWeight.addAll(persons);
        System.out.println(personsByWeight);

    }

}