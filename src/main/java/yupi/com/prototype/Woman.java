package yupi.com.prototype;

/**
 * 功能描述：女人（拥有基本属性和自我介绍功能）
 *
 * @author Yupi Li
 * @date 2018/08/23 12:50
 */
public abstract class Woman implements Cloneable
{
    protected String height;
    protected String weight;
    protected String name;

    // Prototype模式核心，创建克隆
    abstract Woman createClone();

    // 自我介绍
    void selfIntroduce()
    {
        System.out.println(name + "的身高是" + height + "，体重是" + weight);
    }

    public String getHeight()
    {
        return height;
    }

    public void setHeight(String height)
    {
        this.height = height;
    }

    public String getWeight()
    {
        return weight;
    }

    public void setWeight(String weight)
    {
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
