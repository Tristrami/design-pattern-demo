package com.seamew.factory.abstractFactory;

import com.seamew.product.productGroup.ConcreteProductA1;
import com.seamew.product.productGroup.ConcreteProductB1;
import com.seamew.product.productGroup.ProductA;
import com.seamew.product.productGroup.ProductB;

public class ConcreteFactory1 implements AbstractFactory
{
    @Override
    public ProductA createProductA()
    {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB()
    {
        return new ConcreteProductB1();
    }
}
