package com.seamew;

/** 使用静态内部类实现懒汉式单例模式 */

public class LazySingleton1
{
    private LazySingleton1() {}

    public static LazySingleton1 getSingleton()
    {
        return SingletonHolder.INSTANCE;
    }

    private static final class SingletonHolder
    {
        public static final LazySingleton1 INSTANCE = new LazySingleton1();
    }
}
