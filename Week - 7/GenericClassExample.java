class Box<T> {

    private T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void display() {
        System.out.println("Value: " + value);
        System.out.println("Type: " + value.getClass().getSimpleName());
    }
}

public class GenericClassExample {

    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Hello");
        Box<Double> b3 = new Box<>(25.5);

        b1.display();
        b2.display();
        b3.display();
    }
}