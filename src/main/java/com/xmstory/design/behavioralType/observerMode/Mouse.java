package com.xmstory.design.behavioralType.observerMode;

import com.xmstory.design.behavioralType.observerMode.MouseEventType;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class Mouse extends EventListener {//鼠标类，模拟调用对应监听事件
    public void click() {
        System.out.println("调用单击方法");
        trigger(MouseEventType.ON_CLICK);
    }
    public void doubleClick() {
        System.out.println("调用双击方法");
        trigger(MouseEventType.ON_DOUBLE_CLICK);
    }
    public void up() {
        System.out.println("调用弹起方法");
        trigger(MouseEventType.ON_UP);
    }
    public void down() {
        System.out.println("调用按下方法");
        trigger(MouseEventType.ON_DOWN);
    }
    public void move() {
        System.out.println("调用移动方法");
        trigger(MouseEventType.ON_MOVE);
    }
    public void wheel() {
        System.out.println("调用滚动方法");
        trigger(MouseEventType.ON_WHEEL);
    }
    public void over() {
        System.out.println("调用悬停方法");
        trigger(MouseEventType.ON_OVER);
    }
    public void blur() {
        System.out.println("调用失焦方法");
        trigger(MouseEventType.ON_BLUR);
    }
    public void focus() {
        System.out.println("调用获焦方法");
        trigger(MouseEventType.ON_FOCUS);
    }
}
