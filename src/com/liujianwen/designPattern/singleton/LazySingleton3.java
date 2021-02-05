package com.liujianwen.designPattern.singleton;

public class LazySingleton3 {
    //懒汉式
    private LazySingleton3(){}

    private static LazySingleton3 singleton = null;

    public static LazySingleton3 getInstance(){
        synchronized (LazySingleton3.class) {//加同步锁保证线程安全，但是性能极低
             if (singleton == null) {
                 singleton = new LazySingleton3();
             }
             return singleton;
        }
    }
}
