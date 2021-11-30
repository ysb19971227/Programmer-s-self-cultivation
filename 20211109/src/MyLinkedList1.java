class ListNode {
    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
public class MyLinkedList1 {
    //实现带头双向不循环链表
    public ListNode last;
    public ListNode head = new ListNode(-1);
    //打印链表
    public void display() {
        if (head.next == null) {
            return;
        }
        ListNode cur = head.next;
        while (cur != null) {
            System.out.print(cur.val+ " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //得到双链表的长度
    public int size() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count-1;
    }
    //实现头插法
    public void addList(int data) {
        ListNode node = new ListNode(data);
        if (head.next == null) {
            head.next = node;
            node.prev = head;
            last = node;
        }else {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }
    }
    //查找是否包含关键字key是否在双链表当中
    public boolean contains(int key){
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (head.next == null) {
            head.next = node;
            node.prev = head;
            last = node;
        }else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (head.next == null) {
            return;
        }
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head.next) {
                    head.next = cur.next;
                    if (cur.next != null){
                        cur.next.prev = head;
                    }else {
                        last = head;
                    }
                }
                else if (cur == last) {
                    cur.prev.next = null;
                    last = cur.prev;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return;
            }
            cur = cur.next;
        }
    }
    //删除出现关键字为key的所有节点
    public void removeAllKey(int key){
        if (head.next == null) {
            return;
        }
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head.next) {
                    head.next = cur.next;
                    if (cur.next != null){
                        cur.next.prev = head;
                    }else {
                        last = head;
                    }
                }
                else if (cur == last) {
                    cur.prev.next = null;
                    last = cur.prev;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
            cur = cur.next;
        }
    }
    //查找下标为index的节点，返回节点
    public ListNode searchIndex (int index) {
        if (index < 0 || index > size()) {
            System.out.println("index的位置不合法！");
            return null;
        }
        ListNode cur = head.next;
        while (index != 0) {
            index--;
            cur = cur.next;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if (head.next == null) {
            return;
        }
        if (index == 0) {
            addList(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);
        if (cur == null) {
            return;
        }
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    //暴力的做法是直接将head和last直接置为null
    //温柔的做法将所有节点置为null
    public void clear() {
        ListNode cur = head;
        ListNode curNext;
        while (cur != null) {
            curNext = cur.next;
            cur.prev = null;
            cur.next = null;
            cur = curNext;
        }
        head = null;
        last = null;
    }
}
