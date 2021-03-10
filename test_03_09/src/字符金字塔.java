import java.util.Scanner;

public class 字符金字塔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String print = sc.next();
        int lines = 5;
        int d = 1;

        while (d <= lines) {
            for (int i = 0; i <(lines - d); i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < d; i++){
                System.out.print(print + " ");
            }
            System.out.println();
            d++;

        }
    }
}
