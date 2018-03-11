package com.gupaoedu.vip.pattern.day2.singleton.test;

import com.gupaoedu.vip.pattern.day2.singleton.lazy.LazyThree;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2018/3/10.
 */
public class LazyThreeTest {
    public static void main(String[] args) {
        //反射测试
//        reflexTest();

        long start = System.currentTimeMillis();
        int count = 200;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0 ; i < count ; i ++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        countDownLatch.await();
                        System.out.println(LazyThree.getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            countDownLatch.countDown();
        }
        long take = System.currentTimeMillis() - start;
        System.out.println(take);
        //懒汉式单例3：这种形式兼顾了饿汉式的内存浪费，也兼顾了synchronized性能问题,目前最好的解决方案
    }

    /**
     * 反射测试
     */
    public static void reflexTest(){
        try{
            Class<?> clazz = LazyThree.class;
            Constructor<?> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            System.out.println(o1);
            System.out.println(LazyThree.getInstance());
            Object o2 = c.newInstance();
            //用反射也只能调用一次
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
