package com.coderman.pattern.singleton;

/**
 * 双重检查懒汉单例
 *
 * @Author zhangyukang
 * @Date 2021/4/24 22:03
 * @Version 1.0
 **/
@SuppressWarnings("all")
public class DoubleCheckLazySingleton {

    private static volatile DoubleCheckLazySingleton instance = null;

    private DoubleCheckLazySingleton() {
    }

    public static DoubleCheckLazySingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
