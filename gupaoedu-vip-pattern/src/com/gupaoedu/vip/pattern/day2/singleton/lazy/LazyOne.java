package com.gupaoedu.vip.pattern.day2.singleton.lazy;

/**
 * Created by Administrator on 2018/3/10.
 * @Description: 懒汉模式实现单例1
 */
public class LazyOne{

    /**
     * 私有化构造方法，不让外部new
     */
    private LazyOne(){}
    /**
     * 初始化为null ，使用的时候才实例化
     */
    private static LazyOne instance = null;

    /**
     * 供外部统一获取实例
     * @return
     */
    public static final LazyOne getInstance(){
        //为null则创建
        if(instance == null){
            instance = new LazyOne();
        }
        return  instance;
    }
}
