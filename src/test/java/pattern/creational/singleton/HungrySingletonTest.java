package pattern.creational.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class HungrySingletonTest {

    @Test
    public void serialization_and_deserialization() throws IOException, ClassNotFoundException {
        /**
         * 序列化与反序列化测试
         */

        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    @Test(expected = RuntimeException.class)
    public void reflection_attack_test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 获取反射的类
         */
        Class objectClass = HungrySingleton.class;
        /**
         * 获取构造器
         */
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        /**
         * 获取实例
         */
        HungrySingleton instance = (HungrySingleton) constructor.newInstance();
        HungrySingleton newInstance = HungrySingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
    }



}