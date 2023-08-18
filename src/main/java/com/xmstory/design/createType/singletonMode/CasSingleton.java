package com.xmstory.design.createType.singletonMode;

import java.util.concurrent.atomic.AtomicReference;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/08/18
 * Description: AtomicReference实现单例模式 线程安全的
 **/
public class CasSingleton {
    /**
     * 构造器私有 防止外部new
     */
    private CasSingleton() {
    }

    /**
     * 支持并发访问的一个原子引用类
     * 可以在多线程环境下对共享的引用对象进行安全的读写操作
     * 核心是CAS算法
     */
    private static volatile AtomicReference<CasSingleton> INSTANCE = new AtomicReference<>();
    public static CasSingleton getInstance() {
        // 如果可以获取到 表示已经有生成了直接返回
        CasSingleton instance = INSTANCE.get();
        if (instance == null) {
            // 因为是new的对象 其他线程在刚创建对象但还未设置到 INSTANCE 之前就访问了 INSTANCE，则可能会看到一个不完整的对象 存在指令重排序和可见性问题 所以需要加上volatile
            instance = new CasSingleton();
            // 获取到的是null 则必须compareAndSet设置成功了才返回对象，因为有可能被其他线程抢先设置 这里是线程安全的 是底层的cas
            if (INSTANCE.compareAndSet(null, instance)) {
                return instance;
            } else {
                // 设置失败 被其他线程设置了 直接返回对象
                return INSTANCE.get();
            }
        }
        return instance;
    }
}
