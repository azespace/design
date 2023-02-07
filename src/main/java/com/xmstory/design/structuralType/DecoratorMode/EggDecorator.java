package com.xmstory.design.structuralType.DecoratorMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class EggDecorator extends BatterCakeDecorator{
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }
    @Override
    protected void doSomething() {
        //做加强操作
    }
    @Override
    protected String getMsg() {
        return super.getMsg()+"加一个鸡蛋";
    }
    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
