public class 作业8 {        // 数字 1 到数字 100 中有多少个数字 9
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++){
            int n = i;
            while (n != 0){
                int a =(n % 10);
                if (a == 9){
                    count++;
                }
                n = n / 10;
            }
        }
        System.out.println(count);
    }
}
