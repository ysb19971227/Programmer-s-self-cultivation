class ListNode {
    public int val;
    public ListNode prev;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class MyLinkedList {

    public ListNode head;//指向双向链表的头节点
    public ListNode last;//指向的是尾巴节点

    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+ " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return  false;
    }

    //头插法
    public void addFirst(int data) {
        //分为两种情况
        ListNode node = new ListNode(data);
        if (head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head) {
                    head = head.next;
                    if (head != null) {             //如果只有一个node，被删掉了，可能会被空指针异常
                        head.prev = null;
                    }else {
                        last = null;
                    }
                }else if (cur == last){
                    cur.prev.next = cur.next;
                    last = last.prev;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return;
            }else {
                cur = cur.next;
            }
        }
    }


    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head) {
                    head = head.next;
                    if (head != null) {             //如果只有一个node，被删掉了，可能会被空指针异常
                        head.prev = null;
                    }else {
                        last = null;
                    }
                }else if (cur == last){
                    cur.prev.next = cur.next;
                    last = last.prev;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }else {
                cur = cur.next;
            }
        }
    }

    public ListNode searchIndex (int index) {
        if (index < 0 || index > size()) {
            System.out.println("index位置不合法！");
            return null;
        }
        ListNode cur = this.head;
        while (index != 0) {
            index--;
            cur = cur.next;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        ListNode node = new ListNode(data);
        ListNode cur;
        cur = searchIndex(index);
        if (index == 0) {
            addFirst(data);
        }else if (index == size()) {
            addLast(data);
        }else {
                node.next = cur;
                node.prev = cur.prev;
                cur.prev.next = node;
                cur.prev = node;
//            node.next = cur.prev.next;
//            cur.prev.next = node;            //两种都行
//            node.prev = cur.prev;
//            cur.prev = node;
        }
    }
    //暴力的做法是直接将head和last直接置为null
    //温柔的做法将所有节点置为null
    public void clear() {
        ListNode cur = this.head;
        while (cur != null) {
            ListNode curNext = head.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
        head = null;
        last = null;
    }
    //clear的第二种写法
    public void clear2() {
        while (head != null) {
            ListNode curNext = head.next;
            head.next = null;
            head.prev = null;
            head = curNext;
        }
        last = null;
    }

}
