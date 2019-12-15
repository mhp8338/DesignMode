package pattern.creational.singleton;

import bean.T;

import static org.junit.Assert.*;

public class ThreadLocalInstanceTest {
    public static void main(String[] args) {
        System.out.println("Main Thread:"+ThreadLocalInstance.getInstance());
        System.out.println("Main Thread:"+ThreadLocalInstance.getInstance());
        System.out.println("Main Thread:"+ThreadLocalInstance.getInstance());
        System.out.println("Main Thread:"+ThreadLocalInstance.getInstance());
        System.out.println("Main Thread:"+ThreadLocalInstance.getInstance());
        System.out.println("Main Thread:"+ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();
    }

}