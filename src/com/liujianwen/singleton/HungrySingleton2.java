package com.liujianwen.singleton;

public class HungrySingleton2 {
    //饿汉式-静态代码块 因为是随着类一起创建，线程安全
    private HungrySingleton2(){}

    private final static HungrySingleton2 singleton;

    static {
        singleton = new HungrySingleton2();
    }

    public static HungrySingleton2 getInstance(){
        return singleton;
    }
}
