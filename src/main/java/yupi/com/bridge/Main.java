package yupi.com.bridge;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/24 14:10
 */
public class Main
{
    // 打印每台显示器的信息
    static void printScreenInfo(Screen... screens)
    {
        int count = 1;
        for (Screen screen : screens)
        {
            System.out.println("显示器"+(count++)+"：");
            screen.display();
            screen.adjust();
            if (screen instanceof CurvedScreen) {
                ((CurvedScreen) screen).curvedDisplay();
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        // 定义四种功能
        ScreenImpl screenImpl1 = new ConcreteScreenImpl();
        ScreenImpl screenImpl2 = new ConcreteScreenImpl2();
        ScreenImpl screenImpl3 = new ConcreteScreenImpl3();
        ScreenImpl screenImpl4 = new ConcreteScreenImpl4();
        // 定义8种显示器
        Screen screen1 = new Screen(screenImpl1);
        Screen screen2 = new Screen(screenImpl2);
        Screen screen3 = new Screen(screenImpl3);
        Screen screen4 = new Screen(screenImpl4);
        Screen screen5 = new CurvedScreen(screenImpl1);
        Screen screen6 = new CurvedScreen(screenImpl2);
        Screen screen7 = new CurvedScreen(screenImpl3);
        Screen screen8 = new CurvedScreen(screenImpl4);
        // 打印显示器信息
        printScreenInfo(screen1,screen2,screen3,screen4,screen5,screen6,screen7,screen8);
    }
}
