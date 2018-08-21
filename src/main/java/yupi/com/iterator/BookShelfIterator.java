package yupi.com.iterator;

/**
 * 功能描述：书架迭代器（具体迭代器）
 *
 * @author Yupi Li
 * @date 2018/08/20 17:25
 */
public class BookShelfIterator implements Iterator
{
    private int index;
    private BookShelf bookShelf;

    BookShelfIterator(BookShelf bookShelf)
    {
        this.index = 0;
        this.bookShelf = bookShelf;
    }

    // 是否已遍历结束
    @Override
    public boolean hasNext()
    {
        if (index < bookShelf.size())
        {
            return true;
        }
        return false;
    }

    // 获取下一本书
    @Override
    public Book next()
    {
        return bookShelf.getBook(index++);
    }
}
