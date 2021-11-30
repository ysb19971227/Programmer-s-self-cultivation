public class IsSorted {
    //判断数组是否是升序
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean a = isSorted(arr);
        System.out.println(a);
    }

    private static boolean isSorted(int[] arr) {
        int start = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < start){
                return false;
            }else{
                start = arr[i];
            }
        }
        return true;
    }
}
