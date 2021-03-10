import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int bound ;
        int times ;
        System.out.println("请选择难度 0/1/2");

        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        switch (level){
            case 0:
                bound = 10;
                times = 5;
                break;
            case 1:
                bound = 100;
                times = 15;
                break;
            case 2:
                bound = 1000;
                times = 20;
                break;
            default:
                bound = 100;
                times = 10;
                break;
        }

        Random ran = new Random();
        int r = ran.nextInt(bound);
        int count = 0;
        while (sc.hasNextInt() && count <times){
            int guessNumber = sc.nextInt();
            if (r == guessNumber){
                System.out.println("恭喜你猜对了");
            }else if (guessNumber < r){
                System.out.println("猜小了");
            }else {
                System.out.println("猜大了");
            }
            count++;
        }
        System.out.println("送你一朵小红花");
    }
}
