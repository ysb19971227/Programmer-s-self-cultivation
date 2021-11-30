import java.util.Arrays;
public class CopyArray {
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = copyOf(arr);
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] copyOf(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }
}
