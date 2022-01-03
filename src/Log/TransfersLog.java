package Log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransfersLog {

    int originalBankID = 0;
    int originalAgencyID = 0;
    int originalAccountID = 0;
    int destinyBankID = 0;
    int destinyAgencyID = 0;
    int destinyAccountID = 0;
    double value = 0;


    public TransfersLog(int originalBankID, int originalAgencyID, int originalAccountID, int destinyBankID, int destinyAgencyID, int destinyAccountID, double value) {
        this.originalBankID = originalBankID;
        this.originalAgencyID = originalAgencyID;
        this.originalAccountID = originalAccountID;
        this.destinyBankID = destinyBankID;
        this.destinyAgencyID = destinyAgencyID;
        this.destinyAccountID = destinyAccountID;
        this.value = value;
    }


    public int getOriginalBankID() {
        return originalBankID;
    }

    public void setOriginalBankID(int originalBankID) {
        this.originalBankID = originalBankID;
    }

    public int getOriginalAgencyID() {
        return originalAgencyID;
    }

    public void setOriginalAgencyID(int originalAgencyID) {
        this.originalAgencyID = originalAgencyID;
    }

    public int getOriginalAccountID() {
        return originalAccountID;
    }

    public void setOriginalAccountID(int originalAccountID) {
        this.originalAccountID = originalAccountID;
    }

    public int getDestinyBankID() {
        return destinyBankID;
    }

    public void setDestinyBankID(int destinyBankID) {
        this.destinyBankID = destinyBankID;
    }

    public int getDestinyAgencyID() {
        return destinyAgencyID;
    }

    public void setDestinyAgencyID(int destinyAgencyID) {
        this.destinyAgencyID = destinyAgencyID;
    }

    public int getDestinyAccountID() {
        return destinyAccountID;
    }

    public void setDestinyAccountID(int destinyAccountID) {
        this.destinyAccountID = destinyAccountID;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }











}


//    public void saveLOG(int originalBank, int originalAgency, int originalAccount, int destinyBank, int destinyAgency, int destinyAccount, double value, String dateTime){
//
//    }
