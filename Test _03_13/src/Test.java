import java.util.Arrays;

public class Test {          //打印二维数组的方法
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                null,
                {4,5,6,7},
                null
        };

        print二维数组(arr);
        System.out.printf("\n");
        System.out.println(Arrays.deepToString(arr));
    }

    private static void print二维数组(int[][] arr) {
        if (arr == null){
            System.out.println("null");
        }
        System.out.println("[");
        for (int i = 0;i < arr.length;i++){
            System.out.print("    ");
            if (arr[i] == null){
                System.out.println("null");
                continue;
            }
            for (int j = 0;j < arr[i].length;j++){
                System.out.printf("%d",arr[i][j]);
                if (j != arr[i].length - 1){
                    System.out.print(",");
                }
            }
            System.out.printf("\n");
        }
        System.out.println("]");
    }
}
