package com.seamew;

/** 如果对象较为复杂, 需要分步创建, 就可以考虑用创建者设计模式 */

public class Product
{
    private String partA;
    private String partB;
    private String partC;

    public String getPartA()
    {
        return partA;
    }

    public void setPartA(String partA)
    {
        this.partA = partA;
    }

    public String getPartB()
    {
        return partB;
    }

    public void setPartB(String partB)
    {
        this.partB = partB;
    }

    public String getPartC()
    {
        return partC;
    }

    public void setPartC(String partC)
    {
        this.partC = partC;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }

    public static class ProductBuilder
    {
        private final Product product = new Product();

        public ProductBuilder buildPartA(String partA)
        {
            product.setPartA(partA);
            return this;
        }

        public ProductBuilder buildPartB(String partB)
        {
            product.setPartB(partB);
            return this;
        }

        public ProductBuilder buildPartC(String partC)
        {
            product.setPartC(partC);
            return this;
        }

        public Product build()
        {
            return this.product;
        }
    }
}
