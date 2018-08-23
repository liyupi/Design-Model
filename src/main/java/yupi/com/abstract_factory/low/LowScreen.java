package yupi.com.abstract_factory.low;

import yupi.com.abstract_factory.common.Screen;

/**
 * 功能描述：低配屏幕（具体零件）
 *
 * @author Yupi Li
 * @date 2018/08/23 15:48
 */
public class LowScreen extends Screen
{
    public LowScreen(String name, String price)
    {
        super(name, price);
    }

    @Override
    public void show()
    {
        System.out.println(name + "渣画质显示，" + "价格为" + price);
    }
}
