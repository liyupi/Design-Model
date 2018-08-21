package yupi.com.template_method;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/21 17:54
 */
public class Main
{
    public static void main(String[] args){
        Schedule brotherSchedule = new BrotherSchedule();
        Schedule laoGouSchedule = new LaoGouSchedule();
        brotherSchedule.live();
        System.out.println();
        laoGouSchedule.live();
    }
}
