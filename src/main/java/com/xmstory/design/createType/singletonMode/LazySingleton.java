package com.xmstory.design.createType.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description: 懒汉式线程不安全(没加sys锁)
 **/
public class LazySingleton {
    /**
     * 构造方法私有，防止外部new
     */
    private LazySingleton(){}

    /**
     * 内部构建实例，实例化被延迟到调用该方法时创建
     */
    private static LazySingleton singleton;

    /**
     * 提供全局唯一访问点
     * @return
     */
    public static LazySingleton getSingleton(){
        //可以明显看到多个线程是可能存在new 多次的情况的，线程不安全。
        if (singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
