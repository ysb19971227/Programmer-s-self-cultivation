import java.util.Scanner;

public class 时间转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds/60) % 60;
        int second = seconds % 60;
        System.out.println(hours+" "+minutes+" "+second);
    }
}
