import java.util.Scanner;           //要学会用 boolean 的用法

public class 作业10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码");
        String realPassWord = "ysb4856939";
        int count = 1;
        //boolean isRight = true;
        while (sc.hasNext() && count <= 3){
            String passWord = sc.next();
            if (passWord.equals(realPassWord)){
               // isRight = true;
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("密码错误");
            }
            count++;
            if (count == 4){
                System.out.println("将在一分钟后退出程序");
            }
        }
    }
}
