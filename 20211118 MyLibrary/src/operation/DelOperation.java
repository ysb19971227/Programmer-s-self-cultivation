package operation;

import book.Book;
import book.BookList;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要删除的书籍 ：");
        String name = sc.nextLine();
        int currentSize = bookList.getUsedSize();
        int i = 0;
        int index = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (book.getName().equals(name)){
                index = i;
                break;
            }
        }
        if (i >= currentSize) {
            System.out.println("没有要删除的书籍！");
            return;
        }
        for (int j = index; j < currentSize-1; j++) {
            Book book = bookList.getPos(j+1);
            bookList.setBook(j,book);
        }
        bookList.setBook(currentSize-1,null);
        bookList.setUsedSize(currentSize-1);
        System.out.println("书籍已经删除");
    }
}
