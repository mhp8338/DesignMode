package pattern.creational.singleton;

import bean.T;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

    @Test
    public void class_reflection_test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = LazyDoubleCheckSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyDoubleCheckSingleton newInstance = LazyDoubleCheckSingleton.getInstance();
        LazyDoubleCheckSingleton Instance = (LazyDoubleCheckSingleton) constructor.newInstance();

        System.out.println(Instance);
        System.out.println(newInstance);
        System.out.println(Instance == newInstance);
    }

}