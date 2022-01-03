package System.Accounts;
import System.Account;

public class Premium extends Account {

    public boolean credit = false;
    public double creditBalance = 0;
    public boolean LIS = false;
    public double LISBalance = 0;


    public Premium(int accountID, int agencyIDAccount, int userIDAccount, double accountBalance, int accountType, boolean credit, double creditBalance, boolean LIS, double LISBalance) {
        super(accountID, agencyIDAccount, userIDAccount, accountBalance, accountType);
        this.credit = credit;
        this.creditBalance = creditBalance;
        this.LIS = LIS;
        this.LISBalance = LISBalance;
    }

    public boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    public boolean isLIS() {
        return LIS;
    }

    public void setLIS(boolean LIS) {
        this.LIS = LIS;
    }

    public double getLISBalance() {
        return LISBalance;
    }

    public void setLISBalance(double LISBalance) {
        this.LISBalance = LISBalance;
    }
}
