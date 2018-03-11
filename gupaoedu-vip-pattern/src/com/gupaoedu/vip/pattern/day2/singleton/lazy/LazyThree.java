package com.gupaoedu.vip.pattern.day2.singleton.lazy;

/**
 * Created by Administrator on 2018/3/10.
 * @Description: 懒汉模式实现单例3
 * （
 *    用内部类的方式解决
 *    特点：
 *      内部类：只有在外部调用的时候才会被加载
 *      内部类一定是要在方法调用之前初始化
 *      这种形式兼顾了饿汉式的内存浪费，也兼顾了synchronized性能问题
 *      史上最牛B的单例模式实现方式
 * ）
 */
public class LazyThree{
    /**
     * 私有化构造方法，不让外部new
     * 再加如下代码，防止暴力反射调用
     */
    private LazyThree(){
        if(instance != null){
            throw new RuntimeException("请使用正规方法！严禁暴力反射！");
        }
        instance = this;
    }
    /**
     * 初始化为null ，使用的时候才实例化
     */
    private static LazyThree instance = null;
    /**
     * 供外部统一获取实例
     * tatic使单例的空间能够共享
     */
    public static final LazyThree getInstance(){
        //为null则创建
        if(instance == null){
            instance = Lazyholder.LAZY;
        }
        return  instance;
    }
    private static class Lazyholder {
        private static final LazyThree LAZY = new LazyThree();
    }

}
