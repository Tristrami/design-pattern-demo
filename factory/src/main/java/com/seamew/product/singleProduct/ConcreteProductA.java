package com.seamew.product.singleProduct;

public class ConcreteProductA implements Product
{
    private final String name = "A";

    @Override
    public void use()
    {
        System.out.println("Use product A");
    }

    @Override
    public String toString()
    {
        return "ConcreteProductA{" +
                "name='" + name + '\'' +
                '}';
    }
}
