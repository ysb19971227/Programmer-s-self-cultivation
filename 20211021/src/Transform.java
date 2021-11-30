//实现交换两个变量的值。要求：需要交换实参的值。
class MyValue {
    int age;

//    @Override
//    public String toString() {
//        return "MyValue{" +
//                "age=" + age +
//                '}';
//    }
}
public class Transform {
    public static void main(String[] args) {
        MyValue v1 = new MyValue();
        MyValue v2 = new MyValue();
        v1.age = 10;
        v2.age = 20;
        System.out.println(v1.age + " " + v2.age);
        swap(v1,v2);
        System.out.println(v1.age + " " + v2.age);
    }
    public static void swap(MyValue v1,MyValue v2) {
        int tmp = v1.age;
        v1.age = v2.age;
        v2.age = tmp;
    }
}
