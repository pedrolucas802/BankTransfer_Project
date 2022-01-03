package System.Accounts;
import System.Account;

public class Special extends Account {

    public boolean credit = false;
    public double creditBalance = 0;

    public Special(int accountID, int agencyIDAccount, int userIDAccount, double accountBalance, int accountType, boolean credit, double creditBalance) {
        super(accountID, agencyIDAccount, userIDAccount, accountBalance, accountType);
        this.credit = credit;
        this.creditBalance = creditBalance;
    }
}
