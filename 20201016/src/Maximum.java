import static sun.swing.MenuItemLayoutHelper.max;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int maxValue = max(arr);
//        int maxValue = myMax(arr);
        System.out.println(maxValue);
    }

//    private static int myMax(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return  max;
//    }
}
