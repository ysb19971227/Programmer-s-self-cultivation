import java.util.Scanner;
//汉诺塔问题   用递归实现汉诺塔问题，代码如下：
public class Move {
    public static void moveDish(int level, char from, char inter, char to) {
        if (level == 1) {// 如果只有一个盘子就退出迭代
            System.out.println("从 " + from + " 移动盘子到 " + to);  //每次迭代，控制最上层的盘子移动到指定位置
        } else {// 如果有大于一个盘子就继续迭代
            moveDish(level - 1, from, to, inter);
            System.out.println("从 " + from + " 移动盘子到 " + to);//每次迭代，控制最下层的盘子移动到指定位置
            moveDish(level - 1, inter, from, to);
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入汉诺塔的层数：");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();// 设置汉诺塔为3阶
        //int nDisks = 3;
        moveDish(n, 'A', 'B', 'C');// 实现移动算法
    }
}
