package yupi.com.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：书架类（具体集合类）
 *
 * @author Yupi Li
 * @date 2018/08/20 17:24
 */
public class BookShelf implements Aggregate
{
    // 书本集合
    private List<Book> list = new LinkedList<>();
    // 获取指定标号的书
    public Book getBook(int index)
    {
        return list.get(index);
    }
    // 添加一本书
    public BookShelf addBook(Book book){
        list.add(book);
        return this;
    }
    // 已存放书的数量
    public int size()
    {
        return list.size();
    }
    // 获取具体迭代器
    @Override
    public Iterator iterator()
    {
        return new BookShelfIterator(this);
    }
}
