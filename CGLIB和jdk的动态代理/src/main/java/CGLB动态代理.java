import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 字节码生成子类实现增强  对final类的方法和类不能实现增强
 * 参考 CGLIB$man$$EnhancerByCGLIB$$bfb505a1 查看speak
 */

public class CGLB动态代理 implements MethodInterceptor {


    public <T> T gerProxy(Class clazz){
        final Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (T) enhancer.create();

    }


    public Object intercept(Object var1, Method var2, Object[] var3, MethodProxy var4) throws Throwable{
        System.out.println("CGLIB这里是拦截的方法");
        return var4.invokeSuper(var1,var3);
    }


}
