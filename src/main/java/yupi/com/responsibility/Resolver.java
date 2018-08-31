package yupi.com.responsibility;

/**
 * 功能描述：解决者（类似链表），多个解决者形成责任链
 *
 * @author Yupi Li
 * @date 2018/08/31 16:15
 */
public abstract class Resolver
{
    // 下一个解决者（类似链表中的下一个指针）
    private Resolver next;
    // 解决者的名字
    public String name;

    public Resolver(String name)
    {
        this.name = name;
    }

    // 解决问题的步骤
    public final void solveStep(Problem problem)
    {
        if (solve(problem))
        {
            System.out.println("类型为" + problem.type + "的问题：" + problem.name + "得到解决");
            System.out.println("解决者是：" + name);
        } else if (next != null)
        {
            System.out.println(this.name + "推卸责任给" + next.name);
            next.solveStep(problem);
        } else
        {
            System.out.println("类型为" + problem.type + "的问题：" + problem.name + "无法解决");
        }
    }

    // 能否解决问题
    public abstract boolean solve(Problem problem);

    // 指定下一个解决者
    public Resolver setNext(Resolver next)
    {
        this.next = next;
        return next;
    }
}
