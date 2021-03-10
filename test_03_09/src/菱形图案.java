import java.util.Scanner;

public class 菱形图案 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = '*';

        while (sc.hasNextInt()) {
            int lines = sc.nextInt();
            int d = 1;

            while (d <= lines) {
                for (int i = 0; i < (lines - d + 1); i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < d; i++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
                d++;
            }
            for (int i = 0;i < lines + 1;i++){
                System.out.print(ch + " ");
            }
            System.out.println();
            int e = 1;
            while (e <= lines) {
                for (int i = 0; i < e; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < (lines - e + 1); i++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
                e++;
            }
        }
    }
}
