import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void createAccount(String accNumber, String ownerName, double initialBalance) {
        if (accounts.containsKey(accNumber))
            throw new IllegalArgumentException("Account already exists");
        accounts.put(accNumber, new BankAccount(accNumber, ownerName, initialBalance));
    }

    public BankAccount findAccount(String accNumber) {
        return accounts.get(accNumber);
    }

    public void transfer(String fromAcc, String toAcc, double amount) {
        BankAccount from = findAccount(fromAcc);
        BankAccount to = findAccount(toAcc);

        if (from == null || to == null)
            throw new IllegalArgumentException("Account not found");

        from.withdraw(amount);
        to.deposit(amount);
    }
}