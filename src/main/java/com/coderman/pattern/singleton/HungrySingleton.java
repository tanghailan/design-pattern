package com.coderman.pattern.singleton;

/**
 * 饿汉单例
 * @Author zhangyukang
 * @Date 2021/4/24 21:57
 * @Version 1.0
 **/
@SuppressWarnings("all")
public class HungrySingleton {

    private static final HungrySingleton instance=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
