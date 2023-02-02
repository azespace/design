package com.xmstory.design.factory.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public class HungrySingleton {//饿汉式  类加载(程序启动)初始化实例
    //1.构造方法私有，防止外部new
    private HungrySingleton(){
    }
    //2.内部创建实例
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    //3.全局唯一访问实例方法
    public static HungrySingleton getSingleton(){
        return hungrySingleton;
    }
}

