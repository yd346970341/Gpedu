package com.gupaoedu.vip.pattern.day1.factory.abstr;

/**
 * Created by Administrator on 2018/3/10.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new FeedFactory();
        System.out.println(factory.getCattleFeed().getName());
        System.out.println(factory.getChickenFeed().getName());
    }
}
