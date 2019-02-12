package main.java.com.learnjava.lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * Created by sdivakarla on 04/02/19.
 */
public class Unit1ExerciseJava8Way {
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
        printConditionally(people, p->true);

        // Create a method that prints all elements that have last name that starts with D
        printConditionally(people, p-> p.getLastName().startsWith("D"));

    }

    private static void printConditionally(List<Person> people, Condition condition){
        for(Person p : people){
            if(condition.test(p)) System.out.println(p);

        }
    }

    interface Condition{
        public boolean test(Person p);

    }
}

