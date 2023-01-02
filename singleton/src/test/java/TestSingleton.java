import com.seamew.EagerSingleton;
import com.seamew.LazySingleton1;
import com.seamew.LazySingleton2;
import com.seamew.LazySingleton3;
import org.junit.Test;

/* 单例模式大致可以分为饿汉式和懒汉式
 * 饿汉式指的是, 只要当前类一加载, 就创建出单例对象
 * 懒汉式指的是, 只有在用到这个单例对象的时候其才会被创建
 * 也就是说, 要实现懒汉式的单例模式, 就要保证这个类被加载的时候, 单例对象不会被创建
 * 懒汉式常用的并且比较安全的实现方法有两种
 * 1. 使用静态内部类: 在当前类中创建一个静态内部类, 在这个内部类中创建一个外部类的单例对象 (静态常量),
 *    也就是把这个内部类看作一个外部类单例对象的持有者, 只有在要使用这个单例对象时, 内部类才会被加载,
 *    这个单例对象才会被创建; 而当外部类被加载, 但不需要使用这个单例对象时, 这个单例对象就不会被创建,
 *    从而实现了懒加载
 * 2. 使用内部枚举类 (最佳方式): 在当前类中创建一个内部枚举类, 并且枚举类中只定义一个枚举项, 再与静态内
 *    部类一样, 可以把这个看作外部类的单例对象的持有者, 实现懒加载 */

public class TestSingleton
{
    @Test
    public void testEagerSingleton()
    {
        // 饿汉式
        EagerSingleton s1 = EagerSingleton.getSingleton();
        EagerSingleton s2 = EagerSingleton.getSingleton();
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    @Test
    public void testLazySingleton1()
    {
        // 静态内部类实现的懒汉式
        LazySingleton1 s1 = LazySingleton1.getSingleton();
        LazySingleton1 s2 = LazySingleton1.getSingleton();
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    @Test
    public void testLazySingleton2()
    {
        // 内部枚举类实现的懒汉式
        LazySingleton2 s1 = LazySingleton2.getSingleton();
        LazySingleton2 s2 = LazySingleton2.getSingleton();
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    @Test
    public void testLazySingleton3()
    {
        // 比较简单的懒汉式实现, 但多线程时不安全
        LazySingleton3 s1 = LazySingleton3.getSingleton();
        LazySingleton3 s2 = LazySingleton3.getSingleton();
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
