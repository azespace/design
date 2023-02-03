package com.xmstory.design.factory.prototypeMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:
 **/
public class Student implements Cloneable{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student getBean() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
