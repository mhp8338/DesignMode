package pattern.creational.singleton;

import bean.T;
import org.junit.Test;

import static org.junit.Assert.*;

public class LazyDoubleCheckSingletonTest {

    @Test
    public void singleton_test(){

        /**
         * 创建线程
         */
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        /**
         * 启动线程
         */
        t1.start();
        t2.start();

        System.out.println("Program End ...");

    }

}