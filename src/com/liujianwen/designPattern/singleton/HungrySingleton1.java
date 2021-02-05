package com.liujianwen.designPattern.singleton;

public class HungrySingleton1 {
    //饿汉式-静态变量 因为是随着类一起创建，线程安全
    private HungrySingleton1(){}

    private final static HungrySingleton1 singleton = new HungrySingleton1();

    public static HungrySingleton1 getInstance(){
        return singleton;
    }
}
