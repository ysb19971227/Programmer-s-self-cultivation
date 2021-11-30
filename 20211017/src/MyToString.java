import java.util.Arrays;
public class MyToString {
    //数组转字符串
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        myToString(arr);
    }

    private static void myToString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length - 1){
                ret += ",";
            }
        }
        ret += "]";
        System.out.println(ret);
    }
}
