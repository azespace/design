package com.xmstory.design.factory.createType.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public class LazySingleton {//懒汉式线程不安全(没加sys锁)
    //1 构造方法私有，防止外部new
    private LazySingleton(){}

    //2 内部构建实例，实例化被延迟到调用该方法时创建
    private static LazySingleton singleton;

    //3 提供全局唯一访问点
    public static LazySingleton getSingleton(){
        //可以明显看到多个线程是可能存在new 多次的情况的，线程不安全。
        if (singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
