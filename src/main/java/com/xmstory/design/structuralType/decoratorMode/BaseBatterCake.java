package com.xmstory.design.structuralType.decoratorMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class BaseBatterCake extends BatterCake {
    //煎饼果子属于基本类，要想加火腿肠或者其他的必须要有煎饼果子   所以不需要继承装饰器
    @Override
    protected String getMsg() {
        return "煎饼果子";
    }
    @Override
    protected int getPrice() {
        return 5;
    }
}
