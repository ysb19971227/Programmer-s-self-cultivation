public class HomeWork4 {
    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
    //还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static void main(String[] args) {

    }
    public static int max(int a,int b) {
        if (a >= b){
            return a;
        }else {
            return b;
        }
    }
    public static double max(double a,double b) {
        if (a >= b){
            return a;
        }else {
            return b;
        }
    }
    public static double max(double a,double b,int c) {
        if (a >= b && a >= c){
            return a;
        }else if(b >= c) {
            return b;
        }else {
            return c;
        }
    }
}
