public class Day04_Switch {
    public static void main(String[] args) {
        int day = 4;

       // switch checks the value of 'day'
switch (day) {
    case 1: // if day is 1
        System.out.println("Monday");
        break; // stops further checking
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
