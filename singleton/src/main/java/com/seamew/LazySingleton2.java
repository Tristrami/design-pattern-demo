package com.seamew;

/** 利用内部枚举类实现懒汉式单例模式
  * 这种方法在功能上与公有域方法相近，但是它更加简洁，无偿提供了序列化机制，绝对防止多次实例化，
  * 即使是在面对复杂序列化或者反射攻击的时候。虽然这种方法还没有广泛采用，但是单元素的枚举类型
  * 已经成为实现 Singleton 的最佳方法。———《Effective Java 中文版 第二版》*/

public class LazySingleton2
{
    private LazySingleton2() {}

    public static LazySingleton2 getSingleton()
    {
        return SingletonHolder.HOLDER.instance;
    }

    private enum SingletonHolder
    {
        HOLDER;

        private final LazySingleton2 instance;

        SingletonHolder()
        {
            instance = new LazySingleton2();
        }
    }
}
