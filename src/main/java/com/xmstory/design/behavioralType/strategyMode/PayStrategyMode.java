package com.xmstory.design.behavioralType.strategyMode;

import java.util.HashMap;
import java.util.Map;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class PayStrategyMode {
    //策略选择器，获取需要执行的对象
    public static final String DEFAULT_PAY = "aliPay";
    public static final String ALI_PAY = "aliPay";
    public static final String WECHAT_PAY = "wechatPay";
    public static final String UNION_PAY = "unionPay";
    private static Map<String,Payment> paymentMap= new HashMap();
    static {
        paymentMap.put(ALI_PAY,new AliPay());
        paymentMap.put(WECHAT_PAY,new WechatPay());
        paymentMap.put(UNION_PAY,new UnionPay());
    }
    public static Payment getPayment(String key){
        if (!paymentMap.containsKey(key)){
            return paymentMap.get(DEFAULT_PAY);
        }
        return paymentMap.get(key);
    }
}
