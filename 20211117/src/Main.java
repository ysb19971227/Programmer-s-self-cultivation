import java.util.Scanner;

import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

public class Main {
    public static User login() {
        System.out.println("请输入您的姓名： ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入您的身份：1-》管理员， 0-》普通用户");
        int choice = sc.nextInt();
        if(choice == 1) {
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true) {
            int choice = user.menu();//发生了动态绑定  -》 多态
            //根据你的choice 调用合适的操作
            user.doWork(choice, bookList);
        }
    }
}
