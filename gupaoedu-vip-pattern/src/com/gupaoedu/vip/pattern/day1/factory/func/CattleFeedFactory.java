package com.gupaoedu.vip.pattern.day1.factory.func;

import com.gupaoedu.vip.pattern.day1.factory.CattleFeed;
import com.gupaoedu.vip.pattern.day1.factory.Feed;

/**
 * Created by Administrator on 2018/3/10.
 */
public class CattleFeedFactory implements Factory {
    @Override
    public Feed getFeed() {
        return new CattleFeed();
    }
}
