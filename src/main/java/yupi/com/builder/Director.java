package yupi.com.builder;

/**
 * 功能描述：技术总监（监工，指挥建造者）
 *
 * @author Yupi Li
 * @date 2018/08/23 14:29
 */
public class Director
{
    private GameBuilder builder;

    public Director(GameBuilder builder)
    {
        this.builder = builder;
    }

    // 指挥builder开发一个游戏，加上指定注释，并输出调试n次
    void buildGame(){
        // 先开发
        builder.develop("QQ三国");
        // 再写注释
        builder.comment("快乐童年");
        // 最后输出调试
        builder.print(2);
        System.out.println();
    }

    public void setBuilder(GameBuilder builder)
    {
        this.builder = builder;
    }
}
