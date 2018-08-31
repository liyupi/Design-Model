package yupi.com.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：公园（被访问的数据结构对象）
 *
 * @author Yupi Li
 * @date 2018/08/31 14:47
 */
public class Park
{
    private List<String> list;
    String name;

    public Park(String name)
    {
        this.list = new LinkedList<>();
        this.name = name;
        System.out.println("欢迎来到" + name);
    }
    // 种桃
    public void plantPeach(int num)
    {
        for (int i = 0; i < num; i++)
        {
            if (i % 3 == 0)
            {
                list.add("大桃子");
            } else
            {
                list.add("小桃子");
            }
        }
        System.out.println("多了" + num + "个桃子");
    }
    // 摘桃
    public String getPeach()
    {
        return list.remove(list.size() - 1);
    }
    // 拥有的桃子数量
    public int size()
    {
        return list.size();
    }
    // 接受访客的访问
    public void accept(Visitor visitor)
    {
        System.out.println("桃园允许一名访客进入");
        visitor.visit(this);
        visitor.eatPeach(this);
        System.out.println("为该访客提供一条龙服务");
    }
}
