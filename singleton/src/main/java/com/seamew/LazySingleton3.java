package com.seamew;

/** 使用双重检查锁实现懒汉式单例模式 */

public class LazySingleton3
{
    private static LazySingleton3 singleton;

    private LazySingleton3() {}

    public static LazySingleton3 getSingleton()
    {
        if (singleton == null)
        {
            synchronized(LazySingleton3.class)
            {
                if (singleton == null)
                {
                    singleton = new LazySingleton3();
                }
            }
        }
        return singleton;
    }
}
