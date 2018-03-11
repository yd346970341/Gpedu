package com.gupaoedu.vip.pattern.day2.prototype.simple;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/3/11.
 */
public class CloneTest {
    public static void main(String[] args) throws Exception {

        shallowReplicas();
    }
    //浅复制测试
    private static void shallowReplicas() throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.setName("Tom");
        prototype.setTarget(new CloneTarget());

        Prototype obj = (Prototype) prototype.clone();

        System.out.println(prototype == obj);
        System.out.println(prototype.getTarget() == obj.getTarget());//Clone方法是浅复制，只是将对象地址引用的复制
    }
}
