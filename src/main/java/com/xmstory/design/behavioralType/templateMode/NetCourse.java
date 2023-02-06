package com.xmstory.design.behavioralType.templateMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public abstract class NetCourse {
    //模板方法需要加final防止被子类修改
    protected final void createCourse() {
        //定义一个算法骨架，并提供一些共有实现，一些步骤实现不同由子类实现，使得不改变算法骨架的情况下完成更多需求
        this.assigningJobs();
        this.finishJobs();
        this.teacher();
    }
    private void assigningJobs() {
        System.out.println("布置作业");
    }
    private void finishJobs() {
        System.out.println("完成作业");
    }
    private void teacher() {
        if (isNeed()) {
            checkJobs();
        }
    }
    //钩子方法，用于控制特殊情况下的流程走向
    private boolean isNeed() {
        return true;
    }
    //不同的课程实现不同
    protected abstract void checkJobs();
}
