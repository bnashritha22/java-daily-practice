public class Day13_Book {

    String title;
    double price;

    Day13_Book(String t, double p) {
        title = t;
        price = p;
    }

    void showBook() {
        System.out.println(title + " - " + price);
    }

    public static void main(String[] args) {
        Day13_Book b1 = new Day13_Book("Java Basics", 499.0);
        b1.showBook();
    }
}
