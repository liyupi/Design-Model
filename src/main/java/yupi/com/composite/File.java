package yupi.com.composite;

/**
 * 功能描述：文件
 *
 * @author Yupi Li
 * @date 2018/08/24 16:22
 */
public class File extends Entry
{

    File(String name)
    {
        super(name);
    }

    // 输出文件名
    @Override
    void getName(int depth)
    {
        for (int i = 0; i < depth; i++)
        {
            System.out.print("--");
        }
        System.out.println("文件：" + this.name);
    }
}
