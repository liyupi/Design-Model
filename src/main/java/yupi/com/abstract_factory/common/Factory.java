package yupi.com.abstract_factory.common;

/**
 * 功能描述：抽象工厂（生产抽象零件和抽象产品）
 *
 * @author Yupi Li
 * @date 2018/08/23 15:45
 */
public abstract class Factory
{
    // 该模式核心方法，根据类名动态生成具体工厂
    public static Factory getFactory(String factoryName)
    {
        Factory factory = null;
        try
        {
            // 核心代码
            factory = (Factory) Class.forName(factoryName).newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return factory;
    }

    // 生产主机
    public abstract Master createMaster(String name,String price);
    // 生产屏幕
    public abstract Screen createScreen(String name,String price);
    // 组装电脑
    public abstract Computer createComputer(Master master, Screen screen);
}
