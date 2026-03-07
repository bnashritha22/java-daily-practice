class Animal {

    String type = "Animal";
}

class Dog extends Animal {

    String type = "Dog";

    void printType() {
        System.out.println("Child type: " + type);
        System.out.println("Parent type: " + super.type);
    }
}

public class Day18_SuperVariable {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.printType();
    }
}
