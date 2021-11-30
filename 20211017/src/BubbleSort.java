import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,6,3,4};
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flg = false;
            for (int cur = 0; cur < arr.length - 1 - i; cur++) {
                if (arr[cur] > arr[cur + 1]) {
                    int tmp = arr[cur];
                    arr[cur] = arr[cur + 1];
                    arr[cur + 1] = tmp;
                    flg = true;
                }
            }
            if (flg == false) {
                break;
            }
        }
    }

//    private static void bubbleSort(int[] arr) {
//        for (int bound = 0; bound < arr.length; bound++) {
//            for (int cur = arr.length - 1 ; cur > bound; cur--) {
//                if (arr[cur - 1] > arr[cur]){
//                    int tmp = arr[cur - 1];
//                    arr[cur - 1] = arr[cur];
//                    arr[cur] = tmp;
//                }
//            }
//        }
//        private static void bubbleSort(int[] arr) {
//        for (int bound = 0; bound < arr.length; bound++) {
//            boolean flg = false;
//            for (int cur = arr.length - 1 ; cur > bound; cur--) {
//                if (arr[cur - 1] > arr[cur]){
//                    int tmp = arr[cur - 1];
//                    arr[cur - 1] = arr[cur];
//                    arr[cur] = tmp;
//                    flg = true;
//                }
//            }
//            if (flg == false) {
//                break;
//            }
//        }
//
//    }
    //冒泡排序的实现  从小到大

//    private static void bubbleSort(int[] arr) {
//        for (int bound = arr.length; bound > 0; bound--) {
//            boolean flg = false;
//            for (int cur = 0; cur < bound - 1; cur++) {
//                if (arr[cur] > arr[cur + 1]) {
//                    int tmp = arr[cur];
//                    arr[cur] = arr[cur + 1];
//                    arr[cur + 1] = tmp;
//                    flg = true;
//                }
//            }
//            if (flg == false) {
//                break;
//            }
//        }
//    }

}
