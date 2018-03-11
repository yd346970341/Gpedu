package com.gupaoedu.vip.pattern.day2.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2018/3/10.
 * 注册登记式单例
 * spring中的做法，就是用这种注册时单例
 */
public class BeanFactory {

    private BeanFactory(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getBean(String className){
        if(ioc.containsKey(className)){
            return ioc.get(className);
        }else{
            try {
                return ioc.put(className,Class.forName(className).getInterfaces());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
