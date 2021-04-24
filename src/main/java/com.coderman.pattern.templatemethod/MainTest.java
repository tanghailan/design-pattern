package com.coderman.pattern.templatemethod;

/**
 * @Author zhangyukang
 * @Date 2021/4/24 21:47
 * @Version 1.0
 **/
public class MainTest {

    public static void main(String[] args) {

        System.out.println("Java程序员的一天........");
        new JavaProgrammer().day();

        System.out.println("Php程序员的一天........");
        new PhpProgrammer().day();

        System.out.println("Python程序员的一天........");
        new PythonProgrammer().day();

    }

}
