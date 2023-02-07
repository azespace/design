package com.xmstory.design.behavioralType.ObserverMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class MouseEventCallback {//需要被触发的事件类  以及事件方法
    public void onClick(Event event) {
        System.out.println("==========触发鼠标单击事件==========" + "\n" + event);
    }
    public void onDoubleClick(Event event) {
        System.out.println("==========触发鼠标双击事件==========" + "\n" + event);
    }
    public void onUp(Event event) {
        System.out.println("==========触发鼠标弹起事件==========" + "\n" + event);
    }
    public void onDown(Event event) {
        System.out.println("==========触发鼠标按下事件==========" + "\n" + event);
    }
    public void onMove(Event event) {
        System.out.println("==========触发鼠标移动事件==========" + "\n" + event);
    }
    public void onWheel(Event event) {
        System.out.println("==========触发鼠标滚动事件==========" + "\n" + event);
    }
    public void onOver(Event event) {
        System.out.println("==========触发鼠标悬停事件==========" + "\n" + event);
    }
    public void onBlur(Event event) {
        System.out.println("==========触发鼠标失焦事件==========" + "\n" + event);
    }
    public void onFocus(Event event) {
        System.out.println("==========触发鼠标获焦事件==========" + "\n" + event);
    }
}
