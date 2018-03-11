package com.gupaoedu.vip.pattern.day1.factory.simple;

import com.gupaoedu.vip.pattern.day1.factory.CattleFeed;
import com.gupaoedu.vip.pattern.day1.factory.ChickenFeed;
import com.gupaoedu.vip.pattern.day1.factory.Feed;

/**
 * Created by Administrator on 2018/3/10.
 */
public class SimpleFactory {

    public Feed getFeed(String name){
        if ("鸡饲料".equals(name)){
            return new ChickenFeed();
        }else if("牛饲料".equals(name)){
            return new CattleFeed();
        }
        return null;
    }
}
