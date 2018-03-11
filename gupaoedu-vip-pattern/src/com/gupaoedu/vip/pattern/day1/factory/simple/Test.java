package com.gupaoedu.vip.pattern.day1.factory.simple;

/**
 * Created by Administrator on 2018/3/10.
 */
public class Test {
    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactory();
        System.out.println(sf.getFeed("鸡饲料").getName());
        System.out.println(sf.getFeed("牛饲料").getName());
    }
}
