public class Day08_Methods {

    // method that prints a message
    public static void greetUser(String name) {
    System.out.println("Hello " + name + "!");
        greetUser("Ashritha");
}
    public static void greet() {
        System.out.println("Hello, welcome to Java practice!");
    }
// method that returns a result
public static int addNumbers(int a, int b) {
    return a + b;
}
    int result = addNumbers(5, 3);
System.out.println("Sum: " + result);

    public static void main(String[] args) {
        greet();  // calling the method
    }
}
