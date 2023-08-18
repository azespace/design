package com.xmstory.design.createType.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:懒汉式线程安全 内部类实现
 **/
public class LazySingleton03 {//

    /**
     * 构造方法私有，防止外部new
     */
    private LazySingleton03(){}

    /**
     * 创建静态内部类，并设置静态属性，静态内部类只会在方法(return SingletonHolder.singleton03;)调用到它的时候才会被加载
     * 不加volatile是因为初始化工作只会由jvm指定第一个抢到初始化类锁的线程去完成，其他线程无法干预，所以不存在指令重排序影响
     * 类加载过程天然具有线程安全性，不需要额外的同步措施，内部类只会在调用时加载
     */
    private static class SingletonHolder{
        // 建立加上final 虽然加不加都行，但是这是一种良好编码习惯 也会触发更为严格的编译检查 更加安全
        private final static LazySingleton03 singleton03 = new LazySingleton03();
    }

    /**
     * 调用这个方法使用到了内部类SingletonHolder的时候内部类才会被初始化，且只初始化一次。singleton03也由jvm保证线程安全
     * @return
     */
    public static LazySingleton03 getSingleton(){
        return SingletonHolder.singleton03;
    }
}
