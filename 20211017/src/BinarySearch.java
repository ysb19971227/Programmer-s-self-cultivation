public class BinarySearch {
    //查找数组中的指定元素的位置 用二分查找的办法
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int value = binarySearch(arr,6);
        System.out.println(value);
    }

    private static int binarySearch(int[] arr, int a) {
        int left = 0;
        int right = arr.length -1 ;
        while (left <= right){
            int mid = (int) (0.5*(left + right));
            if (arr[mid] < a){
                left = mid + 1;
            }else if(arr[mid] > a){
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
