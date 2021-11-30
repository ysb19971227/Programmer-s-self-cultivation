package operation;

import book.Book;
import book.BookList;

public class AddOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要增加的书籍名称 ：");
        String name = sc.nextLine();
        System.out.println("请输入要增加的书籍作者 ：");
        String author = sc.nextLine();
        System.out.println("请输入要增加的书籍价格 ：");
        int price = sc.nextInt();
        System.out.println("请输入要增加的类别 ：");
        String type = sc.nextLine();
        Book book = new Book(name,author,price,type);
        int size = bookList.getUsedSize();
        bookList.setBook(size,book);
        bookList.setUsedSize(size+1);
        System.out.println("书籍已经增加了");
    }
}
