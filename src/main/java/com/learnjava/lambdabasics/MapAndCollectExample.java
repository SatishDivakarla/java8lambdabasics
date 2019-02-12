package main.java.com.learnjava.lambdabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sdivakarla on 07/02/19.
 */
public class MapAndCollectExample {
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

        List<Student> students = people.stream()
                .filter(p-> p.getAge()<16)
                .map(p -> new Student(p.getFirstName(), p.getLastName(), p.getAge(), "Some School"))
                .collect(Collectors.toCollection(ArrayList<Student>::new));

        students.stream().forEach(System.out::println);
        
        int sumOfAges = people.stream()
                .mapToInt(p-> p.getAge())
                .sum();
        System.out.println("sumOfAges = " + sumOfAges);
    }
}
