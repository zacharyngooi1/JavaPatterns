package unsw.banking;

public class LoggedBankAccount extends BankAccount {
    private String log;
    public LoggedBankAccount() {
        super();
        log = "";
    }

    // pre-condition: amount > 0
    // post-condition: balance = old balance + amount
    @Override
    public void deposit(int amount) {
        super.deposit(amount);
        log += "deposited " + amount + "\n";
    }
    
    // pre-condition: amount > 0
    // post-condition: ((amount < old balance) --> balance = old balance - amount))
    //                 ((amount >= old balance) --> balance = old balance))
    @Override
    public boolean withdraw(int amount) {
        boolean success = super.withdraw(amount);
        log += "Tried to withdraw " + amount + "success = " + success + "\n";
        return success;
    }

}