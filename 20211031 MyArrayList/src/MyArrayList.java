import java.util.Arrays;

public class MyArrayList {

    public int[] elem;
    public int usedSize;//有效的数据个数

    public MyArrayList() {
        this.elem = new int[10];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    // 获取顺序表的有效数据长度
    public int size() {
        return this.usedSize;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //第一步：判断pos是否在合理区间
        if (pos < 0 || pos > usedSize) {
            System.out.println("pos不在合理区间内");
            return;
        }
        //第二步：判断顺序表初始长度是否已经满了
        if(isFull()) {
            System.out.println("顺序表初始长度已满，已经扩容为原长度的二倍");
            this.elem = Arrays.copyOf(this.elem,elem.length*2);
        }
        //第三步：新增元素
        this.elem[pos] = data;
        //第四步：已使用的长度加一
        this.usedSize++;
    }

    public boolean isFull() {
        return this.elem.length == this.usedSize;
    }


    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.elem.length; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.elem.length; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        //第一步：pos的位置不能越界
        if (pos < 0 || pos >= usedSize) {
            System.out.println("pos位置越界了");
            return -1;
        }
        //第二步：原顺序表不能为空
        if(isEmpty()) {
            System.out.println("顺序表为空！");
            return -1;
        }

        //第三步：获取pos位置的元素
        return this.elem[pos];
    }


    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        //第一步：pos的位置不能越界
        if (pos < 0 || pos >= usedSize) {
            System.out.println("pos位置越界了");
            return;
        }
        //第二步：判断顺序表是否为空
        if (isEmpty()) {
            System.out.println("顺序表为空");
            return;
        }
        //pos位置设置元素为value
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int pos = search(toRemove);
        for (int i = pos; i < this.elem.length- 1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
        //this.elem[usedSize] = null; 如果数组当中是引用数据类型。
    }
    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
        /*for (int i = 0; i < usedSize; i++) {
            this.elem[i] = null;
        }
        */

    }
}
