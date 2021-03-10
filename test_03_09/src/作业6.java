import java.util.Scanner;

public class 作业6 {            //求解两个正整数的最大公约数    用辗转相除法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        while (true){
            if (m < n){        //保证 m 的值一直大于 n
                int t = n;
                n = m;
                m = t;
            }
            int r = m % n;     //辗转相除
            if (r == 0){
                break;
            }
            m = n;
            n = r;
        }
    }
}
