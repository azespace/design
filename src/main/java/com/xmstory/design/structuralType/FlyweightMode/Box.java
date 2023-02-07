package com.xmstory.design.structuralType.FlyweightMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public abstract class Box {
    protected abstract String getShape();
    protected void display(String color){
        System.out.println("这是个形状:"+getShape()+"颜色"+color);
    }
}
