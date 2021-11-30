import java.util.Scanner;
public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= m ; i++) {
            sum += factor(i);
        }
        System.out.println("sum = "+ sum);
    }
    private static int factor(int n) {
        if (n == 1){
            return  1;
        }
        return n * factor(n-1);
    }
}
