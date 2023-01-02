package com.seamew.factory.abstractFactory;

import com.seamew.product.productGroup.ProductA;
import com.seamew.product.productGroup.ProductB;

/** 这个抽象工厂可以理解为, 它拥有两条固定生产线, 可以分别生产 productA
  * 和 productB 两类产品, 这个抽象工厂的实现类就可以根据自己的需要, 去
  * 具体实现这两个产品的生产方法. 举个例子, productA 为手机, productB
  * 为笔记本电脑, 假设 HuaweiFactory 实现了 AbstractFactory, 那么
  * HuaweiFactory 就可以具体实现华为手机及华为电脑的生产方法 */

public interface AbstractFactory
{
    ProductA createProductA();

    ProductB createProductB();
}