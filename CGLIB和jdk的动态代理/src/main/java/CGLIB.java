import net.sf.cglib.core.DebuggingClassWriter;

public class CGLIB {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/zhaoxinghua/设计模式的想法/InspirationFromDesignPatterns/CGLIB和jdk的动态代理/src/main");
        final CGLB动态代理 cglb动态代理 = new CGLB动态代理();
        man person = cglb动态代理.gerProxy(man.class);
        person.speak();
    }
    //静态内部类 先创建外部类
    //想要获得内部类对象需要先new OuterClass(),然后再new InnerClass(),在可以获得一个内部类的对象，这也就就是了为甚麽获得一个内部类需要先new出一个外部类，因为内部类中的默认构造中有一个外部类类型的参数
    static class man{
        void speak(){
            System.out.println("Iam man");
        }
    }

}
