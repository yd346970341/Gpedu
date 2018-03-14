package com.gupaoedu.vip.pattern.day4.strategy.pay;

/**
 * Created by Administrator on 2018/3/11.
 */
//z支付完成以后的状态
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return
                "支付状态：" + code +
                ", 交易详情：" + msg  +
                ", 交易金额：" + data +
                '}';
    }
}
