package yupi.com.composite;

import java.util.List;

/**
 * 功能描述：文件夹
 *
 * @author Yupi Li
 * @date 2018/08/24 16:22
 */
public class Directory extends Entry
{
    // 一致地存放的内容（文件夹/文件）
    private List<Entry> entries;

    Directory(String name, List<Entry> entries)
    {
        super(name);
        this.entries = entries;
    }

    // 递归输出元素信息（无需区分是文件还是文件夹）
    @Override
    void getName(int depth)
    {
        for (int i = 0; i < depth; i++)
        {
            System.out.print("--");
        }
        System.out.println("文件夹：" + this.name);
        for (Entry entry : entries)
        {
            entry.getName(depth + 1);
        }
    }
}
