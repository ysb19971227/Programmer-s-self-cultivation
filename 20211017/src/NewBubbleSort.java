import java.util.Arrays;
public class NewBubbleSort {
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void main(String[] args) {
        int[] arr = {7,5,4,2,6,3,1};
        System.out.println(Arrays.toString(arr));
        newBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void newBubbleSort(int[] arr) {

        for (int bound = arr.length; bound > 1; bound--) {
            for (int i = 0; i < bound - 1; i++) {
                if (arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
    }
}
