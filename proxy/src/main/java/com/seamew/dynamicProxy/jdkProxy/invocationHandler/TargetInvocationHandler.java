package com.seamew.dynamicProxy.jdkProxy.invocationHandler;

import com.seamew.TargetInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TargetInvocationHandler implements InvocationHandler
{
    private TargetInterface target;

    public TargetInvocationHandler() {}

    public TargetInvocationHandler(TargetInterface target)
    {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("before ...");
        Object ret = method.invoke(this.target);
        System.out.println("after");
        return ret;
    }
}
