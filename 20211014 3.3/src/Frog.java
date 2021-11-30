public class Frog{
    //实现代码: 青蛙跳台阶问题(提示, 使用递归) 一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。
    // 求该青蛙跳上一个n 级的台阶总共有多少种跳法

    //1.我们先考虑这个问题的结束条件，即最后只剩下1个或2个台阶时，递归可以结束
    //2.由题目可知，青蛙一次可以跳1个台阶或2个台阶，则总共有台阶n的可能性 可以由每次-1和-2的可能性函数关系列出
    // 即f(n) = f(n - 1) + f(n -2)；
    public static void main(String[] args) {
        System.out.println(JumpFloor(5));
    }
    public static int JumpFloor(int a) {
        if (a == 1||a == 2) {
            return a;
        }else {
            return JumpFloor(a - 1) + JumpFloor(a - 2);
        }
    }
}

