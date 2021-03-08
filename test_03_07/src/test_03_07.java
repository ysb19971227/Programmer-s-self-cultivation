import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;


//public class test_03_07 {
//    public static void main(String[] args) {
//        int a;
//        a = 10;
//        System.out.println(a);
//        a = 20;
//        System.out.println(a);
//    }
//}


//public class  test_03_07 {
//    static int a =3;
//    public static void main(String[] args) {
//        int b = 7;
//        System.out.println(a*b);
//    }
//}


//public class  test_03_07 {
//    public static void main(String[] args) {
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//    }
//}


//public class  test_03_07 {
//    public static void main(String[] args) {
//        int maxValue =Integer.MAX_VALUE;
//        System.out.println(maxValue+1);
//        int minValue =Integer.MIN_VALUE;
//        System.out.println(minValue-1);
//    }
//}

public class  test_03_07 {
    public static void main(String[] args) {
//        long a = 30l;
//        System.out.println(a);

//        byte a = (byte)129;
//        System.out.println(a);

//        double a = 1.1;
//        System.out.println(a*a);

//        char ch = 'A';
//        System.out.println(ch);

//        byte value = 0;
//        System.out.println(value);

//        short value = 1;
//        System.out.println(value);

//        boolean a = false;
//        System.out.println(a);

//        String a = "my name\\ is\t\"张三\"";
//        System.out.println(a);

//        String a = "我是";
//        String b = "中国人";
//        int c = 520;
//        int d = 480;
//        String e = "1000";
//        String f = "2000";
//        String s ="你好中国";
////        s = s+10;
////        String s1 = String.valueOf(10);
//        String s1 = "10";
//        s = s.concat(s1);
//        int i = Integer.parseInt(e);
//        long o = Long.valueOf(f);
//        System.out.println("c = "+c+", d = "+d);
//        System.out.println(f+"个数字");
//        System.out.println(i+"个数字");
//        final int p = 30;


//          byte a = 10;
//          byte b = 20;
//          byte c =(byte)(a+b);
//        System.out.println(c);

//        int a = 1;
//        int b = 2;
//        int c = (1/2);
//        //double e = (1.0)/2;
//        double e = (double)1/2;
//        System.out.println(e);
//        int num = 10;
//        String str = num + "";
//        System.out.println(str);//自带换行
//        System.out.print(str);//不带换行
//        System.out.printf("%d \n",num);//格式化输出

//        int a = 15;
//        System.out.printf("%d \n ",~a);

//        int a = 10;
//        int b = 20;
//        int max =a > b ? a : b;
//        System.out.println(max);

//        int a = 3;
//        int b = 2;
//        double c = (a/b);
//        System.out.printf("%03d",a);

//        int num = 10;
//        if (num % 2 == 0) {
//            System.out.println("num是偶数");
//        } else if (num % 2 == 1) {
//            System.out.println("num是奇数");
//        } else {
//            System.out.println("num非奇非偶");
//        }

//        int a = 2021;
//        if (a % 100 == 0){
//            if (a % 400 ==0){
//                System.out.println("a是世纪闰年");
//            }else {
//                System.out.println("a不是闰年");
//            }
//        }else {
//            if (a % 4 == 0){
//                System.out.println("a是普通闰年");
//            }else{
//                System.out.println("a不是闰年");
//            }
//        }

//        int day = 1;
//        switch(day){
//            case 1:
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//                break;
//            default:
//                System.out.println("星期三");
//                break;
//        }

//        int num = 1;
//        while(num <= 10){
//            System.out.println(num);
//            num++;

//        int a = 1;
//        int result =0;
//        while (a <=100){
//            result += a;
//            a++;
//        }
//        System.out.println(result);

//        int i = 1;
//        int result = 1;        //5的阶乘  5*4*3*2*1
//        while (i <=5){
//            result *= i;
//            i++;
//        }
//        System.out.println(result);

//        int a = 1;//  1!+2!+3!+4!+5!
//        int result1 = 0;
//        while (a <=5){
//            int b = 1;
//            int result2 = 1;
//            while (b <= a) {
//            result2 *= b;
//            b++;
//            }
//            result1 += result2;
//            a++;
//        }
//        System.out.println(result1);

//        int a = 100;//找到100-200中第一个3的倍数
//        while (a <=200){
//            if(a % 3 ==0){
//                System.out.println(a);
//                break;//break的功能是让循环提前结束，即跳出循环
//            }
//            a++;
//        }

//        int a = 100;//找到100-200中所有3的倍数
//        while (a <=200){
//            if(a % 3 != 0){
//                a++;
//                continue;//break的功能是让循环提前结束，即跳出循环
//            }
//            System.out.println(a);
//            a++;
//        }

//        int result1 =0;       //1!+2!+3!+4!+5!
//        for (int a = 1;a <= 5;a++){
//            int result2 =1;
//         for (int b= 1;b <= a;b++){
//             result2 *= b;
//            }
//            result1 += result2;
//        }
//        System.out.println(result1);

//        Scanner sc = new Scanner(System.in);
////        System.out.println("请输入你的名字");
////        String name = sc.nextLine();
////        System.out.println("请输入你的年龄");
////        int age = sc.nextInt();
////        System.out.println("请输入你的薪资");
////        float salary = sc.nextFloat();
////        System.out.println("请输入一个十六进制数字");
////        int num = sc.nextInt(16);
////        System.out.println("你的名字是："+name+'\n'+"你的年龄是："+age+'\n'+"你的薪资是："+salary+'\n'+num);
//
//        String a = sc.nextLine();
//        System.out.println(a);
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//        double sum = 0.0;
//        int num = 0;
//        while (sc.hasNextDouble()){
//            double tmp = sc.nextDouble();
//            sum += tmp;
//            num++;
//            System.out.println(tmp);
//        }
//        System.out.println("sum = "+ sum );
//        System.out.println("avg = "+ sum / num);
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String word = sc.next();
//            System.out.println(word);
//        }
//        sc.close();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        System.out.println("toGuess : "+toGuess);
        System.out.println("请输入 0-100 间的数字");
        while (true){
            int num = sc.nextInt();
            if (num < toGuess){
                System.out.println("猜小了");
            }else if (num > toGuess){
                System.out.println("猜大了");
            }else if(num == toGuess){
                System.out.println("恭喜你，猜对了");
            }
        }
    }
}



