package main.java.com.learnjava.lambdabasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by sdivakarla on 08/02/19.
 */
public class FlatMapExample {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "This is an example",
                "This is how you write",
                "This is not a joke"
        );

        /*sentences.stream()
                .map(p -> p.split("\\s+"))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);*/

        sentences.stream()
                .map(p -> p.split("\\s+"))
                .flatMap(p -> Arrays.stream(p))
                .distinct()
                .forEach(System.out::println);
    }
}
