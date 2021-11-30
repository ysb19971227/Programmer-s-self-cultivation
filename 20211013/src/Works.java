import java.util.Scanner;

public class Works {
    //1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        if(age<=18){
            System.out.println("少年");
        }else if(age>=19 && age<=28){
            System.out.println("青年");
        }else if(age>=29 && age<=56){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
        sc.close();
    }
    //2. 判定一个数字是否是素数
    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        int i = 2;
        for(;i <= Math.sqrt(num);i++){
            if(num % i == 0){
                System.out.println("不是素数");
                break;
            }
        }
        if(i > Math.sqrt(num)){
            System.out.println("是素数");
        }
    }

    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        int i = 2;
        for(;i <= num/2;i++){
            if(num % i == 0){
                System.out.println("不是素数");
                break;
            }
        }
        if(i > num/2){
            System.out.println("是素数");
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        int i = 2;
        for(;i < num;i++){
            if(num % i == 0){
                System.out.println("不是素数");
                break;
            }
        }
        if(num == i){
            System.out.println("是素数");
        }
    }
//3. 打印 1 - 100 之间所有的素数
    public static void main3(String[] args) {
        int num = 1;
        for (;num <= 100;num++){
            int i = 2;
            for(;i < num;i++){
                if (num % i == 0){
                    break;
                }
            }
            if(num == i){
                System.out.println(num);
            }
        }
    }
    //4. 输出 1000 - 2000 之间所有的闰年
    public static void main4(String[] args) {
        int i = 1000;
        for (;i <= 2000;i++){
            if(i % 100 == 0){
                if(i % 400 == 0){
                    System.out.println(i);
                }
            }else if(i % 4 == 0){
                System.out.println(i);
            }
        }
    }
    //5. 输出乘法口诀表
    public static void main5(String[] args) {
        for (int i = 1;i < 10;i++){
            for (int j = 1;j <= i;j++){
                int sum = 0;
                sum = i * j;
                System.out.printf("%d * %d = %d ",j,i,sum);

            }
            System.out.println("\n");
        }
    }
    //6. 求两个正整数的最大公约数
    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int tmp = m % n;
        while (tmp != 0){
            m = n;
            n = tmp;
            tmp = m % n;
        }
        System.out.println("最大公约数为："+ n);
        sc.close();;
    }
    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m > n){
            int tmp = 0;
            int a = 0;
            do{
                tmp = m % n;
                if (tmp == 0){
                    System.out.printf("最大公约数为%d",n);
                }
                a = n;
                m = a;
                n = tmp;
            }while(tmp != 0);
        }
        sc.close();;
    }
    //7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
    public static void main9(String[] args) {
        double sum = 0;
//        int flg = 1;
        for (int i = 1;i <= 100;i++){
            sum += (Math.pow(-1,i+1)*(1.0/(i)));
//            flg = -flg;
        }
        System.out.println(sum);
    }
}
