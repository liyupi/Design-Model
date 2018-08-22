package yupi.com.factory_method;

/**
 * 功能描述：披萨（具体食物）
 *
 * @author Yupi Li
 * @date 2018/08/22 14:33
 */
class Pizza extends Food
{
    @Override
    public void wrap()
    {
        System.out.println("用盒子包装" + name);
    }
}
