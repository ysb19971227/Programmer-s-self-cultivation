public class Test {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
//        System.out.println(myList.isEmpty());
        myList.setPos(4,10);
        myList.display();
//        System.out.println(myList.getPos(0));
        myList.add(0,2);
//        System.out.println(myList.getPos(0));
        myList.add(1,8);
        myList.add(2,6);
        myList.add(3,9);
        myList.add(4,4);
//        System.out.println(myList.isEmpty());
        myList.display();
        System.out.println(myList.size());
        System.out.println(myList.contains(1));
        System.out.println(myList.search(9));
        System.out.println(myList.getPos(0));
        myList.setPos(4,10);
        myList.display();
        myList.remove(6);
        myList.display();
        myList.clear();
        myList.display();

    }
}
