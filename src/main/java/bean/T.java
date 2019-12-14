package bean;

import pattern.creational.singleton.LazyDoubleCheckSingleton;
import pattern.creational.singleton.LazySingleton;
import pattern.creational.singleton.StaticInnerClassSingleton;

public class T implements Runnable{

    @Override
    public void run() {
//        LazySingleton instance = getLazySingleton();
//        LazyDoubleCheckSingleton instance = getLazyDoubleCheckSingleton();
        StaticInnerClassSingleton instance = getStaticInnerClassSingleton();
        System.out.println(Thread.currentThread().getName() +"   "+instance);
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
