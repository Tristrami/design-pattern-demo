package com.seamew.staticProxy;

import com.seamew.TargetInterface;

public class TargetProxy implements TargetInterface
{
    private TargetInterface target;

    public TargetProxy() {}

    public TargetProxy(TargetInterface target)
    {
        this.target = target;
    }

    @Override
    public void use()
    {
        System.out.println("before ...");
        this.target.use();
        System.out.println("after ...");
    }
}
