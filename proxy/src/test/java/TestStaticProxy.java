import com.seamew.TargetInterface;
import com.seamew.TargetInterfaceImpl;
import com.seamew.staticProxy.TargetProxy;
import org.junit.Test;

public class TestStaticProxy
{
    @Test
    public void testSing()
    {
        TargetInterface target = new TargetInterfaceImpl("test");
        TargetProxy tp = new TargetProxy(target);
        tp.use();
    }
}
