package latihan.payment;

public class PaymentProcessor {
    public void process(PaymentMethod method, double amount) {
        boolean success = method.pay(amount);

        if (success) {
            System.out.println("Status: SUCCESS\n");
        } else {
            System.out.println("Status: FAILED\n");
        }
    }
}