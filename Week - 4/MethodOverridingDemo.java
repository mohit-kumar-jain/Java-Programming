class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
    public void eat() {
        System.out.println("Animals eat food.");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow! Meow!");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.makeSound(); 
        a1.eat();
        Animal a2 = new Dog();
        a2.makeSound(); 
        a2.eat();
        Animal a3 = new Cat();
        a3.makeSound();
    }
}
