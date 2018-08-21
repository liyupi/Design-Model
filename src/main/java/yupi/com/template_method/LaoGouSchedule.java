package yupi.com.template_method;

/**
 * 功能描述：老狗的作息（子类实现方法）
 *
 * @author Yupi Li
 * @date 2018/08/21 17:41
 */
public class LaoGouSchedule extends Schedule
{
    @Override
    void getUp()
    {
        System.out.println("老狗起床");
    }

    @Override
    void doWork()
    {
        System.out.println("老狗在做小学数学");
    }

    @Override
    void writeCode()
    {
        System.out.println("老狗在写HelloWorld");
    }
}
