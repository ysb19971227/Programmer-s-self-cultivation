package operation;

import book.Book;
import book.BookList;

public class BorrowOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要借的书籍 ：");
        String name = sc.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("书籍已经借出");
    }
}
