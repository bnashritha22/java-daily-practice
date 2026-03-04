public class Day15_Area {

    double area(double side) {
        return side * side; // square
    }

    double area(double length, double breadth) {
        return length * breadth; // rectangle
    }

    public static void main(String[] args) {
        Day15_Area a = new Day15_Area();

        System.out.println("Square Area: " + a.area(4));
        System.out.println("Rectangle Area: " + a.area(5, 3));
    }
}
