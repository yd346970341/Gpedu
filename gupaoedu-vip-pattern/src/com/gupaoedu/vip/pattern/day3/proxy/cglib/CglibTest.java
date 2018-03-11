package com.gupaoedu.vip.pattern.day3.proxy.cglib;

/**
 * Created by Administrator on 2018/3/11.
 */
public class CglibTest {
    public static void main(String[] args) {

        ZhangSan obj = (ZhangSan)new CglibMeipo().getInstance(ZhangSan.class);
        obj.findLove();
        System.out.println("----------------------");
//        System.out.println(obj);
    }
}
