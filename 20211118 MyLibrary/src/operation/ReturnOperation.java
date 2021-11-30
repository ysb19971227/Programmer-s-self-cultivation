package operation;

import book.Book;
import book.BookList;

public class ReturnOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要借的书籍 ：");
        String name = sc.nextLine();
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){
                book.setBorrowed(false);
                System.out.println("归还成功！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("书籍已经归还");
    }
}
