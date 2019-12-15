package pattern.creational.singleton;


/**
 * @author xuepipi
 */

public enum  EnumInstance {
    /**
     *  单例
     */
    INSTANCE{
        @Override
        protected void printTest(){
            System.out.println("mmm test");
        }
    };
    protected abstract void printTest();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;

    public EnumInstance getInstance(){
        return INSTANCE;
    }


}
