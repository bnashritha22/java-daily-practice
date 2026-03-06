class Bank {

    int getInterestRate() {
        return 5;
    }
}

class SBI extends Bank {

    int getInterestRate() {
        return 7;
    }
}

public class Day17_BankExample {

    public static void main(String[] args) {

        SBI bank = new SBI();
        System.out.println("Interest Rate: " + bank.getInterestRate() + "%");
    }
}
