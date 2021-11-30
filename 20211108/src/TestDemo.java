public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.display();
        myLinkedList.remove(2);
        myLinkedList.display();
//        myLinkedList.addIndex(7,77);
//        myLinkedList.display();
    }
}

//class Test1 {
//    public static int aaa;
//    public static void bbb() {
//        System.out.println("111");
//    }
//}

//public class TestDemo{
//    static boolean Paddy;
//    public static void ccc() {
//        System.out.println("111");
//    }
//    public static void main(String args[]){     //内部类的静态方法可以直接通过方法名进行访问吗？  可以
////        System.out.println(test.aaa);
//        ccc();
////        System.out.println(ccc());
//    }

//public class TestDemo{
//
//    private static int count;
//    private static void as() {
//        System.out.println("666");
//    }
//
//    public static void main(String[] args) {
//
//        TestDemo test=new TestDemo(88);
//        System.out.println(count);
//        test.as();
//        Test1 ass = new Test1();
//        ass.bbb();
//
////        System.out.println(test.count);
//
//    }
//
//    TestDemo(int a) {
//
//        count=a;
//
//    }
//}
