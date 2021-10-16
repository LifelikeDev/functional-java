package com.lifelike.dev;

import java.util.*;
import java.util.stream.Collectors;

import static com.lifelike.dev.Gender.*;

public class Main {

    public static void main(String[] args) {

        final List<Person> people = new ArrayList<Person>();
        List<Person> females = new ArrayList<Person>();

        // Imperative Approach
        people.add(new Person("Dan", MALE));
        people.add(new Person("Arthur", MALE));
        people.add(new Person("Evelyne", FEMALE));
        people.add(new Person("Tina", FEMALE));
        people.add(new Person("Jacque", FEMALE));

        System.out.println("//  Imperative Approach");
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        // Declarative Approach
        System.out.println("// Declarative approach");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }


    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

}
