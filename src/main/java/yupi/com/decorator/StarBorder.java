package yupi.com.decorator;

/**
 * 功能描述：小星星边框
 *
 * @author Yupi Li
 * @date 2018/08/30 15:21
 */
public class StarBorder extends Border
{
    public StarBorder(Photo photo)
    {
        super(photo);
    }

    @Override
    String decorate()
    {
        return "** " + photo.decorate() + " **";
    }
}
