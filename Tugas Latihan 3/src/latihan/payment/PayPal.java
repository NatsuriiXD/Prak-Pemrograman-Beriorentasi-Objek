package latihan.payment;

public class PayPal implements PaymentMethod {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(double amount) {
        if (email == null || !email.contains("@")) {
            System.out.println("Gagal: Email PayPal tidak valid.");
            return false;
        }

        System.out.println("Pembayaran via PayPal sebesar " + amount);
        return true;
    }
}