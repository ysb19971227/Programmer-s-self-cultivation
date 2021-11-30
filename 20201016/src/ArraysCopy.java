import java.util.Arrays;
public class ArraysCopy {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int[] newArr = myCopyOf(arr,arr.length);
        System.out.println("newArr : "+Arrays.toString(newArr));
//        arr[0] = 10;
//        System.out.println("arr : "+Arrays.toString(arr));
//        System.out.println("newArr : "+Arrays.toString(newArr));
//        int[] newArr2 = Arrays.copyOfRange(arr,1,4);
//        System.out.println("newArr2 : "+Arrays.toString(newArr2));

    }
    //实现myCopyOf
    private static int[] myCopyOf(int[] arr, int length) {
        int[] ret = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            ret[i] = arr[i];
        }
        return ret;
    }

}
