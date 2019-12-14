package pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author xuepipi
 */
public class HungrySingleton implements Serializable {
//    private static final HungrySingleton HUNGRYSINGLETON = new HungrySingleton();
    private static final HungrySingleton INSTANCE;

    static {
        INSTANCE = new HungrySingleton();
    }

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

    /**
     * 序列化和反序列化
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }
}
