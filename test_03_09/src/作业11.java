import java.util.Scanner;

public class 作业11 {
//    public static void main1(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int n = sc.nextInt();
//            int count = 0;
//            for (int i = 0; i < 32; i++) {
//                if (((1 << i) & n) != 0){
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }
//}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int count = 0;
            while (n != 0) {
                n = n & (n - 1);
                    count++;
            }
            System.out.println(count);
        }
    }
}
