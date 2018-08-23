package yupi.com.abstract_factory.low;

import yupi.com.abstract_factory.common.Master;

/**
 * 功能描述：低配主机（具体零件）
 *
 * @author Yupi Li
 * @date 2018/08/23 15:48
 */
public class LowMaster extends Master
{
    public LowMaster(String name, String price)
    {
        super(name, price);
    }

    @Override
    public void start()
    {
        System.out.println(name + "龟速启动，" + "价格为" + price);
    }
}
