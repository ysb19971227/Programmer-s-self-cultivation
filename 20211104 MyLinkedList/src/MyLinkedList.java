class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}

public class MyLinkedList {
    //首先需要定义一个链表的头结点  先用穷举法定义一个链表
    public ListNode head;
    public void createList() {
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(23);
        ListNode listNode3 = new ListNode(34);
        ListNode listNode4 = new ListNode(45);
        ListNode listNode5 = new ListNode(56);
        this.head = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
    }
    //打印链表的val值
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+ " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //从指定头节点开始打印
    public void display(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.val+ " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //实现链表的大小size()方法
    public int size() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //判断是否包含关键字key在单链表中，返回boolean值
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //实现头插法
    public void addList(int data) {
        ListNode node = new ListNode(data);
        node.next = this.head;
        head = node;
    }
    //实现尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        //如果头结点为null，会有空指针异常，所以要判断头结点是否为null
        if (this.head == null) {
            this.head = node;
            return;
        }
        ListNode cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //实现clear函数
    public void clear() {
        //粗暴的方法：直接将head头结点置为null
//        this.head = null;
        //温柔的方法：单链表中一个一个的置为null
        while(this.head != null) {
            ListNode curNext = this.head.next;
            this.head.next = null;
            this.head = curNext;
        }
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            System.out.println("单链表为空，不能删除");
            return;
        }
        if (this.head.val == key) {
            this.head = this.head.next;
            return;
        }
        ListNode cur = searchPrev(key);
        if (cur == null) {
            System.out.println("没有你要删除的节点");
            return;
        }
        ListNode del = cur.next;
        cur.next = del.next;
    }
    //找出要删除的前一个节点，返回前一个节点
    public ListNode searchPrev(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (this.head == null) {
            return ;
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
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        ListNode node = new ListNode(data);
        if (index < 0 ||index > size()) {
            System.out.println("index下标不合法");
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
        ListNode cur = findIndex(index);
        node.next = cur.next;
        cur.next = node;
    }
    public ListNode findIndex(int index) {
        ListNode cur = this.head;
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //反转一个单链表   老师写的方法
    public ListNode reverseList () {
        if (this.head == null) {
            return null;
        }
        ListNode cur = this.head;
        ListNode prev = null;
        ListNode curNext;
        while(cur != null) {
            curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        this.head = prev;
        return prev;
    }
    //反转一个单链表    我写出来的方法
    public ListNode reverseList2 () {
        if (this.head == null) {return null;}
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
    public  ListNode middleNode(ListNode head) {
        if (this.head == null) {
            return  null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {   //先判断fast是否为空，然后再判断fast.next是否为空
            fast = fast.next.next;                    //不然，如果fast为空，fast.next就会空指针异常
            slow = slow.next;
        }
        return slow;
    }

//    输入一个链表，输出该链表中倒数第k个节点
    public ListNode func4 (int k) {
//        if (k <= 0 || k > size()) {
        if (k <= 0 || head == null) {
            System.out.println("k值超过范围，不合法！");
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (k-1 != 0) {
            fast = fast.next;
            if (fast == null) {
                System.out.println("k值超过范围，不合法！");
                return null;
            }
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
            //保证cur.next也不为null
            if (cur.next != null && cur.val == cur.next.val) {
                //while是单独的循环，需要重新控制限制条件
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
        //防止最后一个也是重复的，被删掉。所以，也要判断一下，手动置为null
        tmp.next = null;
        return newHead.next;
    }



}
