package org.example;

class Person implements Comparable <Person>{

    private String name;
    private String lastName;
    private int yearOfBirth;
    private int height;
    private int weight;


    public Person(String name, String lastName, int yearOfBirth, int height, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }


    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(other.yearOfBirth, this.yearOfBirth);
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

