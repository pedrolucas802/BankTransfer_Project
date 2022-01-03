package System;

public class User {
    int userID = 0;
    public String userName = null;
    public String userEMAIL = null;
    public String userLOGIN = null;
    public String userPassword = null;

    public User(int userID, String userName, String userEMAIL, String userLOGIN, String userPassword) {
        this.userID = userID;
        this.userName = userName;
        this.userEMAIL = userEMAIL;
        this.userLOGIN = userLOGIN;
        this.userPassword = userPassword;
    }


//gets and sets
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEMAIL() {
        return userEMAIL;
    }

    public void setUserEMAIL(String userEMAIL) {
        this.userEMAIL = userEMAIL;
    }

    public String getUserLOGIN() {
        return userLOGIN;
    }

    public void setUserLOGIN(String userLOGIN) {
        this.userLOGIN = userLOGIN;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }



}
