package pattern.creational.singleton;

import bean.T;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaticInnerClassSingletonTest {

    @Test
    public void static_inner_class_singleton_test(){
        /**
         * 创建线程
         */
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        /**
         * 线程开始
         */
        t1.start();
        t2.start();

        System.out.println("Program End ...");
    }

}