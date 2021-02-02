package com.liujianwen.singleton;

public class StaticSingleton {
    //静态内部类，内部类在加载时与外部类不是同时加载，根据类加载是由指定单线程加载，所以天然线程安全
    private StaticSingleton(){}

    private static class InnerSingleton{
        private  static StaticSingleton singleton = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return InnerSingleton.singleton;
    }
}
