package com.coderman.pattern.singleton;

/**
 * 饿汉单例
 *
 * @Author zhangyukang
 * @Date 2021/4/24 22:00
 * @Version 1.0
 **/
@SuppressWarnings("all")
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
