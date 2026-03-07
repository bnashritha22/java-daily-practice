class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        super.sound(); // calling parent method
        System.out.println("Dog barks");
    }
}

public class Day18_SuperMethod {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}
