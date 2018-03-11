package com.gupaoedu.vip.pattern.day2.singleton.register;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * Created by Administrator on 2018/3/10.
 * 常量 枚举 通常在通用API中使用
 */
public enum Color {
    RED(){
        private int r = 255;
        private int g = 0;
        private int b = 0;
    },BLACK(){
        private int r = 0;
        private int g = 0;
        private int b = 0;
    },WHITE(){
        private int r = 255;
        private int g = 255;
        private int b = 255;
    };
}
