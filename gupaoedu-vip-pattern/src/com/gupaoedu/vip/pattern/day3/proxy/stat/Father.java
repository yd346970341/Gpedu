package com.gupaoedu.vip.pattern.day3.proxy.stat;

/**
 * Created by Administrator on 2018/3/10.
 */
public class Father {

    private Son son;
    public Father(Son son){
        this.son = son;
    }
    //目标对象的引用拿到
    public void findLove(){
        System.out.println("根据你的要求找对象");
        son.findLove();
        System.out.println("双方父母是否同意");
    }
}
