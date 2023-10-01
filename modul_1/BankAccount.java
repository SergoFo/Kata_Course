public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Zaur";
        MyAccount.balance=12.35;

        System.out.println(HisAccount.name);
    }
}
