package yupi.com.decorator;

/**
 * 功能描述：鱼皮的照片
 *
 * @author Yupi Li
 * @date 2018/08/30 15:20
 */
public class YupiPhoto extends Photo
{

    protected String content;

    public YupiPhoto(String content)
    {
        this.content = content;
    }

    @Override
    String decorate()
    {
        return "鱼皮的" + content + "主角：鱼皮";
    }

}
