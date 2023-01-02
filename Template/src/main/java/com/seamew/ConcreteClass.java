package com.seamew;

public class ConcreteClass extends AbstractClass
{
    @Override
    public void primitiveMethodA()
    {
        System.out.println("具体方法 primitiveMethodA() 被执行");
    }

    @Override
    public void primitiveMethodB()
    {
        System.out.println("具体方法 primitiveMethodB() 被执行");
    }

    @Override
    public void hookMethodA()
    {
        System.out.println("子类重写的钩子函数 hookMethodA() 被执行");
    }
}
