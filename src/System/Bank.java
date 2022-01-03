package System;

public class Bank {

    public int bankID = 001;
    public String bankName = null;

    public Bank(int bankID, String bankName){
        this.bankID = bankID;
        this.bankName = bankName;
    }


   //GETS AND SETS
    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}


