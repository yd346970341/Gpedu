package com.gupaoedu.vip.pattern.day2.singleton.test;

import com.gupaoedu.vip.pattern.day2.singleton.lazy.LazyTwo;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2018/3/10.
 */
public class LazyTwoTest {

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
                        System.out.println(LazyTwo.getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            countDownLatch.countDown();
        }
        long take = System.currentTimeMillis() - start;
        System.out.println(take);
        //懒汉式单例2：并发访问时，能保证单例，但是会有性能问题。
    }
}
