package pattern.creational.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class EnumInstanceTest {

    @Test
    public void serialization_and_deserialization_attack_test() throws IOException, ClassNotFoundException {
        EnumInstance instance = EnumInstance.INSTANCE;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enum_instance"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enum_instance"));
        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void class_reflect_attack_test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumInstance instance = EnumInstance.INSTANCE;

        Class objClass = EnumInstance.class;
        Constructor constructor = objClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumInstance newInstance = (EnumInstance) constructor.newInstance("mmm",666);

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    @Test
    public void abstract_method_test(){
        EnumInstance instance = EnumInstance.INSTANCE;
        instance.printTest();
    }

}