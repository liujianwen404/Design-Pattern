package com.liujianwen.singleton;

public class DoubleCheckSingleton {
    //双重检查锁
    private DoubleCheckSingleton(){}

    private static volatile DoubleCheckSingleton singleton = null;

    public static DoubleCheckSingleton getInstance(){
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    //关键字volatile禁止指令重排不可少，要不然代码执行到这里，指令重排，先实例化对象了，但是还没有赋值，此时下一个线程进来就会获取到一个不完整的对象
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
