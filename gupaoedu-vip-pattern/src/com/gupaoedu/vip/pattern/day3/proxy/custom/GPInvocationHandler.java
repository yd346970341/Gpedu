package com.gupaoedu.vip.pattern.day3.proxy.custom;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/3/10.
 */
public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable ;
}
