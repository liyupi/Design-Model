package yupi.com.visitor;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/31 15:02
 */
public class Main
{
    public static void main(String[] args){
        Park park = new Park("大安桃园");
        park.plantPeach(5);
        // 定义两种访客
        Visitor goodVisitor = new GoodVisitor();
        Visitor badVisitor = new BadVisitor();
        // 公园接受已购票访客
        park.accept(goodVisitor);
        // 未购票访客强行访问并吃桃
        badVisitor.visit(park);
        badVisitor.eatPeach(park);
    }
}
