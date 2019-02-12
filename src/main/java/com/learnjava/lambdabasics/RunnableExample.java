package main.java.com.learnjava.lambdabasics;

/**
 * Created by sdivakarla on 04/02/19.
 */
public class RunnableExample {

    public static void main(String[] args) {
        Thread exampleThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In runnable run method");
            }
        });

        Thread exampleThread2 = new Thread(()-> System.out.println("In runnable lambda"));

        exampleThread.run();
        exampleThread2.run();
    }
}
