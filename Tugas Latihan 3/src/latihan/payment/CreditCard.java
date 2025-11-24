package latihan.payment;

public class CreditCard implements PaymentMethod {

    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            System.out.println("Gagal: Nomor kartu tidak boleh kosong.");
            return false;
        }

        System.out.println("Pembayaran via Credit Card sebesar " + amount);
        return true;
    }
}