package yupi.com.template_method;

/**
 * 功能描述：作息时间表（父类制定方法模板）
 *
 * @author Yupi Li
 * @date 2018/08/21 17:38
 */
public abstract class Schedule
{
    // 起床
    abstract void getUp();
    // 做作业
    abstract void doWork();
    // 敲代码
    abstract void writeCode();
    // 一天的作息，方法的流程模板
    void live(){
        System.out.println("5:00 到了");
        getUp();
        System.out.println("6:00 到了");
        doWork();
        System.out.println("24:00 到了");
        writeCode();
    }
}
