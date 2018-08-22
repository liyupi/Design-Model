package yupi.com.factory_method;

/**
 * 功能描述：面包（具体食物）
 *
 * @author Yupi Li
 * @date 2018/08/22 14:33
 */
public class Bread extends Food
{

    @Override
    public void wrap()
    {
        System.out.println("用塑料袋包装" + name);
    }
}
