abstract class B {
    String name;

    public B(String name) {
        this.name = name;
    }
    public void getName() {
        System.out.print(this.name);
    }
    public abstract int func();
}
class D extends B {
    public D(String name) {
        super(name);
    }
    @Override
    public int func() {
        System.out.print("D");
        return 0;
    }
}
abstract class Shape {
    abstract public void draw();
}
public class Test {
    public static void main(String[] args) {
        B b = new D("bit");
        b.getName();
        D d = new D("777");
        d.getName();
    }
}

