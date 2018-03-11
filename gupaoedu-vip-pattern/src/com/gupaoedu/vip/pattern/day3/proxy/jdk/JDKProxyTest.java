package com.gupaoedu.vip.pattern.day3.proxy.jdk;

import com.gupaoedu.vip.pattern.day3.proxy.stat.Person;
import javafx.beans.binding.ObjectExpression;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2018/3/10.
 */
public class JDKProxyTest {
    public static void main(String[] args) throws Exception {

        Person obj = (Person)new JDKMeipo().getInstance(new Xiemu());
        obj.findLove();
//        obj.findJob();


        //原理
        //1.拿到被代理对象的引用，并且获取到它的所有接口，反射获取
        //2.JDK Proxy 类重新生成一个新的类，同时新的类要实现被代理类所有实现的所有接口
        //3.动态生成java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
        //4.编译新生成的java代码.class
        //再重新加载到JVM中运行

        //以上过程就叫字节码重组

        //JDK中有一个规范，只要是$开头的一般都是自动生成的

        //通过反编译工具可以查看源代码

        byte[] bytes = ProxyGenerator.generateProxyClass("$proxy0",new Class[]{Person.class} );
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\$Proxy0.class");
        fos.write(bytes);
        fos.close();
    }
}
