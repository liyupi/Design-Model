package yupi.com.iterator;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/21 13:55
 */
public class Main
{
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf();
        Book book1 = new Book("六年级语文");
        Book book2 = new Book("大学语文");
        Book book3 = new Book("博士语文");
        bookShelf.addBook(book1).addBook(book2).addBook(book3);
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
