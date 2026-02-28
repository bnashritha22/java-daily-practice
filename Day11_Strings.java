public class Day11_Strings {
    public static void main(String[] args) {

        String message = "Java Learning";

        System.out.println("Text: " + message);
        System.out.println("Length: " + message.length());
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());
        String word1 = "Java";
String word2 = "java";

if (word1.equals(word2)) {
    System.out.println("Same text");
} else {
    System.out.println("Different text");
}

if (word1.equalsIgnoreCase(word2)) {
    System.out.println("Same ignoring case");

    String firstName = "Ashritha";
String lastName = "Learner";

String fullName = firstName + " " + lastName;
System.out.println("Full name: " + fullName);
}
    }
}
