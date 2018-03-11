package com.gupaoedu.vip.pattern.day2.prototype.simple;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Prototype implements Cloneable{
    private String name;

    private CloneTarget target = null;

    public CloneTarget getTarget() {
        return target;
    }

    public void setTarget(CloneTarget target) {
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
