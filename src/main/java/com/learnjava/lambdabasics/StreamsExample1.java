package main.java.com.learnjava.lambdabasics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sdivakarla on 07/02/19.
 */
public class StreamsExample1 {
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

        people.stream()
                .filter(p-> p.getLastName().startsWith("D"))
                //.forEach(System.out::println);
        .forEach(p -> System.out.println(p.getFirstName()));
    }
}
