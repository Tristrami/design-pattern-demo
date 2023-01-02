package com.seamew;

public abstract class AbstractClass
{
    public final void templateMethod()
    {
        primitiveMethodA();
        hookMethodA();
        if (hookMethodB())
        {
            primitiveMethodB();
        }
    }

    public abstract void primitiveMethodA();

    public abstract void primitiveMethodB();

    public void hookMethodA()
    {
        System.out.println("钩子函数 hookMethodA() 被执行");
    }

    public boolean hookMethodB()
    {
        System.out.println("钩子函数 hookMethodB() 被执行");
        return true;
    }
}
