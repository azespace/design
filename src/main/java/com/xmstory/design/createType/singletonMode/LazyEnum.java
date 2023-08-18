package com.xmstory.design.createType.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description: 枚举类实现 线程安全 且是唯一一种不会被破坏的单例模式(其他的反射和序列化可以破坏)
 **/
public enum LazyEnum {
    /**
     * 为什么不会被反射和序列化破坏呢?
     * 反射是因为jdk底层做了判断如果是枚举就抛出异常
     * 序列化是因为jdk给枚举做了特殊的处理，序列化只是将枚举对象的name属性输出
     * 反序列化则通过名称去找之前的枚举对象时jvm禁止了枚举序列化的一些方法，防止黑客攻击修改枚举对象。
     */
    INSTANCE;
}
