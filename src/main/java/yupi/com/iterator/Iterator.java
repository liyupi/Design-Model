package yupi.com.iterator;

/**
 * 功能描述：迭代器接口
 *
 * @author Yupi Li
 * @date 2018/08/20 17:23
 */
public interface Iterator
{
    // 是否已遍历结束
    boolean hasNext();
    // 获得下一个元素
    Object next();
}
