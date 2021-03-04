import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 只能对接口类的增强
 * 查看$Proxy0类 查看speak方法
 */
public class JDK动态代理<T> implements InvocationHandler {

    private T target;

    public JDK动态代理(T value){
        target = value;
    }


    public <T> T newInstance()throws Exception{
        //获取classLoad
//        ClassLoader classLoader = value.getClass().getClassLoader();
//        return (T) Proxy.newProxyInstance(value.getClassLoader(),new Class<?>[]{value.getClass().getInterfaces()},this);
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable{
        System.out.println("JDK动态代理这里实现增强");
        return method.invoke(target, args);

    }
}
