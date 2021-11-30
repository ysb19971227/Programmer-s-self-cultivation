package book;

public class BookList {
    private int usedSize;
    private Book[] books = new Book[10];
    public BookList () {
        books[0] = new Book("三国演义", "罗贯中", 17, "小说");
        books[1] = new Book("西游记", "吴承恩", 47, "小说");
        books[2] = new Book("水浒传", "施耐庵", 37, "小说");
        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    //返回数组下标为pos的book
    public Book getPos(int pos) {
        return this.books[pos];
    }

    public void setBook(int pos,Book book) {
        this.books[pos] = book;
    }
}
