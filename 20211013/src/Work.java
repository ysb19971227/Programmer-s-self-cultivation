import java.util.Scanner;
public class Work {
    //5. 输出乘法口诀表
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 1;i < m;i++){
            for (int j = 1;j <= i;j++){
                int sum = 0;
                sum = i * j;
                System.out.printf("%d * %d = %d ",j,i,sum);

            }
            System.out.println("\n");
        }
    }
}
