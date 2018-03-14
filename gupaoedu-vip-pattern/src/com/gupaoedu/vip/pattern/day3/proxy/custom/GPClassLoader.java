package com.gupaoedu.vip.pattern.day3.proxy.custom;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2018/3/10.
 */
public class GPClassLoader extends  ClassLoader{
    private File classPathFile;

    public GPClassLoader(){
        String classPath =  GPClassLoader.class.getResource("").getPath();
        System.out.println(classPath);
        System.out.println(GPClassLoader.class.getResource("") +"2");
        this.classPathFile = new File(classPath);
    }
    @Override
   protected Class<?> findClass(String name){
       String className = GPClassLoader.class.getPackage().getName() + "." + name;
        System.out.println(className);
       if (classPathFile != null){
            File classFile = new File(classPathFile,name.replaceAll("\\.","/") + ".class");
           if(classFile.exists()){
               FileInputStream in = null;
               ByteArrayOutputStream out = null;
               try {
                   in = new FileInputStream(classFile);
                   out = new ByteArrayOutputStream();
                   byte[] bytes = new byte[1024];
                   int len;
                   while((len = in.read(bytes)) != -1){
                       out.write(bytes,0,len);
                   }
                   return defineClass(className,out.toByteArray(),0,out.size());
               }catch (Exception e){
                   e.printStackTrace();
               }finally{
                   if(null != in){
                       try {
                           in.close();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                   }
                   if(null != out){
                       try {
                           out.close();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                   }
                   classFile.delete();
               }
           }
       }
        return  null;
   }
}
