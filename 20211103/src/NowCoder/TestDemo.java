package NowCoder;

class Person{
    private String name;//实例成员变量
    private int age;
    private String sex;
    private static int count = 0;//静态成员变量 由类共享数据 方法区
    public Person(){
        System.out.println("I am Person init()!");
    }
    //实例代码块
    {
        this.name = "bit";
        this.age = 12;
        this.sex = "man";
        System.out.println("I am instance init()!");
    }
    //静态代码块
    static {
        count = 10;//只能访问静态数据成员
        System.out.println("I am static init()!");
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        {
            System.out.println("13");
        }
//        Person p1 = null;
        Person p2 = new Person();//静态代码块是否还会被执行？
    }
}

