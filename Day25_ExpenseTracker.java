import java.util.ArrayList;

public class Day25_ExpenseTracker {

    public static void main(String[] args) {

        ArrayList<Expense> expenses = new ArrayList<>();

        expenses.add(new Expense("Food", 250));
        expenses.add(new Expense("Transport", 120));
        expenses.add(new Expense("Shopping", 600));

        for(Expense e : expenses) {
            e.display();

            double total = 0;

for(Expense e : expenses) {
    total += e.amount;
}

System.out.println("Total Expense: ₹" + total);
        }
    }
}
