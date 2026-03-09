interface Payment {

    void pay();
}

class CreditCard implements Payment {

    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

public class Day20_PaymentExample {

    public static void main(String[] args) {

        CreditCard c = new CreditCard();
        c.pay();
    }
}
