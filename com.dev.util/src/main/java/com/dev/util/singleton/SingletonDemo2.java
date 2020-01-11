package com.dev.util.singleton;
/**
* @Description:    懒汉式，线程安全，调用率不高，但是能延时加载
* @Author:         chendeyou
* @CreateDate:     2020/1/11 19:21
*/
public class SingletonDemo2 {

    private static  SingletonDemo2 singleton;

    private SingletonDemo2(){}

    public static synchronized SingletonDemo2 getInstance(){
        if(singleton == null){
            return new SingletonDemo2();
        }
        return singleton;
    }
}
