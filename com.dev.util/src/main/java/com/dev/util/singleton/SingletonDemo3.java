package com.dev.util.singleton;
/**
* @Description:    .Double CheckLock实现单例：DCL也就是双重锁判断机制（由于JVM底层模型原因，偶尔会出问题，不建议使用）：
* @Author:         chendeyou
* @CreateDate:     2020/1/11 19:32
*/
public class SingletonDemo3 {
    private volatile static SingletonDemo3 singleton;
    private SingletonDemo3(){}

    public static SingletonDemo3 getInstance(){
        if(singleton == null){
            synchronized (SingletonDemo3.class){
                if(singleton==null){
                    return new SingletonDemo3();
                }
            }
        }
        return singleton;
    }
}
