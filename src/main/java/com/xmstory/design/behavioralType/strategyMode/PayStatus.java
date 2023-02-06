package com.xmstory.design.behavioralType.strategyMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class PayStatus {
    //支付状态
    private int code;
    private Object data;
    private String msg;
    public PayStatus(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    @Override
    public String toString() {
        return ("支付状态：[" + code + "]，" + msg + "，交易详情：" + data);
    }
}
