package com.xmstory.design.factory.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public class HungrySingleton01 {//饿汉式   静态方法初始化实例
    //1.构造方法私有，防止外部new
    private HungrySingleton01(){
    }
    //2.内部创建实例
    private static HungrySingleton01 hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton01();
    }
    //3.全局唯一访问实例方法
    public static HungrySingleton01 getSingleton(){
        return hungrySingleton;
    }
}

