public class 作业5 {
    public static void main(String[] args) {
         for (int i = 1;i <= 9;i++){
             for (int j = 1;j <= i;j++){
                 int mul = i * j;
                 System.out.printf("%d*%d=%-3d",j,i,mul);
             }
             System.out.println();
         }
    }
}
