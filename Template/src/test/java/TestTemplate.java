import com.seamew.ConcreteClass;
import org.junit.Test;

public class TestTemplate
{
    @Test
    public void testTemplate()
    {
        ConcreteClass template = new ConcreteClass();
        template.templateMethod();
    }
}
