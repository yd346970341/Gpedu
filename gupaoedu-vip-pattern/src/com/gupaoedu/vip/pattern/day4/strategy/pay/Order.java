package com.gupaoedu.vip.pattern.day4.strategy.pay;

import com.gupaoedu.vip.pattern.day4.strategy.pay.payport.PayType;
import com.gupaoedu.vip.pattern.day4.strategy.pay.payport.Payment;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Order{
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(PayType payType){
        return payType.get().pay(this.uid,this.amount);
    }
}
