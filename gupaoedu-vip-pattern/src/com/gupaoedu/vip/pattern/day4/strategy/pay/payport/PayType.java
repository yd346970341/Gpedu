package com.gupaoedu.vip.pattern.day4.strategy.pay.payport;

/**
 * Created by Administrator on 2018/3/11.
 * 姑且把这个枚举当做常量去维护
 */
public enum  PayType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    UNIION_PAY(new UnionPay()),
    JD_PAY(new JDPay());

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment get(){return  payment;}
}
