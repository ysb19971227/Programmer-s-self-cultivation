import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/2/19
 * Time: 11:12
 * Description:
 */
public class TestDemo2 {

    /**
     * 求的是出现次数最多的单词
     * @param words
     * @param k
     * @return
     */
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        //1、统计每个单词出现的次数 map
        for (String s : words) {
            if(map.get(s) == null) {
                map.put(s,1);
            }else {
                int val = map.get(s);
                map.put(s,val+1);
            }
        }
        //2、建立一个大小为K的小根堆
        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue().compareTo(o2.getValue()) == 0) {
                    return o2.getKey().compareTo(o1.getKey());
                }
                return o1.getValue()-o2.getValue();
            }
        });

        //3、遍历Map
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if(minHeap.size() < k) {
                minHeap.offer(entry);
            }else {
                //说明堆中 已经放满了K个元素，需要看堆顶元素的数据 和当前的数据的大小关系
                Map.Entry<String,Integer> top = minHeap.peek();
                //判断频率是否相同，如果相同，比较单词的大小，单词小 的入堆
                if(top.getValue().compareTo(entry.getValue()) == 0) {
                    if(top.getKey().compareTo(entry.getKey()) > 0) {
                        minHeap.poll();
                        minHeap.offer(entry);
                    }
                }else {
                    if(top.getValue().compareTo(entry.getValue()) < 0) {
                        minHeap.poll();
                        minHeap.offer(entry);
                    }
                }
            }
        }
        //System.out.println(minHeap);
        List<String> ret = new ArrayList<>();
        for (int i = 0;i < k;i++) {
            Map.Entry<String,Integer> top = minHeap.poll();
            ret.add(top.getKey());
        }
        Collections.reverse(ret);
        return ret;
    }


    public static void main(String[] args) {
        //String[] worlds = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        String[] worlds = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> ret = topKFrequent(worlds,3);
        System.out.println(ret);
    }


    /*
    class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        // 空间复杂度O(1)，将克隆结点放在原结点后面
        Node node = head;
        // 1->2->3  ==>  1->1'->2->2'->3->3'
        while(node != null){
            Node clone = new Node(node.val,node.next,null);
            Node temp = node.next;
            node.next = clone;
            node = temp;
        }
        // 处理random指针
        node = head;
        while(node != null){
            // ！！
            node.next.random = node.random == null ? null : node.random.next;
            node = node.next.next;
        }
        // 还原原始链表，即分离原链表和克隆链表
        node = head;
        Node cloneHead = head.next;
        while(node.next != null){
            Node temp = node.next;
            node.next = node.next.next;
            node = temp;
        }
        return cloneHead;
    }
}
     */
    /*public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur != null) {
            Node node = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }
        cur = head;
        while(cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }*/

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (Character ch: jewels.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        for (Character ch: stones.toCharArray()) {
            if(set.contains(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void func(String strExce,String strActual) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : strActual.toUpperCase().toCharArray()) {
            set.add(ch);
        }

        HashSet<Character> broken = new HashSet<>();

        for (char ch : strExce.toUpperCase().toCharArray()) {
            if(!set.contains(ch) && !broken.contains(ch)) {
                System.out.println(ch);
                broken.add(ch);
            }
        }
    }



    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            func(str1,str2);
        }
    }

    //key是关键字  value是出现的次数
    public static Map<Integer,Integer> func1(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        //判断array中的元素 是否在map当中，如果不在就是1.在就是在原来的基础上+1
        for (int x: array ) {
            if(map.get(x) == null) {
                map.put(x,1);
            }else {
                int val = map.get(x);
                map.put(x,val+1);
            }
        }
        return map;
    }

    public static Set<Integer> func2(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int x:array) {
            set.add(x);
        }
        return set;
    }

    public static int func3(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int x:array) {
            if(set.contains(x)) {
                return x;
            }
            set.add(x);
        }
        return -1;
    }

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x:nums) {
            if(set.contains(x)) {
                set.remove(x);
            }else {
                set.add(x);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        int[] array = new int[1_0000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        Map<Integer,Integer> map = func1(array);
        System.out.println(map);
    }

    public static void main2(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main1(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("abc",3);
        map.put("bit",2);//存储元素的时候，要注意 key如果相同  value值会被覆盖
        map.put("hello",4);
        map.put(null,null);
        //System.out.println(map);

        //Map.Entry<String,Integer>
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> entry :entrySet) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

//        Set<String> set = map.keySet();//Set这个集合当中 存储的元素 都是不重复的
//        System.out.println(set);


//        int ret = map.get("bit");//通过key 获取对应的val值
//        System.out.println(ret);
//        System.out.println(map.getOrDefault("bit2",98));
//        Integer ret2 = map.remove("bit");
//        System.out.println(ret2);
//        System.out.println(map);
    }
}
