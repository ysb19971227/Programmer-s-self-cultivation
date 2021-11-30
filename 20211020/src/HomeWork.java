//打印出X图案
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 2~20 之间的一个整数");
        int m = sc.nextInt();
        for (int i = 0; i < m / 2; i++) {
            for (int n = 0; n < i; n++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= m-2-2*i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        if (m % 2 != 0 ){
            for (int l = 1; l <= m/2; l++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = (m / 2)-1; i >= 0; i--) {
            for (int n = 0; n < i; n++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= m-2-2*i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
