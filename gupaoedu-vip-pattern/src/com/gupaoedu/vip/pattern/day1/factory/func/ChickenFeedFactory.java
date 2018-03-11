package com.gupaoedu.vip.pattern.day1.factory.func;

import com.gupaoedu.vip.pattern.day1.factory.ChickenFeed;
import com.gupaoedu.vip.pattern.day1.factory.Feed;

/**
 * Created by Administrator on 2018/3/10.
 */
public class ChickenFeedFactory implements Factory {
    @Override
    public Feed getFeed() {
        return new ChickenFeed();
    }
}
