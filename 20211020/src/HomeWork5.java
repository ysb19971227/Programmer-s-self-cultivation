public class HomeWork5 {
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
    //并执行代码，求出结果
    public static void main(String[] args) {
        int a = 1, b = 2;
        double c = 1.1, d = 2.2, e = 3.3;
        System.out.println("a + b = "+sum1(a,b));
        System.out.println("c + d + e = "+sum2(c,d,e));
    }
    public static int sum1(int a,int b) {
        return (a + b);
    }
    public static double sum2(double a, double b, double c) {
        return (a + b + c);
    }
}
