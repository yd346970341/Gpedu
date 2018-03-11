package com.gupaoedu.vip.pattern.day2.singleton.Hungry;

/**
 * Created by Administrator on 2018/3/10.
 * @Description:饿汉模式实现单例
 */
public class Hungry {
    /**
     * 私有化构造方法，不让外部new
     */
    private Hungry(){}

    /**
     * static 声明为静态 类加载的时候就创建好实例
     */
    private static Hungry instance = new Hungry();

    /**
     * 供外部统一获取实例
     * @return
     */
    public static Hungry getInstance(){return instance;}
}
