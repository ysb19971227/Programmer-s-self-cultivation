import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // 该循环结束, left 就指向了一个奇数
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            // 该循环结束, right 就指向了一个偶数
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            // 交换两个位置的元素
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }

}

