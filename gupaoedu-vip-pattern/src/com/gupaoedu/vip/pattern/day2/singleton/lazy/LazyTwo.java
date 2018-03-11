package com.gupaoedu.vip.pattern.day2.singleton.lazy;

/**
 * Created by Administrator on 2018/3/10.
 * @Description: 懒汉模式实现单例2（加同步关键字）
 */
public class LazyTwo {
    /**
     * 私有化构造方法，不让外部new
     */
    private LazyTwo(){}
    /**
     * 初始化为null ，使用的时候才实例化
     */
    private static LazyTwo instance = null;

    /**
     * 供外部统一获取实例
     * @return
     */
    public synchronized static final LazyTwo getInstance(){
        //为null则创建
        if(instance == null){
            instance = new LazyTwo();
        }
        return  instance;
    }

}
