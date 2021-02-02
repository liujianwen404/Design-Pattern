package com.liujianwen.singleton;

public class LazySingleton1 {
    //懒汉式
    private LazySingleton1(){}

    private static LazySingleton1 singleton = null;

    public static LazySingleton1 getInstance(){
         if (singleton == null) {//执行到这里时，因为是操作共享变量，所以多线程下不安全
             singleton = new LazySingleton1();
         }
         return singleton;
    }
}
