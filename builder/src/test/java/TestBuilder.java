import com.seamew.Product;
import org.junit.Test;

public class TestBuilder
{
    @Test
    public void testBuilder()
    {
        Product product = new Product.ProductBuilder()
                .buildPartA("partA")
                .buildPartB("partB")
                .buildPartC("partC")
                .build();
        System.out.println(product);
    }
}