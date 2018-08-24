package yupi.com.strategy;

/**
 * 功能描述：策略二：抽B
 *
 * @author Yupi Li
 * @date 2018/08/24 15:04
 */
public class StrategyTwo implements BuyStrategy
{
    @Override
    public boolean draw()
    {
        System.out.println("抽B");
        // 100%中奖
        return true;
    }
}
