import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/1/15
 * Time: 11:11
 * Description:
 */
public class MyStack {
    public int[] elem;
    public int usedSize;

    public MyStack() {
        this.elem = new int[5];
    }

    public void push(int val) {
        if(isFull()) {
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("栈为空！");
        }
        int oldVal = this.elem[usedSize-1];
        this.usedSize--;
        return oldVal;
    }

    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("栈为空！");
        }
        return this.elem[usedSize-1];
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }
}
