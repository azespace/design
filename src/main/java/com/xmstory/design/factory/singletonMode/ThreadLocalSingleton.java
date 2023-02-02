package com.xmstory.design.factory.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:
 **/
public class ThreadLocalSingleton {//本地线程式  线程安全
    //线程私有 防止外部new
    private ThreadLocalSingleton(){}
    //线程间隔离就不存在所谓的线程安全问题，只是每个线程都会有一个对象，空间有一点浪费，属于空间换时间
    //加fina表示这个对象必须被初始化，且初始化后对象变量的值无法再被变更
    private static final ThreadLocal<ThreadLocalSingleton> singletonInstance = new InheritableThreadLocal<ThreadLocalSingleton>(){
        //内部类覆盖初始化方法，构造一个默认值 ThreadLocalSingleton 到ThreadLocal中 (线程id key 单例对象 value)
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    //(线程id key 单例对象 value) 就可以获取到线程下的唯一单例了
    public static ThreadLocalSingleton getSingleton(){
        return singletonInstance.get();
    }
}
