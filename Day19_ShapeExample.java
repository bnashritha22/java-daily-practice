abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Day19_ShapeExample {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.draw();
    }
}
