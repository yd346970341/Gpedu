package com.gupaoedu.vip.pattern.day2.singleton.test;


import com.gupaoedu.vip.pattern.day2.singleton.lazy.LazyOne;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2018/3/10.
 */
public class LazyOneTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 200;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0 ; i < count ; i ++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        countDownLatch.await();
                        System.out.println(LazyOne.getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            countDownLatch.countDown();
        }
        long take = System.currentTimeMillis() - start;
        System.out.println(take);
        //懒汉式单例1：并发访问时，会有线程安全问题，产生的实例可能不不止一个，不能保证单例
    }
}
