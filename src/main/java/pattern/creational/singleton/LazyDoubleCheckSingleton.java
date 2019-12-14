package pattern.creational.singleton;

/**
 * @author xuepipi
 */
public class LazyDoubleCheckSingleton {
    /**
     * 懒加载
     * volatile:防止由对象初始化而导致的多线程空指针异常
     */
    private volatile static LazyDoubleCheckSingleton Instance = null;

    /**
     * 私有构造器
     */
    private LazyDoubleCheckSingleton(){

    }

    /**
     * 获取单例
     * synchronized:双重检查，减少同步锁的频率，确保单例
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if(Instance == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(Instance == null){
                    Instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return Instance;
    }
}
