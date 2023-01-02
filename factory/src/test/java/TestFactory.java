import com.seamew.factory.abstractFactory.AbstractFactory;
import com.seamew.factory.abstractFactory.ConcreteFactory1;
import com.seamew.factory.abstractFactory.ConcreteFactory2;
import com.seamew.factory.simpleFactory.SimpleFactory;
import com.seamew.product.productGroup.ProductA;
import com.seamew.product.productGroup.ProductB;
import com.seamew.product.singleProduct.Product;
import org.junit.Test;

public class TestFactory
{
    @Test
    public void testSimpleFactory()
    {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.createProduct("A");
        System.out.println(product);
    }

    @Test
    public void testAbstractFactory()
    {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA a1 = factory1.createProductA();
        ProductB b1 = factory1.createProductB();
        ProductA a2 = factory2.createProductA();
        ProductB b2 = factory2.createProductB();
        a1.use();
        b1.use();
        a2.use();
        b2.use();
    }
}
