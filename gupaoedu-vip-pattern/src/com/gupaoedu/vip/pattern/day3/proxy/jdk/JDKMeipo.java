package com.gupaoedu.vip.pattern.day3.proxy.jdk;

import com.gupaoedu.vip.pattern.day3.proxy.stat.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/3/10.
 */
public class JDKMeipo implements InvocationHandler{

    private Person target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
        method.invoke(target,args);
        System.out.println("合适的话可以办事了");

        return null;
    }

    public  Object getInstance(Person target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
}
