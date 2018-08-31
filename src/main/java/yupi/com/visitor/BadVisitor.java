package yupi.com.visitor;

/**
 * 功能描述：坏访客（不被公园接受，但强制访问公园）
 *
 * @author Yupi Li
 * @date 2018/08/31 14:53
 */
public class BadVisitor implements Visitor
{
    @Override
    public void visit(Park park)
    {
        System.out.println("坏坏的访客进入了桃园" + park.name);
    }

    @Override
    public void eatPeach(Park park)
    {
        System.out.println("坏坏的访客吃了一个"+park.getPeach());
        System.out.println("坏坏的访客吃了一个"+park.getPeach());
    }
}
