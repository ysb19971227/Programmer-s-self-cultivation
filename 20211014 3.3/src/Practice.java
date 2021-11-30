import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数字");
//        int m = sc.nextInt();
//        print(m);
//        int result = sum(m);
//        int result = numSum(m);
//        int result = fib(m);
//        print(123);
//        int result = fib2(m);
//        int result = factor(m);
//        System.out.println(result);
        func(5);
    }
    //实现代码: 递归求 N 的阶乘
    private static int factor(int n) {
        if (n == 1){
            return  1;
        }
        return n * factor(n-1);
    }

    //可以使用循环的方式来求斐波那契数列问题, 避免出现冗余运算.
    public static int fib2(int n) {
        int last2 = 0;
        int last1 = 1;
        int cur = 0;
        for (int i = 3;i <= n;i++){
            cur = last1 + last2;
            last1 = cur;
            last2 = last1;

        }
        return cur;
    }
    //求斐波那契数列的第 N 项
    private static int fib(int n) {
        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        return fib(n-2) + fib(n - 1);
    }

    //递归求 1 + 2 + 3 + ... + 10
    public static int sum(int num) {
        if (num == 1){
            return 1;
        }
        return num =num + sum((num - 1));
    }

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
    public static void print(int n) {
        if (n > 9){
            print(n / 10);
        }
        System.out.println(n % 10);
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和. 例如，输入 1729, 则应该返回1+7+2+9，
    //它的和是19
    public static int numSum(int n) {
        if(n < 10){
            return n;
        }
        return (n % 10) + numSum((n / 10));
    }
    //打印X图形，要求对角线长度为输入的数字
    public static void func(int n) {
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                if(i == j) {
                    System.out.print("*");
                }else if(i+j==n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static void main3(String[] args) {         //1 & 2 & 3 & 2 & 1
        int[] array = {1,2,3,2,1};                    //只要两个数字相等，那么一起&就为0，只剩一个数和0相与即为这个数字
        int sum = array[0];
        for (int i = 1;i < array.length;i++) {
            sum = sum ^ array[i];
        }
        System.out.println(sum);
    }
}
