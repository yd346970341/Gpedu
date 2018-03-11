package com.gupaoedu.vip.pattern.day2.singleton.seriable;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/11.
 */
//反序列化导致的单例破坏
public class Seriable implements Serializable{

    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方（可以是磁盘，网络IO）
    //内存中状态给永久保留下来了


    //反序列化
    //将已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为java对象
    //在转换过程中会重新创建对象new


    public static final Seriable INSTANCE = new Seriable();
    private Seriable() {}

    public static Seriable getInstance(){
        System.out.println(INSTANCE + "调用的是：getInstance方法");
        return  INSTANCE;
    }
    //反序列化单例的保证
    private Object readResolve(){
        System.out.println(INSTANCE +"调用的是：readResolve方法");
        return  INSTANCE;
    }
}
