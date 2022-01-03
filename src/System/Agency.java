package System;

public class Agency {

    public int agencyID = 0;
    public String agencyName = null;
    public int bankIDAgency = 0;

    public Agency(int agencyID, String agencyName, int bankIDAgency) {
        this.agencyID = agencyID;
        this.agencyName = agencyName;
        this.bankIDAgency = bankIDAgency;
    }

    public int getAgencyID() {
        return agencyID;
    }

    public void setAgencyID(int agencyID) {
        this.agencyID = agencyID;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public int getBankIDAgency() {return bankIDAgency;}

    public void setBankIDAgency(int bankIDAgency) {this.bankIDAgency = bankIDAgency;}

}
