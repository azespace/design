package com.xmstory.design.behavioralType.templateMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        //需要哪个类就用哪个子类，步骤都统一好了，直接执行即可。
        NetCourse netCourse = new JavaCourse();
        netCourse.createCourse();
    }
}
