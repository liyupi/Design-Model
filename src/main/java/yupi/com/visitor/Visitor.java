package yupi.com.visitor;

/**
 * 功能描述：访客
 *
 * @author Yupi Li
 * @date 2018/08/31 14:51
 */
public interface Visitor
{
    // 访问公园
    void visit(Park park);
    // 吃桃
    void eatPeach(Park park);
}
