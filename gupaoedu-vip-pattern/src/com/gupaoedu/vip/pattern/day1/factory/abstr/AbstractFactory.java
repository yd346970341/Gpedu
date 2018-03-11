package com.gupaoedu.vip.pattern.day1.factory.abstr;

import com.gupaoedu.vip.pattern.day1.factory.Feed;

/**
 * Created by Administrator on 2018/3/10.
 */
public abstract class AbstractFactory {

    public abstract Feed getChickenFeed();
    public abstract Feed getCattleFeed();
}
