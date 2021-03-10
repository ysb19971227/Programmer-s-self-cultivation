import java.util.Scanner;

public class 十六进制转换十进制 {
    public static void main(String[] args) {
        //Scanner sc =  new Scanner(System.in);
        String  str = "ABCDEF";

        int len = str.length();
        long ans1 = 0;

        for (int i = 0;i < len;i++){
            char isChar = str.charAt(i);
            int isNum;
            if(isChar >= '0' && isChar <= '9'){
                isNum = isChar - '0';
            }else {
                isNum = isChar - 'A' + 10;
            }
            long ans2 = 1;
            for (int j = 0;j < len - 1 - i;j++){
                ans2 *= 16;
            }
            long ans3 = 1;
            ans3 = isNum * ans2;
            ans1 += ans3;
        }
        //sc.close();
        System.out.printf("%15d", ans1);
    }
}
