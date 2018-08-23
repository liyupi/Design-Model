package yupi.com.abstract_factory.low;

import yupi.com.abstract_factory.common.Computer;
import yupi.com.abstract_factory.common.Master;
import yupi.com.abstract_factory.common.Screen;

/**
 * 功能描述：低配电脑（具体产品）
 *
 * @author Yupi Li
 * @date 2018/08/23 15:48
 */
public class LowComputer extends Computer
{
    public LowComputer(Master master, Screen screen)
    {
        super(master, screen);
    }

    @Override
    public void printInfo()
    {
        System.out.println("低配电脑：");
        master.start();
        screen.show();
        System.out.println();
    }
}
