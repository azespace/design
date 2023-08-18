package com.xmstory.design.createType.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:懒汉式线程安全 双重检查优化synchronized，注意要加volatile禁止指令重排序
 **/
public class LazySingleton02 {
    /**
     * 构造方法私有，防止外部new
     */
    private LazySingleton02(){}

    /**
     * 实例化被延迟到调用该方法时创建,并且禁止了指令重排序，为了防止多线程情况下返回了没有实例的对象
     * 为什么加volatile?当对象的实例化过程开始时，即使同步块中实例化还没有执行完毕，锁也会被释放，允许其他线程进入临界区。
     * 这样做的目的是为了在实例化过程中，允许其他线程继续执行其他任务，而不必等待实例化完成,也就是对象实例化不受同步块的限制。
     * 比如此时第一个线程已经在new了但是只给了空间但对象没有初始化完成(指令重排序导致的顺序问题)
     * 另一个对象可能会再次进入代码块再次new 此时是为null的(空间有了已经指向，但对象没有初始化)，因此需要volatile保证可见性和禁制重排序
     */
    private static volatile LazySingleton02 singleton;

    /**
     * 提供全局唯一访问点 且加锁的情况下保证效率
     * @return
     */
    public static LazySingleton02 getSingleton() {
        if (singleton == null){
            //保证只在第一次初始化的时候出现锁争抢，初始化完成后锁代码不再执行
            synchronized (LazySingleton02.class){
                if (singleton == null){
                    singleton = new LazySingleton02();
                }
            }
        }
        return singleton;
    }
}
