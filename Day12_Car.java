public class Day12_Car {

    String brand;
    int year;

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Day12_Car car1 = new Day12_Car();

        car1.brand = "Toyota";
        car1.year = 2020;

        car1.showDetails();
    }
}
