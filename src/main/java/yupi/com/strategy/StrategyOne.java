package yupi.com.strategy;

/**
 * 功能描述：策略一：抽A
 *
 * @author Yupi Li
 * @date 2018/08/24 15:02
 */
public class StrategyOne implements BuyStrategy
{
    @Override
    public boolean draw()
    {
        System.out.println("抽A");
        // 中奖率为50%
        return Math.random() > 0.5;
    }
}
