package com.coderman.pattern.tempatemethod;

/**
 * 程序员
 *
 * @Author zhangyukang
 * @Date 2021/4/24 21:42
 * @Version 1.0
 **/
public abstract class Programmer {

    /**
     * 程序员的一天: 吃饭-写代码-睡觉
     */
    public void day() {

        System.out.println("吃饭......");

        //写代码抽象,交给子类完成。
        this.coding();

        System.out.println("睡觉......");
    }

    /**
     * 写代码：不同的程序员写不同的代码
     */
    protected abstract void coding();
}
