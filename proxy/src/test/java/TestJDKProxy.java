import com.seamew.TargetInterface;
import com.seamew.TargetInterfaceImpl;
import com.seamew.dynamicProxy.jdkProxy.invocationHandler.TargetInvocationHandler;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestJDKProxy
{
    @Test
    public void test()
    {
        // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        TargetInterface target = new TargetInterfaceImpl("test");
        TargetInterface tp = (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TargetInvocationHandler(target)
        );
        tp.use();
    }
}
