package main.java.com.learnjava.lambdabasics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sdivakarla on 07/02/19.
 */
public class CollectionIterationExample {
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
        System.out.println("\n\n Legacy For Loop");
        // Legacy For loop
        for(int i=0; i<people.size(); i++){
            System.out.println(people.get(i));
        }

        // For-in loop
        System.out.println("\n\n For-in Loop");
        for(Person p:people){
            System.out.println(p);
        }

        //For-each loop with lambda
        System.out.println("\n \n For-each Loop");
        people.forEach(p-> System.out.println(p));

        //For-each loop with lambda with method references
        System.out.println("\n\n For-each Loop with method references");
        people.forEach(System.out::println);

    }

}
