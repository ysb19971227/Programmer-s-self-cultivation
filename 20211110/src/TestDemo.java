//import com.bit.demo1.Animal;

class Animal {
    public String name;
    public int age;
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}

class Bird extends Animal {
    public String wing;
//    public String name;
    public Bird(String name,int age,String wing) {
        super(name,age);
        this.wing = wing;
    }
    public void fly() {
        System.out.println(super.name + "正在飞 ︿(￣︶￣)︿");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Bird bird = new Bird("heihei",14,"我要飞翔！");
        System.out.println(bird.name);
        System.out.println(bird.age);
        bird.fly();
    }
}



