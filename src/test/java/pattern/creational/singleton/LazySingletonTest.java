package pattern.creational.singleton;

import bean.T;

public class LazySingletonTest {
    public static void main(String[] args) {
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