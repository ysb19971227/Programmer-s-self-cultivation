//设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。
class Constructor {
    int age;
    String name;
    String sex;
    public Constructor(String name) {
        this.name = name;
    }

     @Override
     public String toString() {
         return "Constructor{" +
                 "age=" + age +
                 ", name='" + name + '\'' +
                 ", sex='" + sex + '\'' +
                 '}';
     }

     public Constructor(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public Constructor(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }
}

public class HomeWork2 {
    public static void main(String[] args) {
        Constructor con = new Constructor(12,"尹世博","男");
        System.out.println(con);
    }
}
