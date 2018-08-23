package yupi.com.builder;

/**
 * 功能描述：游戏开发者老狗（具体的建造者）
 *
 * @author Yupi Li
 * @date 2018/08/23 14:27
 */
public class LaoGouGameBuilder implements GameBuilder
{
    @Override
    public void develop(String name)
    {
        System.out.println("老狗正在开发"+name);
    }

    @Override
    public void comment(String comment)
    {
        System.out.println("/* "+comment+" */");
    }

    @Override
    public void print(int times)
    {
        for (int i = 0; i < times; i++)
        {
            System.out.println("老狗输出调试中"+"~~~老狗的小尾巴");
        }
    }
}
