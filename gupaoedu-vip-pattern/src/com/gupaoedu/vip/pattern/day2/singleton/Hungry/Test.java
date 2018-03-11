package com.gupaoedu.vip.pattern.day2.singleton.Hungry;

/**
 * Created by Administrator on 2018/3/10.
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0 ; i < 20 ; i ++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Hungry.getInstance());
                }
            }).start();
            //饿汉式单例：并发访问时，能保证单例。缺点：初始化加载时就创建了对象，占用了内存，可能会有性能方面问题。
        }
    }
}
