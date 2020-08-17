package unsw.banking;

public class BankAccount {
    
    private int balance;

    public BankAccount() {
        balance = 0;
    }
    
    // pre-condition: amount > 0
    // post-condition: ((amount < old balance) --> balance = old balance - amount))
    //                 ((amount >= old balance) --> balance = old balance))
    public boolean withdraw(int amount) {
        if (amount < balance) {
            balance = balance - amount;
            return true;
        }
        else {
            return false;
        }
    }

    // pre-condition: amount > 0
    // post-condition: balance = old balance + amount
    public void deposit(int amount) {
        balance += amount;
    }

	public int getBalance() {
		return balance;
	}

    // Guarantee that with the pre condition being true, will guarantee based on the code the post condition will be true will answer the question if the code is sufficient to guarantee both the pre and post conditons
    // Basically if they as about a class invariant, e.g. balance is >= 0 you must see
    // all methods called in the class, result in the clas invariant always holding true;

    // livkovs substituation principle, pre conditons must be the same or weaker in the subclass, post conditins must be the same or stronger. the means that it implies the weaker part which can be in the form of additonal variable implementations in the methods of the stronger one
	public void setBalance(int balance) {
		this.balance = balance;
	}
}