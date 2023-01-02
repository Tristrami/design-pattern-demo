import com.seamew.TargetInterface;
import com.seamew.TargetInterfaceImpl;
import com.seamew.dynamicProxy.cglib.interceptor.TargetMethodInterceptor;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class TestCglib
{
    @Test
    public void testCglib()
    {
        TargetInterface target = new TargetInterfaceImpl("test");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetInterface.class);
        enhancer.setCallback(new TargetMethodInterceptor(target));
        TargetInterface tp = (TargetInterface) enhancer.create();
        tp.use();
    }
}