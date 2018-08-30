package yupi.com.decorator;

/**
 * 功能描述：天空边框
 *
 * @author Yupi Li
 * @date 2018/08/30 15:21
 */
public class SkyBorder extends Border
{
    public SkyBorder(Photo photo)
    {
        super(photo);
    }

    @Override
    String decorate()
    {
        return "-- " + photo.decorate() + " --";
    }
}
