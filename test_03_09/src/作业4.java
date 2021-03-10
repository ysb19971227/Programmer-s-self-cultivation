import java.util.Scanner;

public class 作业4 {
    public static void main(String[] args) {
        for (int i = 1000;i <= 2000;i++){
            if (i % 400 == 0){
                System.out.println(i);
            }else if(i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}
