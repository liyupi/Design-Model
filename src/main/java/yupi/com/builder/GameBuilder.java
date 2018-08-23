package yupi.com.builder;

/**
 * 功能描述：游戏开发者（建造者）
 *
 * @author Yupi Li
 * @date 2018/08/23 14:24
 */
public interface GameBuilder
{
    // 开发
    void develop(String name);
    // 写注释
    void comment(String comment);
    // 输出调试
    void print(int times);
}
