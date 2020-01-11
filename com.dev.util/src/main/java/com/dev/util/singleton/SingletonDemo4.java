package com.dev.util.singleton;
/**
* @Description:    静态内部类实现模式 线程安全，调用率高 可以延时加载
 *                 (外部类加载时候不会加载内部静态类，所以可以延时加载)
* @Author:         chendeyou
* @CreateDate:     2020/1/11 19:35
*/
public class SingletonDemo4 {

    private static class SingletonClassInstance{
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }
    private SingletonDemo4(){}

    public static SingletonDemo4 getInstance(){
        return SingletonClassInstance.instance;
    }

}
