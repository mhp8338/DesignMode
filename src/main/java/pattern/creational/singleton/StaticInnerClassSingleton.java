package pattern.creational.singleton;

/**
 * @author xuepipi
 */
public class StaticInnerClassSingleton {
    /**
     * 静态构造方法
     */
    private StaticInnerClassSingleton(){
        if(InnerClass.INSTANCE != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 创建静态内部类，会加锁使得对象初始化的步骤对其他线程不可见
     */
    private static class InnerClass{
        /**
         * 创建单例
         */
        private final static StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    /**
     * 获取单例
     */
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.INSTANCE;
    }
}
