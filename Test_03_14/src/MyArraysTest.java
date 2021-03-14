import java.util.Arrays;

public class MyArraysTest {
    public static void main(String[] args) {
        //test();
        //test2();
        //test3();
        //test4();
        //test5();
        long[] arr = {3,5,4,7,8,4,8,8,1,2,3};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        //MyArrays.reverse(arr);
        MyArrays.transform2(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void test5() {
        long[] original = { 1, 2, 3, 4, 5, 6, 7, 8};
        int c = MyArrays.binarySearch(original, 6);
        System.out.println(c);

//        long[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//
//        // -1, 10 应该返回 -1
//        // [1, 9] 返回 [0, 8]
//        for (long target = -1; target <= 10; target++) {
//            System.out.println(MyArrays.binarySearch(array, target));
//        }
    }

    private static void test4() {
        long[] a = {2,5,3,4,1};
        MyArrays.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void test3() {
        long[] a = new long[]{1,1,1,1,1,1};
        long[] c = MyArrays.copyOfRange(a,1,10);
        System.out.println(Arrays.toString(c));

    }

    private static void test2() {
        long[] b = new long[]{4,5,9,2};
        //long[] original = { 1, 2, 3 };

        long[] c = MyArrays.copyOf(b,3);
        long[] d = MyArrays.copyOf(b,4);
        long[] e = MyArrays.copyOf(b,7);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
    }

    private static void test() {
        long[] array;
        String s;

        array = new long[] { 1, 2, 3, 4, 5 };
        s = MyArrays.toString(array);
        System.out.println(s);
    }
}
