public class AccountImpl implements Account {
    private int balance;

    public AccountImpl(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public int withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }
}
