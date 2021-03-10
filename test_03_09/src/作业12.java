import java.util.Scanner;   //获取一个二进制序列中所有的偶数位和奇数位

public class 作业12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 0; i < 32; i++) {
                if (((1 << i) & n) != 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
