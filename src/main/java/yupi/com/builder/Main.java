package yupi.com.builder;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/23 14:33
 */
public class Main
{
    public static void main(String[] args){
        // 两个建造者
        GameBuilder yupi = new YupiGameBuilder();
        GameBuilder laoGou = new LaoGouGameBuilder();
        // 创建技术总监，让鱼皮开发
        Director director = new Director(yupi);
        // 建造
        director.buildGame();
        // 让老狗开发
        director.setBuilder(laoGou);
        director.buildGame();
    }
}
