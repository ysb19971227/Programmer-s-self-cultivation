import java.util.Scanner;

public class 作业2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            boolean a = true;
            for(int i = 2;i < num - 1;i++){

                if ((num % i) == 0){
                    System.out.println(num+"不是素数");
                    a = false;
                    break;
                }
            }
            if (a == true){
                System.out.println(num+"是素数");
            }
        }
    }
}
