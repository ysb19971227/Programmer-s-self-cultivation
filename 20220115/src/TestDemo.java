import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/1/14
 * Time: 20:24
 * Description:
 */

class MinStack {


    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(!minStack.empty()) {
            int top = minStack.peek();
            //比较 小于等于的话 也要放进去
            if(val <= top) {
                minStack.push(val);
            }
        }else{
            minStack.push(val);
        }
    }

    public void pop() {
        int popVal = stack.pop();
        if(!minStack.empty()) {
            int top = minStack.peek();
            if(top == popVal) {
                minStack.pop();
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
public class TestDemo {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                //如果是左括号 直接入栈
                stack.push(ch);
            }else{
                //遇到了右括号
                if(stack.empty()) {
                    //右括号多
                    System.out.println("右括号多");
                    return false;
                }
                char top = stack.peek();//哪个左括号
                if(top == '{' && ch == '}' || top == '[' && ch == ']' || top == '(' && ch == ')') {
                    stack.pop();
                }else{
                    //左右括号不匹配
                    System.out.println("左右括号不匹配");
                    return false;
                }
            }
        }
        if(!stack.empty()) {
            //左括号多
            System.out.println("左括号多");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());//弹出栈顶元素，并且删除 6
        System.out.println(stack.pop());//弹出栈顶元素，并且删除 5
        System.out.println(stack.pop());//弹出栈顶元素，并且删除 4
        System.out.println(stack.pop());//弹出栈顶元素，并且删除 3
        System.out.println(stack.pop());//弹出栈顶元素，并且删除 2
        System.out.println(stack.pop());//弹出栈顶元素，并且删除 1
        System.out.println(stack.peek());//获取栈顶元素，但是不删除 5
        System.out.println(stack.peek());//获取栈顶元素，但是不删除 5
        System.out.println(stack.isEmpty());//false
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i < tokens.length;i++) {
            String val = tokens[i];
            if(isOperation(val) == false) {
                //如果不是运算符
                stack.push(Integer.parseInt(val));
            }else {
                //到底啥运算符？？？？
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch(val) {
                    case "+":
                        stack.push(num1+num2);
                        break;
                    case "-":
                        stack.push(num1-num2);
                        break;
                    case "*":
                        stack.push(num1*num2);
                        break;
                    case "/":
                        stack.push(num1/num2);
                        break;
                }
            }
        }
        return stack.pop();
    }
    private boolean isOperation(String x) {
        if(x.equals("+") || x.equals("-") ||x.equals("*") ||x.equals("/")) {
            return true;
        }
        return false;
    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        Stack<Integer> stack = new Stack<>();
        int j = 0;//遍历popA
        for(int i = 0; i < pushA.length;i++) {
            stack.push(pushA[i]);
            while(j < popA.length && !stack.empty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }
    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());//弹出栈顶元素，并且删除 4
        System.out.println(stack.peek());//获取栈顶元素，但是不删除 3
        System.out.println(stack.peek());//获取栈顶元素，但是不删除 3
        System.out.println(stack.empty());
        System.out.println("============");
        System.out.println(stack.isEmpty());
    }
}
