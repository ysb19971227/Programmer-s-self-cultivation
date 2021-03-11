import java.util.Arrays;

public class 测试1 {
    public static void main1(String[] args) {
//        long[] arr1 = new long[]{1,2,3,4,5};
//        long[] arr2 = new long[5];
//        String a = Arrays.toString(arr2);
//        练习1.fill(arr2,7);
//        System.out.println(a);
//        String s = Arrays.toString(arr2);
//        System.out.println(s);
//        for (long x : arr2){
//            System.out.println(x);
//        }
        test1();
    }

    private static void test1() {
        long[] arr2 = new long[5];
        String a = Arrays.toString(arr2);
        练习1.fill(arr2, 7);
        String s = Arrays.toString(arr2);
        System.out.println(a);
        System.out.println(s);
        for (long x : arr2) {
            System.out.println(x);
        }
    }

    public static int[] method() {
        return new int[] {1,2,3};
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};        //初始化
        a = new int[]{1,2,3,5,5};   //赋值

        for (int x : a) {
            System.out.println(x);
        }

        String[] b = new String[]{"你好","世界"};
        String x = Arrays.toString(b);
        System.out.println(x);

        b = new String[]{"kexi","不是你","nihao"};
        String s = Arrays.toString(b);
        System.out.println(s);

        System.out.println(a.length);

    }
}
