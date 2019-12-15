package pattern.creational.singleton;

import bean.T;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerSingletonTest {
    @Test
    public void thread_safe_test(){
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();

        System.out.println("Program End ...");
    }

}