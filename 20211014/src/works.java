import java.util.Scanner;

public class works {
    //8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
    public static void main11(String[] args) {
        int count = 0;
        for (int i = 1;i <= 100;i++){
            if(i % 10 == 9){
                count++;
            }
            if (i / 10 == 9){
                count++;
            }
        }
        System.out.printf("1~100中有%d个数字9",count);
    }
//    public static void main(String[] args) {         这个程序错了
//        int count = 0,a,b;
//        for (int i = 1;i <= 100;i++){
//            a = i;
//            while(a != 0){
//                b = i % 10;
//                if (b == 9){
//                count++;
//                }
//                a /= 10;
//            }
//        }
//        System.out.printf("1~100中有%d个数字9",count);
//    }
    //9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本
    //身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
    public static void main77(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0;i <= num;i++){
            int tmp = i;
            int count = 0;
            while (tmp != 0){
                count++;
                tmp /= 10;
            }
            tmp = i;
            int sum = 0;
            while(tmp != 0){
                sum += Math.pow(tmp % 10,count);
                tmp /= 10;
            }
            if (sum == i){
                System.out.printf("水仙花数%d\n",i);
            }
        }
    }
    //10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输
    //入，最多输入三次。三次均错，则提示退出程序
    public static void main3(String[] args) {
        String passWord ="ysb4856939";
        Scanner sc = new Scanner(System.in);
        for (int i = 1;i <= 3;i++){
            String myGuess = sc.nextLine();
            if(passWord.equals(myGuess)){
                System.out.println("登陆成功");
                break;
            }else if(i != 3){
                System.out.println("登陆失败");
            }else{
                System.out.println("三次均错，退出程序");
                break;
            }
        }
    }

    //11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1      以下为参考答案：
    public static void main45(String[] args) {
//        System.out.println(Integer.bitCount(21));
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int count =0;
        while(m != 0){
            count++;
            m = m & (m-1);
        }
        System.out.println(count);
    }
    //另一种方法实现   函数返回参数二进制中 1 的个数
    public static void main66(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {       //每次循环都和1相与，只要结果为1就count++
                count++;
            }
            num = num >>> 1;            //然后，数字num右移一位
        }
    }

    //12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。        以下为参考答案：
    public static void main6(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("odd sequence:");
        for(int i=30;i>=0;i-=2){                            //奇数位
            System.out.print((num>>i)&1);
        }
        System.out.print("   even sequence:");              //偶数位
        for(int i=31;i>=1;i-=2){
            System.out.print((num>>i)&1);
        }
        sc.close();
    }
    //13. 输出一个整数的每一位.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int a;
        while (num != 0){
            a = num % 10;
            System.out.println(a);
            num /= 10;
        }
    }

}
