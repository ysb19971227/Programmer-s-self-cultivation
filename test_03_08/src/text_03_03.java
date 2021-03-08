public class text_03_03 {  //  用方法计算 1!+2!+3!+4！+5！
    public static int fac(int n){   //实现阶乘方法
        int a = 1;
        for(int i = 1;i <= n;i++){
            a *= i;
        }
        return a;
    }
    public static void main(String[] args) {   //实现相加的方法
        int sum = 0;
        for (int b = 1;b <= 5;b++){
            sum += text_03_03.fac(b);
        }
        System.out.println("相加结果为"+sum);
    }
}



