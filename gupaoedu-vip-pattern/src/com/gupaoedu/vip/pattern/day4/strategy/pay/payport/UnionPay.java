package com.gupaoedu.vip.pattern.day4.strategy.pay.payport;

import com.gupaoedu.vip.pattern.day4.strategy.pay.PayState;

/**
 * Created by Administrator on 2018/3/11.
 */
public class UnionPay implements Payment {
    @Override
    public PayState pay(String id, double amount) {
        System.out.println("欢迎使用银联支付");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,amount,"支付成功！");
    }
}
