package com.gupaoedu.vip.pattern.day2.prototype.deep;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/11.
 */
public class JinGuBang implements Serializable{
    private float h = 100;
    private float d = 10;
    public void big(){
        this.h *= 2;
        this.d *= 2;
    }
    public void small(){
        this.h /= 2;
        this.d /= 2;
    }
}

