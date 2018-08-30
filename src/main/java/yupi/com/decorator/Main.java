package yupi.com.decorator;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/30 15:27
 */
public class Main
{
    public static void main(String[] args){
        new StarBorder(new SkyBorder(new StarBorder(new LaoGouPhoto("老狗出浴照片")))).show();
        new SkyBorder(new SkyBorder(new StarBorder(new YupiPhoto("鱼皮学习照片")))).show();
    }
}
