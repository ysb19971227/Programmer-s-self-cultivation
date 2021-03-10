import java.util.Scanner;

public class 作业1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int age = sc.nextInt();
            if (age <= 18) {
                System.out.println("少年");
            } else if (age >= 19 && age <= 28) {
                System.out.println("青年");
            } else if (age >= 29 && age <= 55) {
                System.out.println("中年");
            } else {
                System.out.println("老年");
            }
        }

    }
}
