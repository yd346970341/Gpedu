package com.gupaoedu.vip.pattern.day1.factory.func;

/**
 * Created by Administrator on 2018/3/10.
 */
public class Test {
    public static void main(String[] args) {
        Factory f1 = new CattleFeedFactory();
        Factory f2 = new ChickenFeedFactory();
        System.out.println(f1.getFeed().getName());
        System.out.println(f2.getFeed().getName());
    }
}
