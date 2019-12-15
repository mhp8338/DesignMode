package bean;

import pattern.creational.singleton.*;

public class T implements Runnable{

    @Override
    public void run() {
//        LazySingleton instance = getLazySingleton();
//        LazyDoubleCheckSingleton instance = getLazyDoubleCheckSingleton();
//        StaticInnerClassSingleton instance = getStaticInnerClassSingleton();
//        Object instance = getContainerSingletonInstance();
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() +"   "+instance);
    }

    private Object getContainerSingletonInstance() {
        ContainerSingleton.putInstance("object",new Object());
        return ContainerSingleton.getInstance("object");
    }

    private StaticInnerClassSingleton getStaticInnerClassSingleton() {
        return StaticInnerClassSingleton.getInstance();
    }

    private LazyDoubleCheckSingleton getLazyDoubleCheckSingleton() {
        return LazyDoubleCheckSingleton.getInstance();
    }

    private LazySingleton getLazySingleton() {
        return LazySingleton.getInstance();
    }
}
