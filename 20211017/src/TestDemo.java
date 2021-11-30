public class TestDemo {
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        int ret = find(arr);
        System.out.println(ret);
    }

    private static int find(int[] arr) {
        int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ret = ret ^ arr[i];
        }
        return ret;
    }
}
