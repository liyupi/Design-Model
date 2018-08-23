package yupi.com.abstract_factory.high;

import yupi.com.abstract_factory.common.Master;

/**
 * 功能描述：高配主机（具体零件）
 *
 * @author Yupi Li
 * @date 2018/08/23 15:48
 */
public class HighMaster extends Master
{
    public HighMaster(String name, String price)
    {
        super(name, price);
    }

    @Override
    public void start()
    {
        System.out.println(name + "高速启动，" + "价格为" + price);
    }
}
