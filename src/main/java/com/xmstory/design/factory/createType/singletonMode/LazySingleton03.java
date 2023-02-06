package com.xmstory.design.factory.createType.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public class LazySingleton03 {//懒汉式线程安全 内部类实现
    //1 构造方法私有，防止外部new
    private LazySingleton03(){}
    //2 创建静态内部类，并设置静态属性，静态内部类只会在方法(return SingletonHolder.singleton03;)调用到它的时候才会被加载
    private static class SingletonHolder{
        private static LazySingleton03 singleton03 = new LazySingleton03();
    }
    //调用这个方法使用到了内部类SingletonHolder的时候内部类才会被初始化，且只初始化一次。singleton03也由jvm保证线程安全
    //不加volatile是因为初始化工作只会由jvm指定第一个抢到初始化类锁的线程去完成，其他线程无法干预，所以不存在指令重排序影响
    public static LazySingleton03 getSingleton(){
        return SingletonHolder.singleton03;
    }
}
