import java.util.Scanner;
import java.util.Random;
public class Test {
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入你的工资");
        float salary = sc.nextFloat();
        sc.close();
        System.out.println("姓名："+name+"\n"+"年龄: "+age+"\n"+"工资"+"salary");
    }
//使用Scanner循环读取N个数字
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        double sum = 0.0;
        while(sc.hasNextDouble()){
            double tmp =sc.nextDouble();
            sum+=tmp;
            num++;
        }
        System.out.println("sum = "+sum);
        System.out.println("avg ="+sum/num);
        sc.close();
    }
//猜数字游戏  范围在（1-100）的随机整数
    public static void main1(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        System.out.println("请输入猜的数字");
        while(sc.hasNextInt()){
            System.out.println("请输入猜的数字");
            int myGuess = sc.nextInt();
            if(myGuess<toGuess){
                System.out.println("猜小了");
            }else if(myGuess>toGuess){
                System.out.println("猜大了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
        sc.close();

    }
}
