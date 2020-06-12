package DesignPartten;

import java.util.HashMap;

public class Singleton {

    //内部类并不随着类加载而加载，而是在使用到的时候才进行加载，所以是懒加载模式
    public static class SingletionHolder{
        private static Singleton instance = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance(){
        //静态内部类的调用不需要外部类实例，可以直接调用
        return SingletionHolder.instance;
    }
}
