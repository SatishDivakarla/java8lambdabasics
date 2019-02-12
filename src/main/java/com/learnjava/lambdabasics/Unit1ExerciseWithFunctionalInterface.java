package main.java.com.learnjava.lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by sdivakarla on 04/02/19.
 */
public class Unit1ExerciseWithFunctionalInterface {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Satish", "Divakarla", 35),
                new Person("Yasaswini", "Mangipudi", 29),
                new Person("Vihaan", "Divakarla", 1),
                new Person("Ravi", "Divakarla", 38),
                new Person("Gopi", "Divakarla", 37),
                new Person("Kameswari", "Bhagvathula", 29),
                new Person("Kumari", "Garimella", 29)
        );
        // Step1 Sort list by lastname
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Create a method that prints all elements in the list
        printConditionally(people, p-> true, p -> System.out.println(p));

        // Create a method that prints all elements that have last name that starts with D
        printConditionally(people, p-> p.getLastName().startsWith("D"), p-> System.out.println(p));

    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicte, Consumer<Person> consumer){
        for(Person p : people){
            consumer.accept(p);

        }
    }

}

