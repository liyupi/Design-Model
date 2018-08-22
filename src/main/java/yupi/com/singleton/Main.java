package yupi.com.singleton;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/22 16:46
 */
public class Main
{
    public static void main(String[] args)
    {
        // Singleton singleton = new Singleton();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2)
        {
            System.out.println("singleton1和singleton2是同一实例");
        }
    }
}
