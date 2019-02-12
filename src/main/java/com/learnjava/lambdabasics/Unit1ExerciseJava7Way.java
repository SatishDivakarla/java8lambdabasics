package main.java.com.learnjava.lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * Created by sdivakarla on 04/02/19.
 */
public class Unit1ExerciseJava7Way {
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
        // Without Lambda
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Create a method that prints all elements in the list
        printAll(people);

        // Create a method that prints all elements that have last name that starts with D
        printAllBeginWithD(people);
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                if(p.getLastName().startsWith("D")) return true;
                return false;
            }
        });

    }

    private static void printAllBeginWithD(List<Person> people) {
        System.out.println("\n \n -----Names starting with D-----");
        for(Person p : people){
            if(p.getLastName().startsWith("D")) System.out.println(p);

        }
    }

    private static void printConditionally(List<Person> people, Condition condition){
        System.out.println("\n \n -----Names based on condition -----");
        for(Person p : people){
            if(condition.test(p)) System.out.println(p);

        }
    }

    private static void printAll(List<Person> people) {
        for(Person p : people){
            System.out.println(p);

        }
    }

    interface Condition{
        public boolean test(Person p);

    }
}

