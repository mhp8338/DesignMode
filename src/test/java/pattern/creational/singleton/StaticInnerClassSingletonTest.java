package pattern.creational.singleton;

import bean.T;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

    @Test
    public void class_reflection_test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 获取反射的类
         */
        Class objectClass = StaticInnerClassSingleton.class;
        /**
         * 获取构造器
         */
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        /**
         * 获取实例
         */
        StaticInnerClassSingleton instance = (StaticInnerClassSingleton) constructor.newInstance();
        StaticInnerClassSingleton newInstance = StaticInnerClassSingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);

    }

}