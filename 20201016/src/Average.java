public class Average {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        double ave = myAve(arr);
        System.out.println(ave);
    }

    private static double myAve(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/ arr.length;
    }
}
