package yupi.com.visitor;

/**
 * 功能描述：好访客（通过门票合法进入公园）
 *
 * @author Yupi Li
 * @date 2018/08/31 14:52
 */
public class GoodVisitor implements Visitor
{
    @Override
    public void visit(Park park)
    {
        System.out.println("善良的访客进入了桃园" + park.name);
    }

    @Override
    public void eatPeach(Park park)
    {
        System.out.println("善良的访客给桃园贡献了一个桃子");
        park.plantPeach(1);
        System.out.println("善良的访客吃了一个" + park.getPeach());
    }
}
