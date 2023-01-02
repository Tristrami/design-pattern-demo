package com.seamew.factory.simpleFactory;

import com.seamew.product.singleProduct.ConcreteProductA;
import com.seamew.product.singleProduct.ConcreteProductB;
import com.seamew.product.singleProduct.Product;

public class SimpleFactory
{
    public Product createProduct(String type)
    {
        if (type.equalsIgnoreCase("A"))
        {
            return new ConcreteProductA();
        }
        else if (type.equalsIgnoreCase("B"))
        {
            return new ConcreteProductB();
        }
        else
        {
            throw new RuntimeException("No such product type: " + type);
        }
    }
}
