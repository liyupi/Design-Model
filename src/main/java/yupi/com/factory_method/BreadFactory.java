package yupi.com.factory_method;

/**
 * 功能描述：面包工厂（具体工厂）
 *
 * @author Yupi Li
 * @date 2018/08/22 14:34
 */
public class BreadFactory extends FoodFactory
{
    // 具体生产某种食物
    @Override
    Food createFood()
    {
        return new Bread();
    }

    // 具体的安全证明
    @Override
    void safetyProof(String name)
    {
        System.out.println("产品名：" + name + " 该面包保证安全");
    }
}
