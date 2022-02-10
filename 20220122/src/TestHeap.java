import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/1/22
 * Time: 10:18
 * Description:
 */
public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
    }

    /**
     * 向下调整函数的实现
     * @param parent 每棵树的根节点
     * @param len 每棵树的调整的结束位置  10
     */
    public void shiftDown(int parent,int len) {
        int child = 2*parent+1;
        //1、最起码 是有左孩子的，至少有1个孩子
        while (child < len) {
            if(child+1 < len && elem[child] < elem[child+1]) {
                child++;//保证当前左右孩子最大值的下标
            }
            if(elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    public void createHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            elem[i] = array[i];
            usedSize++;
        }
        //根据代码 显示的时间复杂度   看起来 应该是O(n*logn)  但是 实际上是O(n)
        for (int parent = (usedSize-1-1)/2; parent >= 0 ; parent--) {
            //调整
            shiftDown(parent,usedSize);
        }
    }

    private void shiftUp(int child) {
        int parent = (child-1)/2;
        while (child > 0) {
            if(elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }
        }
    }

    public void offer(int val) {
        if(isFull()) {
            //扩容
            elem = Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize++] = val;
        //注意这里传入的是usedSize-1
        shiftUp(usedSize-1);
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("优先级队列为空！");
        }
        int tmp = elem[0];
        elem[0] = elem[usedSize-1];
        elem[usedSize-1] = tmp;
        usedSize--;
        shiftDown(0,usedSize);
        return tmp;
    }


    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("优先级队列为空！");
        }
        return elem[0];
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }


    public void heapSort() {
        int end = this.usedSize-1;
        while (end > 0) {
            int tmp = elem[0];
            elem[0] = elem[end];
            elem[end] = tmp;
            shiftDown(0,end);
            end--;
        }
    }

}
