package yupi.com.composite;

/**
 * 功能描述：元素（把容器和内容都当作元素进行统一的处理）
 *
 * @author Yupi Li
 * @date 2018/08/24 16:19
 */
public abstract class Entry
{
    String name;
    // 递归深度
    int depth;

    Entry(String name)
    {
        this.name = name;
    }

    // 输出名称
    abstract void getName(int depth);
}
