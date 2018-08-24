package yupi.com.strategy;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/24 15:05
 */
public class Main
{
    public static void main(String[] args){
        // 制定两种策略
        BuyStrategy strategy1 = new StrategyOne();
        BuyStrategy strategy2 = new StrategyTwo();
        // 默认策略为“抽A”
        Yupi yupi = new Yupi(strategy1);
        // 抽5次奖
        for (int i = 0; i < 5; i++)
        {
            if (yupi.nextDraw()){
                System.out.println("抽中了");
            } else {
                System.out.println("没抽中");
                // 替换策略为“抽B”
                yupi.setStrategy(strategy2);
            }
        }
    }
}
