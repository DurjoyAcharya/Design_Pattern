package ProtoType;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    public String ShopName;
    List<Book> bookList=new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public void loadData()
    {
        for (int i = 0; i < 20; i++) {
            var books=new Book();
            books.setBid(i);
            books.setBname("Book "+i);
            bookList.add(books);
        }
    }
    @Override
    public String toString() {
        return "BookShop{" +
                "ShopName='" + ShopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        var bookshop=new BookShop();
        return bookshop;
    }
}
