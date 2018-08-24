package yupi.com.bridge;

/**
 * 功能描述：几种显示器基本功能的具体实现
 *
 * @author Yupi Li
 * @date 2018/08/24 14:03
 */
public class ConcreteScreenImpl extends ScreenImpl
{

    @Override
    void display()
    {
        System.out.println("高清显示");
    }

    @Override
    void adjust()
    {
        System.out.println("对比调节");
    }
}

class ConcreteScreenImpl2 extends ScreenImpl{

    @Override
    void display()
    {
        System.out.println("低清显示");
    }

    @Override
    void adjust()
    {
        System.out.println("亮度调节");
    }
}

class ConcreteScreenImpl3 extends ScreenImpl{

    @Override
    void display()
    {
        System.out.println("高清显示");
    }

    @Override
    void adjust()
    {
        System.out.println("亮度调节");
    }
}

class ConcreteScreenImpl4 extends ScreenImpl{

    @Override
    void display()
    {
        System.out.println("低清显示");
    }

    @Override
    void adjust()
    {
        System.out.println("对比调节");
    }
}
