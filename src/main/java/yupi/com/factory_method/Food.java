package yupi.com.factory_method;

/**
 * 功能描述：食物（一类产品）
 *
 * @author Yupi Li
 * @date 2018/08/22 14:29
 */
public abstract class Food
{
    // 产品名称
    String name;

    // 食物的包装方法
    abstract void wrap();
}
