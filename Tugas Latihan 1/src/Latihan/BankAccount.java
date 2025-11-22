public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        setBalance(initialBalance);
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }
    public double getBalance() { return balance; }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty())
            throw new IllegalArgumentException("Owner name cannot be empty");
        this.ownerName = ownerName;
    }

    private void setBalance(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Initial balance cannot be negative");
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }
}