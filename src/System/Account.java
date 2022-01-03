package System;

public class Account {


    public int accountID = 0;
    public int agencyIDAccount = 0;
    public int userIDAccount = 0;
    public double accountBalance = 0;
    public int accountType = 0;


    public Account(int accountID, int agencyIDAccount, int userIDAccount, double accountBalance, int accountType) {
        this.accountID = accountID;
        this.agencyIDAccount = agencyIDAccount;
        this.userIDAccount = userIDAccount;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }



    public int getAccountID() {return accountID;}

    public void setAccountID(int accountID) {this.accountID = accountID;}

    public int getAgencyIDAccount() {return agencyIDAccount;}

    public void setAgencyIDAccount(int agencyIDAccount) {this.agencyIDAccount = agencyIDAccount;}

    public int getUserIDAccount() {return userIDAccount;}

    public void setUserIDAccount(int userIDAccount) {this.userIDAccount = userIDAccount;}

    public double getAccountBalance() {return accountBalance;}

    public void setAccountBalance(double accountBalance) {this.accountBalance = accountBalance;}

    public int getAccountType() {return accountType;}

    public void setAccountType(int accountType) {this.accountType = accountType;}
}
