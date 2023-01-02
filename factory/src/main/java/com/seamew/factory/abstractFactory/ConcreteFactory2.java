package com.seamew.factory.abstractFactory;

import com.seamew.product.productGroup.ConcreteProductA2;
import com.seamew.product.productGroup.ConcreteProductB2;
import com.seamew.product.productGroup.ProductA;
import com.seamew.product.productGroup.ProductB;

public class ConcreteFactory2 implements AbstractFactory
{
    @Override
    public ProductA createProductA()
    {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB()
    {
        return new ConcreteProductB2();
    }
}