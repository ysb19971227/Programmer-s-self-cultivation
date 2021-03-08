import java.util.Scanner;

public class 十六进制转换到十进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long ans1 = 0;

        String hex = sc.next();
        int len = hex.length();

        for (int i = 0;i < len;i++) {
            int isNum;
            char ch = hex.charAt(i);
            if(ch >= '0' && ch<= '9') {
            isNum = ch - '0';
            }else {
                isNum = ch - 'A' + 10;
            }
            long p = 1;

            for (int j = 1;j <= len - i -1;j++){
                p *= 16;
            }
            long ans2 = p * isNum;
            ans1 += ans2;
        }

        System.out.println("最终结果是"+ans1);
    }
}
