class Person {
    private String name;
    private int age;
    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }
    public void show() {
        System.out.println("name:"+name+" " + "age:"+age);
    }
}
public class Anonymous {
    public static void main(String[] args) {
        new Person("caocao",19).show();//通过匿名对象调用方法
    }
}