public class TestDemo1 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.disPlay();
        System.out.println(myArrayList.isFull());
        System.out.println(myArrayList.search(2));
        myArrayList.remove(1);
        myArrayList.disPlay();
        myArrayList.setPos(2,10);
        myArrayList.disPlay();
        System.out.println(myArrayList.contains(7));
        System.out.println(myArrayList.getPos(3));
        System.out.println(myArrayList.size());
    }
}
