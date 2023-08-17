package com.xmstory.design.behavioralType.observerMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public interface MouseEventType {//事件名称成员变量
    // 单击
    String ON_CLICK = "click";
    // 双击
    String ON_DOUBLE_CLICK = "doubleClick";
    // 弹起
    String ON_UP = "up";
    // 按下
    String ON_DOWN = "down";
    // 移动
    String ON_MOVE = "move";
    // 滚动
    String ON_WHEEL = "wheel";
    // 悬停
    String ON_OVER = "over";
    // 失焦
    String ON_BLUR = "blur";
    // 获焦
    String ON_FOCUS = "focus";
}
