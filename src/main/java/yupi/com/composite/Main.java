package yupi.com.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/24 16:28
 */
public class Main
{
    public static void main(String[] args){
        Entry file1 = new File("文件一");
        Entry file2 = new File("文件二");
        Entry file3 = new File("文件三");
        // 创建文件列表，放入文件二和文件三
        List<Entry> list1 = new LinkedList<>();
        list1.add(file2);
        list1.add(file3);
        // 创建目录
        Entry folder1 = new Directory("二级目录",list1);
        // 创建文件列表，放入文件一和二级文件目录
        List<Entry> list2 = new LinkedList<>();
        list2.add(file1);
        list2.add(folder1);
        Entry folder2 = new Directory("一级目录",list2);
        folder2.getName(0);
    }
}
