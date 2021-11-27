class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
public class SingleLinkedList {
    public ListNode head;
    public void createList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        this.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    };
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    };
    //打印指定头结点的单链表
    public void display2(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    };
    //头插法
    public void addList(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        this.head = node;
    };

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    };

    static class IndexException extends RuntimeException {
        public IndexException(String message) {
            super(message);
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        ListNode node = new ListNode(data);
        if (index < 0 || index > size()) {
            throw new IndexException("输入的index位置非法！");
        }
        if (this.head == null) {
            throw new IndexException("链表为空！");
        }
        if (index == 0) {
            addList(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = nodePrev(index);
        node.next = cur.next;
        cur.next = node;
    };
    //找出要插入位置的前一个节点
    public ListNode nodePrev(int index) {
        ListNode cur = this.head;
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    };
    //找出要删除的节点的前一个节点
    public ListNode findPrev(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            System.out.println("链表为空！");
            return;
        }
        if (this.head.val == key) {
            this.head = this.head.next;
            return;
        }
        ListNode prev = findPrev(key);
        if (prev == null) {
            System.out.println("没有找到要删除的节点！");
            return;
        }
        ListNode del = prev.next;
        prev.next = del.next;
    };
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (head == null) {
            System.out.println("单链表为空！");
            return;
        }
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.val == key) {
            this.head = this.head.next;
        }
    };

    public void clear() {
        while (this.head != null) {
            ListNode headNext = head.next;
            head.next = null;
            head = headNext;
        }
    };
    //反转一个单链表
    public ListNode reverse() {
        if (head == null) {
            System.out.println("链表为空！");
            return null;
        }
        ListNode cur = this.head;
        ListNode curNext = cur.next;
        ListNode tmp;
        while (curNext != null) {
            tmp = curNext.next;
            curNext.next = cur;
            cur = curNext;
            curNext = tmp;
        }
        this.head.next = null;
        this.head = cur;
        return head;
    }
    //给定一个带有头结点head的非空单链表，返回链表的中间节点。如果有两个中间节点，则返回第二个中间节点。
    //使用快慢指针，路程不一样。当fast为slow的两倍速时，fast结束，slow就在中间路程。
    public ListNode midNode() {
        if (this.head == null) {
            System.out.println("单链表为空!");
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //输入一个链表，输出该链表中倒数第k个节点
    public ListNode func4 (int k) {
        if (head == null) {
            System.out.println("单链表为空！");
            return null;
        }
        if (k <= 0 || k > size()) {
            System.out.println("k的位置不合法！");
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (k-1 != 0) {
            fast = fast.next;

            k--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public ListNode func7() {
        //设置一个傀儡节点newHead，让tmp指向newHead，然后将重复的和不重复的分类
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
}
