package main.java.com.learnjava.lambdabasics;

/**
 * Created by sdivakarla on 04/02/19.
 */
public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda stringLengthFunction =  (String s) -> s.length(); // Valid
        StringLengthLambda stringLengthFunction1 =  (s) -> s.length(); // We can remove the argument type in expression as it can find from Interface
        StringLengthLambda stringLengthFunction2 =  s -> s.length(); // If only single argument, we can remove paranthesis
        System.out.println(stringLengthFunction.getLength("Welcome to Lambda"));
        System.out.println(stringLengthFunction1.getLength("Welcome to Lambda1"));
        System.out.println(stringLengthFunction2.getLength("Welcome to Lambda2"));

    }

    interface StringLengthLambda{
        public int getLength(String s);
    }

}
