### 1.饿汉式 com.dev.util.singleton.SingletonDemo1
```$xslt
一上来就把单例对象创建出来了，要用的时候直接返回即可，这种可以说是单例模式中
最简单的一种实现方式。但是问题也比较明显。单例在还没有使用到的时候
，初始化就已经完成了。也就是说，如果程序从头到位都没用使用这个单例的话，
单例的对象还是会创建。这就造成了不必要的资源浪费。所以不推荐这种实现方式。
```


如何选用：

-单例对象 占用资源少，不需要延时加载，枚举 好于 饿汉

-单例对象 占用资源多，需要延时加载，静态内部类 好于 懒汉式