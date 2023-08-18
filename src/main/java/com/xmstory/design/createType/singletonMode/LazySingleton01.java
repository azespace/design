package com.xmstory.design.createType.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description: 懒汉式线程安全
 **/
public class LazySingleton01 {
    /**
     * 构造方法私有，防止外部new
     */
    private LazySingleton01(){}

    /**
     * 内部构建实例，实例化被延迟到调用该方法时创建
     */
    private static LazySingleton01 singleton;

    /**
     * 提供全局唯一访问点 加了锁，线程安全，但是效率不高
     * @return
     */
    public static synchronized LazySingleton01 getSingleton(){
        if (singleton == null){
            singleton = new LazySingleton01();
        }
        return singleton;
    }
}
