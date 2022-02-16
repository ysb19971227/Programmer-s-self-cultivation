import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/1/23
 * Time: 12:07
 * Description:
 */
public class TesSort {

    /**
     * 时间复杂度：O(N^2) 。逆序的时候
     *      最好的情况是O(N): 对于直接插入排序来说，最好的情况就是数据有序的时候
     *      根据这个结论，推导出另一个结论：对于直接插入排序来说，数据越有序，越快。
     *      多用于排序的优化上，比如快速排序的优化
     *
     * 空间复杂度：O(1)
     * 稳定性：稳定的
     *
     * 一个稳定的排序，可以实现为不稳定的排序
     * 但是一个本身就不稳定的排序，是不可以变成稳定的排序的
     * 经常使用在  数据量不多   且 整体数据 趋于有序了
     * @param array
     */

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0 ; j--) {
                if(array[j] > tmp) {   //此处如果有等号就不稳定了，
                    array[j+1] = array[j];
                }else {
                    //array[j+1] = tmp;  只要j回退的时候，遇到了 比tmp小的元素就结束这次的比较
                    break;
                }
            }
            //j回退到了 小于0 的地方
            array[j+1] = tmp;
        }
    }

    /**
     * 其实就是一个直接插入排序
     * @param array 待排序序列
     * @param gap 组数
     */
    public static void shell(int[] array,int gap) {
        for (int i = gap; i < array.length; i++ ) {
            int tmp = array[i];
            int j = i-gap;
            for (; j >= 0 ; j -= gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    /**
     * 时间复杂度[和增量有关系的]：O(n^1.3 - n^1.5)
     * 空间复杂度：O(1)
     * 稳定性：不稳定的
     *   看在比较的过程当中  是否发生了跳跃式的交换 如果发生了跳跃式的交换  那么就是不稳定的排序
     * 基本上没有考过
     * @param array
     */
    public static void shellSort(int[] array) {
        int gap = array.length;
        while (gap > 1) {
            shell(array,gap);
            gap /= 2;
        }
        shell(array,1);//保证最后是1组
    }

    public static void shellSort1(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    public static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    /**
     * 选择排序
     * 时间复杂度：O(N^2)
     *
     * 时间复杂度 != 代码的运行时间
     *
     * 其实 不是看你运行的时间 来说明的 时间只是一个衡量的某个标准
     * 空间复杂度：O(1)
     * 稳定性：不稳定的排序
     * @param array 待排序序列
     */
    public static void selectSort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                //1 2 3 4 5 6
                if(array[j] < array[i]) {
                    swap(array,i,j);
                }
            }
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                //找到最小值下标
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array,i,minIndex);
        }
    }


    /**
     * 时间复杂度：O(N * log N)
     *
     * 空间复杂度：O(1)
     *
     * 稳定性：不稳定
     *
     * 面试 写堆排序  就是 写的调整过程
     *
     * @param array
     */
    public static void heapSort(int[] array) {
        //1、建堆  O(N)
        createHeap(array);
        int end = array.length-1;
        //2、交换然后调整 O(N * log N)
        while (end > 0) {
            swap(array,0,end);
            shiftDown(array,0,end);
            end--;
        }
    }

    public static void createHeap(int[] array) {
        for (int parent = (array.length-1-1)/2; parent >= 0 ; parent--) {
            shiftDown(array,parent,array.length);
        }
    }

    public static void shiftDown(int[] array,int parent,int len) {
        int child = 2*parent+1;//左孩子下标
        while (child < len) {
            if(child+1 < len && array[child] < array[child+1]) {
                child++;
            }
            //child下标 就是左右孩子最大值的下标
            if(array[child] > array[parent]) {
                swap(array,child,parent);
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    /**
     * 冒泡排序
     * 时间复杂度：O(N^2)  这个代码 不管是好是坏  都是
     * 空间复杂度：O(1)
     * 稳定性：稳定的排序
     * @param array
     */
    public static  void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]) {
                    swap(array,j+1,j);
                }
            }
        }
    }

    /**
     * 冒泡排序
     * 时间复杂度：O(N^2)
     * 有序情况下：O(n)
     * 空间复杂度：O(1)
     * 稳定性：稳定的排序
     * @param array
     */
    public static void bubbleSort2(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    swap(array,j+1,j);
                    flg = true;
                }
            }
            if(flg == false) {
                break;
            }
        }
    }


    /**
     * 时间复杂度：
     * 最好【每次可以均匀的分割待排序序列】：O(N*logn)
     * 最坏：数据有序 或者逆序的情况 O(N^2)
     * 空间复杂度：
     * 最好：O(logn)
     * 最坏：O(n)   单分支的一棵树
     * 稳定性：不稳定的排序
     * @param array
     */
    public static void quickSort1(int[] array) {
        quick(array,0,array.length-1);
    }

    public static void insertSort2(int[] array,int start,int end) {
        for (int i = 1; i <= end; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= start ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    //array[j+1] = tmp;  只要j回退的时候，遇到了 比tmp小的元素就结束这次的比较
                    break;
                }
            }
            //j回退到了 小于0 的地方
            array[j+1] = tmp;
        }
    }
    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }
        //0、如果区间内的数据，在排序的过程当中，小于某个范围了，可以使用直接插入排序  0  1  2 3
        if(right-left+1 <= 1400) {
            //使用直接插入排序
            insertSort2(array,left,right);
            return;
        }

        //1、找基准之前，我们找到中间大小的值-使用三数取中法
        int midValIndex = findMidValIndex(array,left,right);
        swap(array,midValIndex,left);

        int pivot = partition(array,left,right);//基准
        quick(array,left,pivot-1);
        quick(array,pivot+1,right);
    }

    private static int findMidValIndex(int[] array,int start,int end) {
        int mid = start + ((end-start) >>> 1);
        if(array[start] < array[end]) {
            if(array[mid] < array[start]) {
                return start;
            }else if(array[mid] > array[end]) {
                return end;
            }else {
                return mid;
            }
        }else {
            if(array[mid] > array[start]) {
                return start;
            }else if(array[mid] < array[end]) {
                return end;
            }else {
                return mid;
            }
        }
    }

    private static int partition(int[] array,int start,int end) {
        int tmp = array[start];
        while (start < end) {
            while (start < end && array[end] >= tmp) {
                end--;
            }
            //end下标就遇到了 < tmp的值
            array[start] = array[end];
            while (start < end && array[start] <= tmp) {
                start++;
            }
            //start下标就遇到了 > tmp的值
            array[end] = array[start];
        }
        array[start] = tmp;
        return start;
    }


    public static void quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int left = 0;
        int right = array.length-1;
        int pivot = partition(array,left,right);
        if(pivot > left+1) {
            //左边有2个元素
            stack.push(left);
            stack.push(pivot-1);
        }
        if(pivot < right-1) {
            //右边有2个元素
            stack.push(pivot+1);
            stack.push(right);
        }

        while (!stack.isEmpty()) {
           right = stack.pop();
           left = stack.pop();

           pivot = partition(array,left,right);

            if(pivot > left+1) {
                //左边有2个元素
                stack.push(left);
                stack.push(pivot-1);
            }
            if(pivot < right-1) {
                //右边有2个元素
                stack.push(pivot+1);
                stack.push(right);
            }
        }

    }


    /**
     *
     * @param array1 有序的
     * @param array2 有序的
     * @return
     */
    public static int[] mergeArray(int[] array1,int[] array2) {
        //注意判断参数
        int[] tmp = new int[array1.length+array2.length];
        int k = 0;//
        int s1 = 0;
        int e1 = array1.length-1;

        int s2 = 0;
        int e2 = array2.length-1;

        while (s1 <= e1 && s2 <= e2) {
            if(array1[s1] <= array2[s2]) {
                tmp[k++] = array1[s1++];
                //k++;
                //s1++;
            }else {
                tmp[k++] = array2[s2++];
            }
        }

        while (s1 <= e1) {
            tmp[k++] = array1[s1++];
        }

        while (s2 <= e2) {
            tmp[k++] = array2[s2++];
        }
        return tmp;
    }


    /**
     * 归并排序：
     * 时间复杂度：O(N*logN)
     * 空间复杂度：O(N)
     * 稳定性：稳定的排序
     * 如果 array[s1] <= array[s2] 不取等号  那么就是不稳定的排序
     *
     * 学过的排序 只有3个是稳定的：
     * 冒泡   插入   归并
     * @param array
     */
    public static void mergeSort1(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }

    private static void mergeSortInternal(int[] array,int low,int high) {
        if(low>=high) {
            return;
        }

        //int mid = (low+high) >>> 1;
        int mid = low + ((high-low) >>> 1);
        //左边
        mergeSortInternal(array,low,mid);
        //右边
        mergeSortInternal(array,mid+1,high);
        //合并
        merge(array,low,mid,high);
    }

    private static void merge(int[] array,int low,int mid,int high) {
        int[] tmp = new int[high-low+1];
        int k = 0;//

        int s1 = low;
        int e1 = mid;
        int s2 = mid+1;
        int e2 =  high;

        while (s1 <= e1 && s2 <= e2) {
            if(array[s1] <= array[s2]) {
                tmp[k++] = array[s1++];
            }else {
                tmp[k++] = array[s2++];
            }
        }

        while (s1 <= e1) {
            tmp[k++] = array[s1++];
        }

        while (s2 <= e2) {
            tmp[k++] = array[s2++];
        }
        //拷贝tmp数组的元素 放入原来的数组array当中
        for (int i = 0; i < k; i++) {
            array[i+low] = tmp[i];
        }
    }

    /**
     * 非递归实现归并排序
     *
     * @param array
     */
    public static void mergeSort(int[] array) {
        int nums = 1;//每组的数据个数
        while (nums < array.length) {
            //数组每次都要进行遍历,确定要归并的区间
            for (int i = 0; i < array.length; i += nums*2) {
                int left = i;
                int mid = left+nums-1;
                //防止越界
                if(mid >= array.length) {
                    mid = array.length-1;
                }
                int right = mid+nums;
                //防止越界
                if(right >= array.length) {
                    right = array.length-1;
                }
                //小标确定之后，进行合并
                merge(array,left,mid,right);
            }
            nums *= 2;
        }
    }

    /**
     * 计数排序：
     * 时间复杂度：O(N)
     * 空间复杂度：O(M) M:代表 当前数据的范围900 - 999
     * 稳定性：当前代码是不稳定的，但是本质是稳定的
     *
     * 一般适用于 有n个数，数据范围是0-n之间的
     * @param array
     */
    public static void countingSort(int[] array) {
        int maxVal = array[0];
        int minVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < minVal) {
                minVal = array[i];
            }
            if(array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        //说明，已经找到了最大值和最小值
        int[] count = new int[maxVal-minVal+1];//默认都是0
        //统计array数组当中，每个数据出现的次数
        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            //为了空间的合理使用 这里需要index-minVal  防止923-900
            count[index-minVal]++;
        }
        //说明，在计数数组当中，已经把array数组当中，每个数据出现的次数已经统计好了
        //接下来，只需要，遍历计数数组，把数据写回array
        int indexArray = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                //这里一定要加minVal，因为不一定就是i出现了count[i]
                array[indexArray] = i+minVal;
                count[i]--;//拷贝一个之后，次数也就少一个
                indexArray++;//下标得向后移动
            }
        }
    }


        /**
         * 有序的数据
         * @param capacity
         */
    public static void test1(int capacity) {
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long start = System.currentTimeMillis();
        //insertSort(array);
        //shellSort(array);
        //selectSort1(array);
        //heapSort(array);
        quickSort(array);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    /**
     * 无序的数据
     * @param capacity
     */
    public static void test2(int capacity) {
        int[] array = new int[capacity];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(capacity);
        }
        long start = System.currentTimeMillis();
        //insertSort(array);
        //shellSort(array);
        //selectSort1(array);
        //heapSort(array);
        quickSort(array);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
//1M 2M   需要优化快拍
    public static void main2(String[] args) {
        test1(100_0000);
        //test2(1000_0000);
    }

    public static void main(String[] args) {
        //int[] array = {12,5,18,10,4,2};
        int[] array = {12,5,9,34,6,0,33,56,89,0,7,4,0,55,77};
        countingSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main3(String[] args) {
        int[] array1 = {1,3,5,7,9};
        int[] array2 = {2,4,6,8,10};
        int[] ret = mergeArray(array1,array2);
        System.out.println(Arrays.toString(ret));
    }
}
