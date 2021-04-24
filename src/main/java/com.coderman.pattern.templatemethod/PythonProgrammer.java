package com.coderman.pattern.templatemethod;

/**
 * python程序员
 * @Author zhangyukang
 * @Date 2021/4/24 21:41
 * @Version 1.0
 **/
public class PythonProgrammer extends Programmer{

    @Override
    protected void coding() {
        System.out.println("写Python代码...");
    }
}
