package com.xmstory.design.structuralType.decoratorMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public abstract class BatterCake {
    //每个类都有自己的功能块，如何能达到复用这个功能块再复用呢，继承是办不到的。但是装饰类可以
    protected abstract String getMsg();
    protected abstract int getPrice();
}
