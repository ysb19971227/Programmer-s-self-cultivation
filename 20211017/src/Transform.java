import java.util.Arrays;
//给定一个数组，将所有的偶数放在前半部分，奇数放在后半部分
public class Transform {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            while (left < right && arr[left] % 2 == 0){
                left++;
            }
            while (left < right && arr[right] % 2 == 1){
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}
