package pattern.creational.singleton;

/**
 * @author xuepipi
 */
public class LazySingleton {
    /**
     * 懒加载
     */
    private static LazySingleton Instance = null;

    /**
     * 私有构造器
     */
    private LazySingleton(){
        if(Instance != null){
            throw new RuntimeException("单例禁止反射调用");
        }

    }

    /**
     * 获取单例
     */
    public static LazySingleton getInstance(){
        if(Instance == null){
            Instance = new LazySingleton();
        }
        return Instance;
    }
}
