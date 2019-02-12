package main.java.com.learnjava.lambdabasics;

/**
 * Created by sdivakarla on 04/02/19.
 */
public class GreetingWithoutLambda {
    public void greet(Greeting greeting){
        greeting.greet();
    }

    public static void main(String[] args) {
        GreetingWithoutLambda greetingWithoutLambda = new GreetingWithoutLambda();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greetingWithoutLambda.greet(helloWorldGreeting);
        HelloMarsGreeting helloMarsGreeting = new HelloMarsGreeting();
        greetingWithoutLambda.greet(helloMarsGreeting);

        LambdaInterface myLambdaFunction = () -> System.out.println("Hello World!");
        myLambdaFunction.perform();

        Greeting newmyLambdaFunction = () -> System.out.println("Hello New World!");
        newmyLambdaFunction.greet();

        AddInterface addFunction = (int a, int b) -> a+b;
        System.out.println(addFunction.add(5,3));

    }

    // This interface should have only one method.
    interface LambdaInterface{
        public void perform();
    }

    interface AddInterface{
        public int add(int a, int b);
    }

}
