package yupi.com.responsibility;

/**
 * 功能描述：问题解决者（能否解决某种问题）
 *
 * @author Yupi Li
 * @date 2018/08/31 16:16
 */
public class FirstResolver extends Resolver
{
    public FirstResolver(String name)
    {
        super(name);
    }

    @Override
    public boolean solve(Problem problem)
    {
        // 解决特定类型的问题
        if (problem.type == 1){
            return true;
        }
        return false;
    }
}
