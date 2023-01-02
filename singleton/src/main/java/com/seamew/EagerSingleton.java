package com.seamew;

public class EagerSingleton
{
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getSingleton()
    {
        return INSTANCE;
    }
}
