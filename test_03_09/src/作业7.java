public class 作业7 {
    public static void main(String[] args) {
//        double sum = 0.0;
//        for (int i = 1;i <= 100;i++){
//
//            double item = 1.0 / i;
//            if (i % 2 == 0){
//                sum = sum - item;
//            }else {
//                sum = sum + item;
//            }
//        }
//        System.out.println(sum);
        double sum = 0;
        for (int i = 1;i <= 100;i++){
            int pow = (int) Math.pow((-1),(i + 1));
            double num = 1.0/(i*(pow));
            sum += num;
        }
        System.out.println(sum);
    }
}
