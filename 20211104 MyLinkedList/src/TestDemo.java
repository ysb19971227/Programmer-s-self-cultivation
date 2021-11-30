public class TestDemo {
    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public static ListNode func5 (ListNode headA, ListNode headB) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(headA != null && headB !=null) {
            if (headA.val < headB.val) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if (headA != null) {
            tmp.next = headA;
        }
        if (headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }
    //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前,最后返回新链表的头结点。
    public static ListNode func6(ListNode head,int x) {
        //设置四个引用对象，分别代表小于x的链表的前后节点，和大于等于x的链表的前后节点，然后再相连。
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                if (be == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if (ae == null) {
                    ae = cur;
                    as = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //有可能没有小于x的值，如果没有小于x得值，be.next就会报空指针异常错误，所以要判断一下。（没有大于x的值的情况包括在里面了）
        if (be == null) {
            return as;
        }
        //防止最后一位节点的next不为null
        // （当最后一个节点小于x的时候，将其放在前面，后面如果有大于x的节点的值，最后一个节点的next不为null）
        // 就需要手动将最后一位置为null
        if(ae != null && ae.next != null) {
            ae.next = null;
        }
        be.next = as;
        return bs;
    }

    //第8道题 判断是不是回文
    public static boolean func8(ListNode head) {
        //第一步：找中间节点（定义一个快慢指针）
        if (head == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //此时，中间节点为slow。第二步逆置
        ListNode cur = slow.next;
        ListNode curNext = cur.next;
        while (cur != null) {
            curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //第三步：
        while (head != slow) {
            if (head.val != slow.val) {
                return false;
            }
            if (head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true; //相遇了就return true
    }

    //第9道题 输入两个链表，找出它们的第一个公共结点。
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }

        ListNode pl = headA;
        ListNode ps = headB;
        int lenA = 0;
        int lenB = 0;
        while (pl != null) {
            lenA++;
            pl = pl.next;
        }
        //pl==null
        pl = headA;
        while (ps != null) {
            lenB++;
            ps = ps.next;
        }
        //ps==null
        ps = headB;
        int len = lenA-lenB;//差值步
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB-lenA;
        }
        //1、pl永远指向了最长的链表   ps 永远指向了最短的链表  2、求到了差值len步
        while (len != 0) {
            pl = pl.next;
            len--;
        }
        while (pl != ps ) {
            pl = pl.next;
            ps = ps.next;
        }
        return pl;
    }
    // pl走差值len步
    // 同时走 直到相遇


    //第十题：给定一个链表，判断链表中是否有环。
    public static boolean func10(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //第十一题：给定一个链表，返回链表开始入环的第一个节点。如果链表无环，则返回null
    public static ListNode func11(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
//        return  true;
        //方法走到这一行，说明单链表有环。
        ListNode cur = head;
        while (fast != cur) {
            fast = fast.next;
            cur = cur.next;
        }
        return fast;
    }

    //把没环的单链表编程有换的单链表
    public static void hasCircle(ListNode head) {
        ListNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = head.next.next;
    }
    //将两个链表变成Y相交的链表
    public static void intersection(ListNode headA,ListNode headB) {
        ListNode cur = headB;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = headA.next.next.next;
    }

    //用递归实现删除所有值为key的节点
    public static ListNode removeAllKey2(ListNode head,int key) {
        if(head == null){
            return null;
        }
        //递归调用
        ListNode res = removeAllKey2(head.next,key);
        if(head.val == key){
            return res;
        }else {
            head.next = res;
            return head;
        }
    }
    //用递归实现反转单链表
    public static ListNode reverseList2(ListNode head) {
        if (head == null ||head.next == null) {
            return head;
        }
        ListNode ret = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return ret;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.addLast(11);
        myLinkedList1.addLast(27);

//        myLinkedList1.display();
//        myLinkedList.createList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.display();
//        TestDemo.intersection(myLinkedList.head, myLinkedList1.head);
//        myLinkedList.head = TestDemo.removeAllKey2(myLinkedList.head,23);
//        myLinkedList.head = TestDemo.reverseList2(myLinkedList.head);
        myLinkedList.display(TestDemo.reverseList2(myLinkedList.head));
//        ListNode node = TestDemo.getIntersectionNode(myLinkedList.head, myLinkedList1.head);
//        System.out.println(node.val);
//        System.out.println(TestDemo.func10(myLinkedList.head));
//        TestDemo.hasCircle(myLinkedList.head);
//        System.out.println(TestDemo.func10(myLinkedList.head));
//        ListNode node = TestDemo.func11(myLinkedList.head);
//        System.out.println(node.val);
//        ListNode ret = TestDemo.func5(myLinkedList.head,myLinkedList1.head);
//        boolean flg = TestDemo.func8(myLinkedList.head);
//        System.out.println(flg);
//        ListNode ret = TestDemo.func6(myLinkedList.head,29);
//        System.out.println(myLinkedList.func4(2).val);
//        myLinkedList.func7();
//        myLinkedList.display(ret);
//        ListNode ret = myLinkedList.func4(7);
//        ListNode ret = myLinkedList.middleNode(myLinkedList.head);
//        System.out.println(ret.val);
//        ListNode ret = myLinkedList.reverseList();
//        ListNode ret1 = myLinkedList.reverseList2();
//        myLinkedList.display(ret1);
//        myLinkedList.remove(56);
//        myLinkedList.display();
//        myLinkedList.removeAllKey(23);
//        myLinkedList.display();
//        myLinkedList.clear();
//        myLinkedList.addIndex(1,400);
//        myLinkedList.display();
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.contains(56));


    }
}
