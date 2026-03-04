public class Day15_Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Day15_Calculator calc = new Day15_Calculator();

        System.out.println(calc.add(5, 3));
        System.out.println(calc.add(5, 3, 2));
    }
}
