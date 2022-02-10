import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/1/23
 * Time: 11:08
 * Description:
 */
public class TopK {

    /**
     * 求数组当中的前K个最小的元素
     * @param array
     * @param k
     * @return
     */
    public static int[] topK(int[] array,int k) {
        //1、创建一个大小为K的大根堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //2、遍历数组当中的元素，前K个元素放到队列当中
        for (int i = 0; i < array.length; i++) {
            if(maxHeap.size() < k) {
                maxHeap.offer(array[i]);
            }else {
                //3、从第k+1个元素开始，每个元素和堆顶元素进行比较
                int top = maxHeap.peek();
                if(top > array[i]) {
                    //3.1 先弹出
                    maxHeap.poll();
                    //3.2 后存入
                    maxHeap.offer(array[i]);
                }
            }
        }
        int[] tmp = new int[k];
        for (int i = 0; i < k; i++) {
            tmp[i] = maxHeap.poll();
        }
        return tmp;
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>(k, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return (o2.get(0)+o2.get(1))-(o1.get(0)+o1.get(1));
            }
        });
//        for (int i = 0; i < Math.min(nums1.length,k); i++) {
//            for (int j = 0; j < Math.min(nums2.length,k); j++) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(maxHeap.size() < k) {
                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.add(nums1[i]);
                    tmpList.add(nums2[j]);
                    maxHeap.offer(tmpList);
                }else {
                    int top = maxHeap.peek().get(0) + maxHeap.peek().get(1);
                    if(top > nums1[i]+nums2[j]) {
                        //记住  要弹出的
                        maxHeap.poll();

                        List<Integer> tmpList = new ArrayList<>();
                        tmpList.add(nums1[i]);
                        tmpList.add(nums2[j]);
                        maxHeap.offer(tmpList);
                    }
                }
            }
        }
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            ret.add(maxHeap.poll());
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};
        List<List<Integer>> ret = kSmallestPairs(nums1,nums2,3);
        System.out.println(ret);
    }


    public static void main1(String[] args) {
        int[] array = {18,21,8,10,34,12};
        int[] tmp = topK(array,3);
        System.out.println(Arrays.toString(tmp));
    }
}

