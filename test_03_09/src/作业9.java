public class 作业9 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++){
//            if (i >= 100) {
//                int a = i / 100;
//                int b = (i / 10) % 10;
//                int c = i % 10;
//                if (i == (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3))){
//                    System.out.println(i);
//                }
//            }
            int n = i;
            int sum = 0;
            while (n != 0){
                //double sum = 0;
                int d = n % 10;
                n = n / 10;
                sum += (int)Math.pow(d,3);
            }
            if (i == sum){
                System.out.println(i);
            }
        }
    }
}
