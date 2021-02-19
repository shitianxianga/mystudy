import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class proxy implements InvocationHandler {
    private  Object proxyIn;

    public proxy(Object proxyIn) {
        this.proxyIn = proxyIn;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行");
        Object result=method.invoke(proxyIn,args);
        System.out.println("介绍执行");
        return result;
    }
}
