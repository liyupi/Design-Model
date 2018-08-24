package yupi.com.bridge;

/**
 * 功能描述：显示器类(具有桥接功能的基本类）
 *
 * @author Yupi Li
 * @date 2018/08/24 13:58
 */
public class Screen
{
    // 通过委托解耦，使实现和扩展分离
    protected ScreenImpl screen;

    Screen(ScreenImpl screen)
    {
        this.screen = screen;
    }

    void display()
    {
        screen.display();
    }

    void adjust()
    {
        screen.adjust();
    }
}
