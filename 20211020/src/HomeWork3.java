public class HomeWork3 {
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int max = max3(a,b,c);
        System.out.println(max);
    }
    private static int max3(int a, int b, int c) {
        if (a >= max2(b,c)){
            return a;
        }else{
            return max2(b,c);
        }
    }
    public static int max2(int a,int b) {
        if (a >= b){
            return a;
        }else{
            return b;
        }
    }
}
