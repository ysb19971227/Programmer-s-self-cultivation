public class HomeWork2 {
    //有一组数据，只有一个数字出现一次，其他是两次，请找出这个数字
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(arr[i]);
            }
        }
    }
}
