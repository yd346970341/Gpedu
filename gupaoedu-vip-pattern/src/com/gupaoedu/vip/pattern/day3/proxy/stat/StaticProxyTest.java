package com.gupaoedu.vip.pattern.day3.proxy.stat;

/**
 * Created by Administrator on 2018/3/10.
 */
public class StaticProxyTest {
    public static void main(String[] args) {

        Father father = new Father(new Son());
        father.findLove();
    }
}
