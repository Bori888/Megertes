package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        Person p = new Person("Anna");
        set.add(p);

        System.out.println("Tartalmazza-e Anna-t? " + set.contains(p));

        p.setName("Béla");

        System.out.println("Tartalmazza-e Béla-t? " + set.contains(p));
    }
}
