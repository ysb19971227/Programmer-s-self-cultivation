public class 作业3 {
    public static void main(String[] args) {
        for (int i = 0;i < 100;i++){
            boolean a = true;
            for(int j = 2;j < i - 1;j++){

                if ((i % j) == 0){
                    //System.out.println(i+"不是素数");
                    a = false;
                    break;
                }
            }
            if (a == true){
                System.out.println(i);
            }
        }
    }
}
