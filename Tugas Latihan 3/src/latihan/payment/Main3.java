package latihan.payment;

public class Main3 {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod cc = new CreditCard("123456789");
        processor.process(cc, 150000);

        PaymentMethod pp = new PayPal("user@gmail.com");
        processor.process(pp, 75000);

        PaymentMethod bt = new BankTransfer("987654321");
        processor.process(bt, 120000);
    }
}