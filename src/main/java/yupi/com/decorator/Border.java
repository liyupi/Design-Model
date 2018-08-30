package yupi.com.decorator;

/**
 * 功能描述：装饰边框
 *
 * @author Yupi Li
 * @date 2018/08/30 15:20
 */
public abstract class Border extends Photo
{
    protected Photo photo;

    public Border(Photo photo)
    {
        this.photo = photo;
    }
}
