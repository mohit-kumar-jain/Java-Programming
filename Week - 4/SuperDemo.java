class Parent {
    String message = "Hello from Parent";

    Parent() {
        System.out.println("Parent Constructor Called");
    }

    void show() {
        System.out.println("Parent Method Called");
    }
}

class Child extends Parent {
    String message = "Hello from Child";

    Child() {
        super(); 
    }

    void show() {
        System.out.println("Child Method Called");
    }

    void test() {
        System.out.println(this.message);
        System.out.println(super.message);
        
        this.show();
        super.show();
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.test();
    }
}
