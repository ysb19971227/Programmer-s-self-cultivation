public class TestDemo1 {
    public static void main(String[] args) {
        MyLinkedList1 myLinkedList1  = new MyLinkedList1();
        myLinkedList1.addLast(1);
        myLinkedList1.addLast(2);
        myLinkedList1.addLast(2);
        myLinkedList1.addLast(4);
        myLinkedList1.addLast(5);
        myLinkedList1.display();
        System.out.println(myLinkedList1.size());
        System.out.println(myLinkedList1.contains(1));
        myLinkedList1.addIndex(2,7);
//        myLinkedList1.remove(1);
//        myLinkedList1.display();
        myLinkedList1.removeAllKey(1);
        myLinkedList1.display();
    }
}
