package com.gupaoedu.vip.pattern.day1.factory.abstr;

import com.gupaoedu.vip.pattern.day1.factory.Feed;
import com.gupaoedu.vip.pattern.day1.factory.func.CattleFeedFactory;
import com.gupaoedu.vip.pattern.day1.factory.func.ChickenFeedFactory;

/**
 * Created by Administrator on 2018/3/10.
 */
public class FeedFactory extends AbstractFactory {

    @Override
    public Feed getChickenFeed() {
        return new ChickenFeedFactory().getFeed();
    }

    @Override
    public Feed getCattleFeed() {
        return new CattleFeedFactory().getFeed();
    }
}
