package main.java.com.learnjava.lambdabasics;

/**
 * Created by sdivakarla on 04/02/19.
 */
public class HelloMarsGreeting implements Greeting{
    @Override
    public void greet() {
        System.out.println("Hello Mars!!");
    }
}
