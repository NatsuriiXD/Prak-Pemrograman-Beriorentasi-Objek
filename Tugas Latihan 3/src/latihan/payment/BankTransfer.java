package latihan.payment;

public class BankTransfer implements PaymentMethod {

    private String accountNumber;

    public BankTransfer(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean pay(double amount) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Gagal: Nomor rekening kosong.");
            return false;
        }

        System.out.println("Transfer Bank sebesar " + amount);
        return true;
    }
}