package com.seamew.dynamicProxy.cglib.interceptor;

import com.seamew.TargetInterface;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TargetMethodInterceptor implements MethodInterceptor
{
    private TargetInterface target;

    public TargetMethodInterceptor() {}

    public TargetMethodInterceptor(TargetInterface target)
    {
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable
    {
        System.out.println("before ...");
        Object ret = proxy.invoke(this.target, args);
        System.out.println("after ...");
        return ret;
    }
}
