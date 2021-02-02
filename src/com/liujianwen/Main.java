package com.liujianwen;

import com.liujianwen.singleton.*;

public class Main {

    public static void main(String[] args) {
        StaticSingleton singleton1 = StaticSingleton.getInstance();
        StaticSingleton singleton11 = StaticSingleton.getInstance();
        System.out.println(singleton1 == singleton11);
    }
}
