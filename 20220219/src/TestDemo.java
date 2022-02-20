import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/2/19
 * Time: 8:21
 * Description:
 */
class MyArray1 {
    public Object[] objects = new Object[10];

    public void set(int pos,Object val) {
        objects[pos] = val;
    }

    public Object get(int pos) {
        return objects[pos];
    }
}

/**
 *
 * @param <T> 此时代表当前类是一个泛型类，T:当做是一个占位符
 */
class MyArray<T> {

    //public T[] objects = new T[10];//ERROR 1、不能实例化泛型类型的数组
    public T[] objects = (T[])new Object[10];//也不可以
    //public Object[] objects = new Object[10];

    public void set(int pos,T val) {
        objects[pos] = val;
    }

    public T get(int pos) {
        return objects[pos];
    }
    //Object[]-> "hello"   10    double
    public T[] getArray() {
        return objects;
    }

}
//写一个泛型类，求出数组当中的最大值
class Alg<T extends Comparable<T>> {
    public  T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            //这里为什么会报错？？？？
            //if(max < array[i]) {
            if(max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }
}

class Alg2 {
    public static<T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            //这里为什么会报错？？？？
            //if(max < array[i]) {
            if(max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }
}
class Alg3  {
    public static <T> void print1(ArrayList<T> list) {
        for (T x: list) {
            System.out.println(x);
        }
    }

    public static void print2(ArrayList<?> list) {
        for (Object x:list) {
            System.out.println(x);
        }
    }
}
class A {

}
class Person extends A{

}
class Student extends Person {

}
class C extends Student {

}
public class TestDemo {


    public static void main(String[] args) {
        ArrayList<? super Person> arrayList1 = new ArrayList<Person>();

        //ArrayList<? super Person> arrayList2 = new ArrayList<Student>();
        arrayList1.add(new Person());
        //arrayList1.add(new A());
        arrayList1.add(new Student());//添加的元素 是person或者person的子类
        arrayList1.add(new C());

        ArrayList<? super Person> arrayList2 = new ArrayList<A>();
        arrayList2.add(new Person());
        arrayList2.add(new Student());

        //Person person = arrayList2.get(0);//why????

        //Student student = arrayList1.get(0);//why????

        Object o = arrayList1.get(0);//只能那object获取
    }

    public static void main9(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        List<? extends Number> list = arrayList1;
        //List<? extends Number> list2 = arrayList2;
        //list.add(0,1);//通配符的上界 不适合写入数据
        //list.add(1,10.9);
        Number o = list.get(0);
        //Integer a = list.get(1);
    }

    public static void main7(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        Alg3.print2(list1);

    }

    public static void main6(String[] args) {
        Alg<Integer> alg1 = new Alg<Integer>();
        System.out.println(alg1);
        Alg<Integer> alg2 = new Alg<Integer>();
        System.out.println(alg2);
    }

    public static void main3(String[] args) {
        Integer[] array = {1,12,3,4};
        System.out.println(Alg2.<Integer>findMax(array));
        System.out.println(Alg2.findMax(array));
    }

    public static void main5(String[] args) {
        Alg<Integer> alg1 = new Alg<Integer>();
        Integer[] array = {1,12,3,4};
        System.out.println(alg1.findMax(array));


        Alg<String> alg2 = new Alg<>();
        String[] array2 = {"abc","hello","cdef"};
        System.out.println(alg2.findMax(array2));

    }

    public static void main4(String[] args) {
        MyArray<String> myArray = new MyArray<String>();
        MyArray<Integer> myArrayI = new MyArray<>();
        MyArray<Number> myArrayN = new MyArray<>();
        myArrayN.set(0,10);
        myArrayN.set(0,12.5);

        Object[] ret = myArray.getArray();//编译器认为 此时 并不是很安全
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        Object[] ret2 = arrayList.toArray();
    }

    public static void main2(String[] args) {
        MyArray<String> myArray = new MyArray<String>();
        myArray.set(0,"hello");
        //myArray.set(1,10); 1、编译的时候，自动进行类型的检查
        String str = myArray.get(0);//2、不需要进行类型的强制转换。自动帮我们进行类型的转换
        MyArray<Integer> myArray2 = new MyArray<Integer>();
        //MyArray<int> myArray3 = new MyArray<int>(); 简单类型 基本类型 不能作为泛型类型的参数

        MyArray myArray3 = new MyArray();
        myArray3.set(0,"hello");
        myArray3.set(1,10);
        String str2 = (String) myArray3.get(0);

    }
    public static void main1(String[] args) {
        MyArray1 myArray = new MyArray1();
        myArray.set(0,"hello");
        myArray.set(1,10);
        String str = (String) myArray.get(0);

    }
}
