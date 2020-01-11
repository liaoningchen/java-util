package com.dev.util.singleton;
/**
* @Description:    恶汉式，线程安全，调用率高，但是不能延时加载
* @Author:         chendeyou
* @CreateDate:     2020/1/11 19:15
*/
public class SingletonDemo1 {
    private static SingletonDemo1 singleton = new SingletonDemo1();
    private SingletonDemo1(){}

    public static SingletonDemo1 getInstance(){
        return singleton;
    }
}
