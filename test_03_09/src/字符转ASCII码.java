import java.util.Scanner;

public class 字符转ASCII码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        char ch = word.charAt(0);
        System.out.println((int)ch);

    }
}
