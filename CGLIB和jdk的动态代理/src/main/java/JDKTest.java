public class JDKTest {
    public static void main(String[] args) throws Exception{
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        final JDK动态代理 jdk动态代理 = new JDK动态代理(new Person());
        human human1 =(human) jdk动态代理.newInstance( );
//        human person = new Person();
//        human human =  new JDK动态代理().newInstance(human);
        human1.speak();
    }
}
