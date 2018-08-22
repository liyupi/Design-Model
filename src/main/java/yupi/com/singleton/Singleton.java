package yupi.com.singleton;

/**
 * 功能描述：单例类
 *
 * @author Yupi Li
 * @date 2018/08/22 16:46
 */
public class Singleton
{
    private static Singleton singleton = new Singleton();
    // 私有构造函数
    private Singleton()
    {
        System.out.println("创建了一个实例");
    }
    // get方法
    public static Singleton getInstance()
    {
        return singleton;
    }
}
