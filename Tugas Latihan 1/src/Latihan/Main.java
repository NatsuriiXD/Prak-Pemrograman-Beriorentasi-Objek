public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.createAccount("A1", "Nabil", 1000);
        bank.createAccount("A2", "Rauf", 500);
        bank.createAccount("A3", "Alex", 200);

        bank.findAccount("A1").deposit(300);
        bank.findAccount("A2").withdraw(100);

        bank.transfer("A1", "A3", 250);

        System.out.println("Saldo A1: " + bank.findAccount("A1").getBalance());
        System.out.println("Saldo A2: " + bank.findAccount("A2").getBalance());
        System.out.println("Saldo A3: " + bank.findAccount("A3").getBalance());
    }
}