import java.util.Random;
import java.util.Scanner;

public class NewGuessNumber {
    public static void main(String[] args) {
        int level = getLevel();
        int range = getRange(level);
        int guessTimes = guessTimesRange(level);
        int random = getRandom(range);
        playGame(random,guessTimes);
    }

    private static int getLevel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择猜数字的难度: 0 / 1 / 2");
        return sc.nextInt();
    }

    private static void playGame(int random, int guessTimes) {
        Scanner sca = new Scanner(System.in);

        int count = 0;
        System.out.print("请输入一个数字：");
        while (sca.hasNextInt() && count < guessTimes) {
            int n = sca.nextInt();
            count++;
            if (n == random) {
                System.out.println("成功");
                return;
            } else if (n < random) {
                System.out.println("猜小了，还有 " + (guessTimes - count) + "次机会");
            } else {
                System.out.println("猜大了，还有 " + (guessTimes - count) + "次机会");
            }
        }
    }



    private static int getRandom(int range) {
        Random ran = new Random();
        //int random = ran.nextInt(range);
        return ran.nextInt(range);
    }

    private static int guessTimesRange(int level) {
        switch (level){
            case 0:
                return 5;
            case 1:
                return 10;
            case 2:
                return 20;
            default:
                return 10;
        }
    }

    private static int getRange(int level) {
        switch (level){
            case 0:
                return 5;
            case 1:
                return 10;
            case 2:
                return 20;
            default:
                return 10;
        }
    }
}
