import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class proxyTest {
    public static void main(String[] args) {
        proxyIn proxyIn=new proxyIm();
        InvocationHandler handler=new proxy(proxyIn);
        ClassLoader loader=proxyIn.getClass().getClassLoader();
        Class[] classes=proxyIn.getClass().getInterfaces();
        proxyIn in= (proxyIn) Proxy.newProxyInstance(loader,classes,handler);
        in.goodbye();
        in.hello();
    }
}
