package com.coderman.pattern.tempatemethod;

/**
 * java程序员
 * @Author zhangyukang
 * @Date 2021/4/24 21:40
 * @Version 1.0
 **/
public class JavaProgrammer extends Programmer{

    @Override
    protected void coding() {
        System.out.println("写Java代码...");
    }
}
