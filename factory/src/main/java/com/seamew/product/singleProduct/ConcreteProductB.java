package com.seamew.product.singleProduct;

public class ConcreteProductB implements Product
{
    private final String name = "B";

    @Override
    public void use()
    {
        System.out.println("Use product B");
    }

    @Override
    public String toString()
    {
        return "ConcreteProductB{" +
                "name='" + name + '\'' +
                '}';
    }
}
