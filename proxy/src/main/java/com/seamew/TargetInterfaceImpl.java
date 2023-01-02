package com.seamew;

public class TargetInterfaceImpl implements TargetInterface
{
    private String name;

    public TargetInterfaceImpl() {}

    public TargetInterfaceImpl(String name)
    {
        this.name = name;
    }

    @Override
    public void use()
    {
        System.out.println("using target [" + name + "]");
    }
}
