package com.xmstory.design.behavioralType.ObserverMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        try {
            MouseEventCallback mouseEventCallback = new MouseEventCallback();
            // 注册事件  将所有需要监听的对象放入map中
            Mouse mouse = new Mouse();
            mouse.addListener(MouseEventType.ON_CLICK, mouseEventCallback);
            mouse.addListener(MouseEventType.ON_DOUBLE_CLICK, mouseEventCallback);
            mouse.addListener(MouseEventType.ON_UP, mouseEventCallback);
            mouse.addListener(MouseEventType.ON_DOWN, mouseEventCallback);
            mouse.addListener(MouseEventType.ON_MOVE, mouseEventCallback);
            mouse.addListener(MouseEventType.ON_WHEEL, mouseEventCallback);
            mouse.addListener(MouseEventType.ON_OVER, mouseEventCallback);
            mouse.addListener(MouseEventType.ON_BLUR, mouseEventCallback);
            mouse.addListener(MouseEventType.ON_FOCUS, mouseEventCallback);
            //鼠标模拟点击，对应被监听的对象事件就被启动了
            mouse.click();
            mouse.doubleClick();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
