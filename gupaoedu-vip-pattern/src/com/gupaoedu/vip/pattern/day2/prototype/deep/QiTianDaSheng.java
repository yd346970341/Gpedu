package com.gupaoedu.vip.pattern.day2.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/11.
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable{

    public JinGuBang jinGuBang;
    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }

    public  Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();
            return  copy;
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }

    public QiTianDaSheng copy(QiTianDaSheng target){
        QiTianDaSheng q = new QiTianDaSheng();
        q.jinGuBang = new JinGuBang();
        q.birthday = new Date();
        q.height = target.height;
        q.weight = target.weight;
        return q;
    }
}
