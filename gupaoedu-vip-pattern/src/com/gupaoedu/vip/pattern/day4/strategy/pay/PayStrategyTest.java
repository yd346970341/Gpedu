package com.gupaoedu.vip.pattern.day4.strategy.pay;

import com.gupaoedu.vip.pattern.day4.strategy.pay.Order;
import com.gupaoedu.vip.pattern.day4.strategy.pay.payport.PayType;

/**
 * Created by Administrator on 2018/3/11.
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        //把商品添加到购物车，再从购物车下单
        Order order = new Order("1","201803112021",324.45);

        //开始支付
        System.out.println(order.pay(PayType.JD_PAY));
    }
}
