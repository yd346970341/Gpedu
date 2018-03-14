package com.gupaoedu.vip.pattern.day2.singleton.test;

import com.gupaoedu.vip.pattern.day2.singleton.seriable.Seriable;

import java.io.*;

/**
 * Created by Administrator on 2018/3/11.
 */
public class SeriableTest {
    public static void main(String[] args) {
        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        FileOutputStream fos = null;
        try{
            //将数据写入流
            fos = new FileOutputStream("Seriable.aa");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            //从流中读出数据，用容器接收
            FileInputStream fis = new FileInputStream("Seriable.aa");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Seriable) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
