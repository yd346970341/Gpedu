package com.gupaoedu.vip.pattern.day4.strategy.pay.payport;

import com.gupaoedu.vip.pattern.day4.strategy.pay.PayState;

/**
 * Created by Administrator on 2018/3/11.
 */
public interface Payment {

    public PayState pay(String id, double amount);
}
