package pattern.creational.singleton;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;


/**
 * @author xuepipi
 *
 */
public class ContainerSingleton {
    /**
     * 创建HashMap
     * 使用HashTable会有同步锁，影响性能
     * 优点：方便管理
     * 缺点：线程不安全
     */
    private static HashMap<String, Object> singletonMap = new HashMap<>();

    /**
     * 私有构造方法
     */
    private ContainerSingleton() {

    }

    /**
     * 放置单例
     */
    public static void putInstance(String key, Object instance) {
        if (!StringUtils.isBlank(key) && instance != null) {
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key, instance);
            }

        }
    }

    /**
     * 获得单例
     */
    public static Object getInstance(String key){
        return singletonMap.get(key);
    }

}
