package com.gupaoedu.vip.pattern.day3.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/3/10.
 */
public class CglibMeipo implements MethodInterceptor{

    public  Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //要把那个类设置为即将生成的新父类
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 代理开始");

        methodProxy.invokeSuper(o,objects);

        System.out.println("cglib 代理开结束");
        return null;
    }
}
