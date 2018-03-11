package com.gupaoedu.vip.pattern.day3.proxy.custom;


import com.gupaoedu.vip.pattern.day3.proxy.jdk.Xiemu;
import com.gupaoedu.vip.pattern.day3.proxy.stat.Person;


/**
 * Created by Administrator on 2018/3/10.
 */
public class CustomProxyTest {

        public static void main(String[] args) throws Exception {

            Person obj = (Person)new CustomMeipo().getInstance(new Xiemu());
            obj.findLove();
            obj.findJob();



        }
}
