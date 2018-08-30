package yupi.com.decorator;

/**
 * 功能描述：老狗的照片
 *
 * @author Yupi Li
 * @date 2018/08/30 15:18
 */
public class LaoGouPhoto extends Photo
{
    protected String content;

    public LaoGouPhoto(String content)
    {
        this.content = content;
    }


    @Override
    String decorate()
    {
        return "老狗的" + content +"模特：老狗";
    }
}
