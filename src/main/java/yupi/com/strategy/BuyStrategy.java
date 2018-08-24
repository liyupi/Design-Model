package yupi.com.strategy;

/**
 * 功能描述：做某事的策略
 *
 * @author Yupi Li
 * @date 2018/08/24 15:02
 */
public interface BuyStrategy
{
    // 抽奖，返回值表示是否抽中
    boolean draw();
}
