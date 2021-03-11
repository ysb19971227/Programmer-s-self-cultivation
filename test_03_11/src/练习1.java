import java.util.Arrays;

public class 练习1 {
    public static int indexOf(long[] arr,long tagret){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == tagret){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] arr = new long[]{1, 2, 3, 4, 5};
        int a = indexOf(arr, 3);
        int b = indexOf(arr,1,3,2);
        //fill(arr , 7);
        System.out.println(a);
        System.out.println(b);
        fill(arr, 1);
        String s = Arrays.toString(arr);
        System.out.println(s);
    }

    public static int indexOf(long[] arr, int left, int right, long tagret) {
        if (left < 0 || right > arr.length || left > right){
            throw new RuntimeException("传入的参数不合法");
        }
        for (int i = left; i < right; i++){
            if (arr[i] == tagret){
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(long[] arr, long tagret) {
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] == tagret){
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(long[] arr, int left, int right, long tagret) {
        if (left < 0 || left > right || right > arr.length) {
            throw new RuntimeException("传入的参数不合法");
        }
        for (int i = right-1; i >= left; i--){ //二分查找是左闭右开
            if (arr[i] == tagret){
                return i;
            }
        }
        return -1;
    }

    public static long max(long[] arr) {
        long max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
             max = arr[i];
            }
        }
        return max;
    }

    public static long sum(long[] arr) {
        long sum = 0;
        for (long element : arr){
            sum += element;
        }
        return sum;
    }

    public static long sum(long[] arr, int left, int right) {
        long sum = 0;
        for (int i = left; i < right; i++){
            long element = arr[i];
            sum += element;
        }
        return sum;
    }

    public static void fill(long[] arr, long tagret) {      //填充
        for (int i = 0; i < arr.length; i++){
            arr[i] = tagret;
        };
    }

}
