package com.liujianwen.singleton;

public class LazySingleton2 {
    //懒汉式
    private LazySingleton2(){}

    private static LazySingleton2 singleton = null;

    public synchronized static LazySingleton2 getInstance(){//加同步锁保证线程安全，但是性能极低
         if (singleton == null) {
             singleton = new LazySingleton2();
         }
         return singleton;
    }
}
