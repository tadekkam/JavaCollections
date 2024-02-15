package org.example;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

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
