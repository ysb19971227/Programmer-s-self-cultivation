package user;
import book.BookList;
import operation.IOperation;

public abstract class User {
    protected String name;
    protected IOperation[] iOperations;
    User(String name) {
        this.name = name;
    }
    public abstract int menu();

    public void doWork(int choice, BookList booklist) {
        iOperations[choice].work(booklist);
    }
}
