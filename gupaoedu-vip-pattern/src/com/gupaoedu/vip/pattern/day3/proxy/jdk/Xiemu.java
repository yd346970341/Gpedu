package com.gupaoedu.vip.pattern.day3.proxy.jdk;

import com.gupaoedu.vip.pattern.day3.proxy.stat.Person;

/**
 * Created by Administrator on 2018/3/10.
 */
public class Xiemu implements Person{
    @Override
    public void zufangzi() {

    }

    @Override
    public void buy() {

    }

    @Override
    public void findJob() {
        System.out.println("找20-50k的工作");
    }

    public void findLove(){
        System.out.println("找 高富帅，身高180，胸大，六块腹肌");
    }
}
