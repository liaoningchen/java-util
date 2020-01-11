package com.dev.util.singleton;

/**
* @Description:    枚举类 线程安全 调用效率高 不能延时加载  可以防止反射和反序列化调用
* @Author:         chendeyou
* @CreateDate:     2020/1/11 19:55
*/
public enum SingletonDemo5 {

    //枚举元素本身就是单例
    INSTANCE;

    public void getInstance(){

    }
}
