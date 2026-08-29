import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random r = new Random();

        int number = r.nextInt(100);

        System.out.println("Random number: " + number);

        double decimal = r.nextDouble();

        System.out.println("Random decimal: " + decimal);

        boolean value = r.nextBoolean();

        System.out.println("Random boolean: " + value);
    }
}