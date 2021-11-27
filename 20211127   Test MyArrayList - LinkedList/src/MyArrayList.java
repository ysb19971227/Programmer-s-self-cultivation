import java.util.Arrays;

public class MyArrayList {
    private int[] elem;
    private int usedSize;

    public MyArrayList() {
        this.elem = new int[10];
    }

    public int size() {
        return this.usedSize;
    }

    public void disPlay() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return (this.elem.length == this.usedSize);
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > elem.length) {
            System.out.println("给定pos位置异常！");
            return;
        }
        if (isFull()) {
            System.out.println("数组已经满了，自动扩容为原数组长度的二倍");
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
            return;
        }
        for (int i = pos; i < this.usedSize-1; i++) {
            elem[i+1] = elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        //第步：判断pos位置是否越界
        if (pos < 0 || pos > elem.length) {
            System.out.println("给定pos位置异常！");
            return -    1;
        }
        //第二步：判断顺序表是否为空
        if (isEmpty()) {
            System.out.println("顺序表为空");
            return -1;
        }
        return elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        //第步：判断pos位置是否越界
        if (pos < 0 || pos > elem.length) {
            System.out.println("给定pos位置异常！");
            return;
        }
        //第二步：判断顺序表是否为空
        if (isEmpty()) {
            System.out.println("顺序表为空");
            return;
        }
        elem[pos] = value;
    }

    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int pos = search(toRemove);
        for (int i = pos; i < this.usedSize; i++) {
            elem[i] = elem[i+1];
        }
        this.usedSize--;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }


}
