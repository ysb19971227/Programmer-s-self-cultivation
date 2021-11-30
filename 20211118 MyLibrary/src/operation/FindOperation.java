package operation;

import book.Book;
import book.BookList;

public class FindOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要查找的书籍 ：");
        String name = sc.nextLine();
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){
                System.out.println("书籍找到了");
                System.out.println(bookList.getPos(i));
                return;
            }
        }
        System.out.println("您要查找的书籍未找到！");
    }
}
