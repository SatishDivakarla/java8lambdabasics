package main.java.com.learnjava.lambdabasics;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by sdivakarla on 05/02/19.
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int [] someNumbers = {1,2,3,4,5};
        int key = 0;
//        process(someNumbers, key, (someNumber, aboveKey)-> {
//            try {
//                System.out.println(someNumber / aboveKey);
//            }
//            catch (ArithmeticException ae){
//                System.out.println("Arithmetic Exception Occured!!");
//            }
//        });
        process(someNumbers, key, wrapperLambda((someNumber, aboveKey) -> System.out.println(someNumber / aboveKey)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for(int i :someNumbers){
            biConsumer.accept(i, key);
        }
    }
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer){
        return (v,k) -> {
            try{
                biConsumer.accept(v, k);
            }
            catch(ArithmeticException ae){
                System.out.println("Arithmetic Exception from Wrapper Lambda");
            }
        };
    }
}
