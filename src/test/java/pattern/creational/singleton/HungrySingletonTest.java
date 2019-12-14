package pattern.creational.singleton;

import org.junit.Test;

import java.io.*;

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

    @Test
    public void reflection_attack_test(){

    }



}