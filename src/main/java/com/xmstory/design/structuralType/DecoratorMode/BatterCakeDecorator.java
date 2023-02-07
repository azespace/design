package com.xmstory.design.structuralType.DecoratorMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public abstract class BatterCakeDecorator extends BatterCake{
    //基本装饰器 用于存放基本的BatterCake的实现类 这种临时存储可以对于上一次对象的结果实现临时存储
    //其他装饰器 再次继承这个装饰器BatterCakeDecorator  并完成方法的加强处理
    private BatterCake batterCake;
    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }
    protected abstract void doSomething();
    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }
    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
