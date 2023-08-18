package com.xmstory.design.createType.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description: 饿汉式 静态全局变量 类加载(程序启动)初始化实例
 **/
public class HungrySingleton {
    /**
     * 造方法私有，防止外部new
     */
    private HungrySingleton(){
    }

    /**
     * 内部创建实例
     */
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 全局唯一访问实例方法
     * @return
     */
    public static HungrySingleton getSingleton(){
        return hungrySingleton;
    }
}

