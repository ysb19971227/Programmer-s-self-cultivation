public class TestDemo2 {
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
            if (cur.val < x){
                if (bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if (as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if (be == null) {
            return as;
        }
        //最后一位如果小于x就将这个节点放到前面去了，最后一个节点的next不为nul，
        //所以需要手动置为null
        if(ae != null && ae.next != null) {
            ae.next = null;
        }
        be.next = as;
        return bs;
    }
    //第8道题 判断是不是回文
    public static boolean func8(ListNode head) {
        if (head == null) {
            return true;
        }
        //第一步，找到中间节点
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //第二步，将slow后面的节点进行逆置
        ListNode cur = slow.next;
        ListNode curNext;
        while (cur != null) {
            curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //第三步，分别从两边向中间进行比较
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
        return true;
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
        pl = headA;
        while (ps != null) {
            lenB++;
            ps = ps.next;
        }
        ps = headB;
        int tmp = lenA-lenB;
        if (tmp < 0) {
            pl = headB;
            ps = headA;
        }
        while (tmp != 0) {
            pl = pl.next;
            tmp--;
        }
        while (pl != ps) {
            pl = pl.next;
            ps = ps.next;
        }
        return pl;
    }

    //将两个链表变成Y相交的链表
    public static void intersection(ListNode headA,ListNode headB) {
        ListNode cur = headB;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = headA.next.next.next;
    }
    //把没环的单链表编程有换的单链表
    public static void hasCircle(ListNode head) {
        ListNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = head.next.next;
    }
    //第十题：给定一个链表，判断链表中是否有环。
    public static boolean func10(ListNode head) {
        if (head == null) {
            return true;
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
        ListNode cur = head;
        while (cur != fast) {
            cur = cur.next;
            fast = fast.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList  = new SingleLinkedList();
//        singleLinkedList.createList();
//        singleLinkedList.addLast(1);
//        singleLinkedList.addLast(1);
//        singleLinkedList.addLast(6);
//        singleLinkedList.addLast(8);
//        singleLinkedList.addLast(8);
//        singleLinkedList.addLast(7);
//        singleLinkedList.addLast(7);
//        System.out.println(singleLinkedList.size());
//        System.out.println(singleLinkedList.findPrev(7).val);
//        System.out.println(singleLinkedList.contains(6));
//        singleLinkedList.display();
//        singleLinkedList.remove(1);
//        singleLinkedList.display();
//        singleLinkedList.removeAllKey(8);
//        singleLinkedList.display();
//        singleLinkedList.addIndex(2,10);
//        singleLinkedList.display();
//        ListNode newHead = singleLinkedList.reverse();
//        singleLinkedList.display2(newHead);
//        System.out.println(singleLinkedList.midNode().val);
//        System.out.println(singleLinkedList.func4(2).val);

        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        singleLinkedList2.addLast(1);
        singleLinkedList2.addLast(2);
        singleLinkedList2.addLast(3);
        singleLinkedList2.addLast(4);
        singleLinkedList2.addLast(5);
        singleLinkedList2.addLast(6);
        intersection(singleLinkedList2.head,singleLinkedList.head);
        ListNode head = getIntersectionNode(singleLinkedList2.head,singleLinkedList.head);
        System.out.println(head.val);
//        System.out.println(func8(singleLinkedList2.head));
//        System.out.println(singleLinkedList2.head.val);
//        ListNode head = func6(singleLinkedList2.head,5);
//        singleLinkedList2.display2(head);
//        ListNode head = func5(singleLinkedList.head,singleLinkedList2.head);
//        singleLinkedList.display2(head);
//        singleLinkedList.display2(singleLinkedList.func7());
    }
}
