public class Find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int location = find(arr,8);
        System.out.println(location);
    }

    private static int find(int[] arr,int a) {
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]){
                return i;
            }
        }
        return  -1;
    }
}
