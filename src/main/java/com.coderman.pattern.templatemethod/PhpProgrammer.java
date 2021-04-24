package com.coderman.pattern.templatemethod;

/**
 * php程序员
 * @Author zhangyukang
 * @Date 2021/4/24 21:40
 * @Version 1.0
 **/
public class PhpProgrammer extends Programmer{

    @Override
    protected void coding() {
        System.out.println("写PHP代码...");
    }
}
