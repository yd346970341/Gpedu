package com.gupaoedu.vip.pattern.day2.prototype.deep;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Test {
    public static void main(String[] args) throws Exception {

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();

        System.out.println(qiTianDaSheng == clone);
        System.out.println(qiTianDaSheng.jinGuBang == clone.jinGuBang);

        System.out.println(qiTianDaSheng == qiTianDaSheng.copy(qiTianDaSheng));


    }
}
