public class TwoDimensionArrays {
    //二维数组
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf("%d\t",arr[row][col]);
            }
            System.out.println("");
        }
    }


}
