package Main;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

import Log.TransfersLog;
import System.Accounts.Normal;
import System.Accounts.Premium;
import System.Accounts.Special;
import System.Bank;
import System.User;
import System.Agency;
import System.Account;
import org.w3c.dom.ls.LSOutput;


public class Main {

    //lISTS
    static List<Bank> banks = new ArrayList<>();
    static List<Agency> agencies = new ArrayList<>();
    static List<User> users = new ArrayList<>();
    static List<TransfersLog> transfersLogs = new ArrayList<>();
    static List<Account> accounts = new ArrayList<>();
        static List<Normal> normals = new ArrayList<>();
        static List<Special> specials = new ArrayList<>();
        static List<Premium> premiums = new ArrayList<>();




    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("-----!WELCOME TO OUR BAKING SYSTEM!-----");

        defaultUsers();

        int menuChoice = 0;

        //MENU OPTION//
        do {
            System.out.println("PLEASE CHOOSE ONE OF THE FOLLOWING MENU OPTIONS");
            System.out.println("1 - REGISTRATION;  2 - TRANSACTION; 3 - LOGIN; 4 - CHECK LOG; 5 - EXIT");
            System.out.println("\n");
            menuChoice = s.nextInt();
                if(menuChoice == 1){
                    registration();
                }else if(menuChoice == 2){
                    transaction();
                }
                else if (menuChoice == 3) {
                    LOGIN();
                }else if (menuChoice == 4){
                        CHECKLOG();
                }else if(menuChoice == 5){
                    EXIT();
                }else{
                    System.out.println("SORRY THIS FEATURE IS CURRENTLY UNAVAILABLE...");
                }
        }while(menuChoice != 5);



    }

    public static void registration(){
        Scanner s = new Scanner(System.in);
        System.out.println("LET´S START YOUR REGISTRATION!... ");
        //banks
        System.out.println("FIRST YOU BANK INFORMATIONS:");
            for(int i = 0; i < 1; i++) {
                System.out.println("Type your Bank ID number:");
                int ID = s.nextInt();
                System.out.println("Type the name of your Bank:");
                String name = s.next();

                Bank b = new Bank(ID, name);
                banks.add(b);
            }

        //Agency
        System.out.println("AGENCY INFORMATIONS:");
        for(int i = 0; i < 1; i++) {
            System.out.println("Type your Agency ID number:");
            int ID = s.nextInt();
            System.out.println("Type your Agency name:");
            String agencyName = s.next();
            System.out.println("Type your Bank ID number:");
            int bankID = s.nextInt();


            Agency a = new Agency(ID,agencyName, bankID);
            agencies.add(a);
        }

        //Users
        System.out.println("LOGIN/USER INFORMATIONS:");
        String emailVal = null;
        boolean emailOK = false;
        for(int i = 0; i < 1; i++) {
            System.out.println("Type your User ID number:");
                int ID = s.nextInt();
            System.out.println("Type your name:");
                String name = s.next();
            //Email Input/validation
                    do{
                        System.out.println("Type the E-Mail you´d like to use in your account:");
                        String email = s.next();
                        if (emailValidation(email)) {
//                            System.out.println(email + " is valid email");
                            emailOK = true;
                            emailVal = email;
                        }
                        else{System.out.println("The email you typed in is invalid, try again");
                            emailOK = false;
                        }

                    }while(!emailOK);

            System.out.println("Type your USERNAME for your LOGIN:");
                String login = s.next();
            System.out.println("Type your PASSWORD for your LOGIN (Numbers only!):");
                String password = s.next();

            User u = new User(ID, name, emailVal, login,password);
            users.add(u);
        }

        //Account -> type
        System.out.println("LASTLY YOUR ACCOUNT INFORMATION:");
        for(int i = 0; i < 1; i++) {
            System.out.println("Type your Account ID number:");
            int ID = s.nextInt();
            System.out.println("Type your Agency ID number:");
            int aID = s.nextInt();
            System.out.println("Type your User ID number:");
            int uID = s.nextInt();
            System.out.println("Inform your current account balance:");
            double balance = s.nextDouble();
            System.out.println("Type a number equivalent to the type of account you´d like to have( 1 -> NORMAL 2 -> ESPECIAL 3 -> PREMIUM):");
            int type = s.nextInt();

            Account a = new Account(ID, aID, uID, balance, type);
            accounts.add(a);

            //type registration


                if (type == 1) {
                    //normal
                    System.out.println("You´re All Set! you chose to remain with a normal account");
                    Normal n = new Normal(ID, aID, uID, balance, type);
                    normals.add(n);


                } else if (type == 2) {
                    //especial
                    for (int j = 0; j < 1; j++) {
                        System.out.println("Inform if you would like a ESPECIAL Credit Card:");
                        boolean especialCredit = s.nextBoolean();
                        System.out.println("Inform your current credit card balance:");
                        double especialBalance = s.nextDouble();

                        Special e = new Special(ID, aID, uID, balance, type, especialCredit, especialBalance);
                        specials.add(e);
                        System.out.println("You have successfully registered a ESPECIAL account");
                    }

                } else if (type == 3) {
                    for (int j = 0; j < 1; j++) {
                        System.out.println("Inform if you would like a PREMIUM Credit Card:");
                        boolean premiumCredit = s.nextBoolean();
                        System.out.println("Inform your current credit card balance:");
                        double premiumBalance = s.nextDouble();
                        System.out.println("Inform if you would LIS:");
                        boolean premiumLIS = s.nextBoolean();
                        System.out.println("Inform your LIS balance:");
                        double LISBalance = s.nextDouble();

                        Premium p = new Premium(ID, aID, uID, balance, type, premiumCredit, premiumBalance, premiumLIS, LISBalance);
                        premiums.add(p);

                        System.out.println("You have successfully registered a PREMIUM account");
                    }
                }else{
                    System.out.println("you did not choose any of the correct options, so as default your account will be registered as NORMAL");
                    Normal n = new Normal(ID, aID, uID, balance, type);
                    normals.add(n);
                }


            System.out.println("YOU HAVE NOW SUCCESSFULLY REGISTERED...");
        }



    }

    public static void defaultUsers(){

        //user 1
        Bank b1 = new Bank(213, "C6-Bank");
        banks.add(b1);
        Agency ag1 = new Agency(321,"Agencia1",213);
        agencies.add(ag1);
        User u1 = new User(123, "lucas", "plsb@gmail.com", "pedro.802","2806");
        users.add(u1);
        Account a1 = new Account(3214, 321, 123, 5000,1);
        accounts.add(a1);
        Normal n1 = new Normal(3214,321,123,5000,1);

        //user 2
        Bank b2 = new Bank(645, "C6-Bank");
        banks.add(b2);
        Agency ag2 = new Agency(765,"Agencia2",645);
        agencies.add(ag2);
        User u2 = new User(456, "pedro", "802@gmail.com", "lucas.802","2701");
        users.add(u2);
        Account a2 = new Account(4123, 765, 456, 5000,2);
        accounts.add(a2);
        Special s1 = new Special(4123,765,456,5000,2,true,400);
        specials.add(s1);
        //user 2
        Bank b3 = new Bank(987, "Next-Bank");
        banks.add(b3);
        Agency ag3 = new Agency(879,"Agencia1",987);
        agencies.add(ag3);
        User u3 = new User(789, "matthew", "mat@outlook.com", "mat.802","2202");
        users.add(u3);
        Account a3 = new Account(9678, 879, 789, 5000,3);
        accounts.add(a3);
        Premium p1 = new Premium(9678,879,789,5000,3,true, 700,false,0);
    }

    public static void transaction(){
        Scanner s = new Scanner(System.in);
        boolean loginOK = true;
        int ogPos = 0;
        int desPos = 0;
        double transferValue = 0 ;
        boolean original = false;
        boolean destiny = false;

        System.out.println("Type your transfer value:");
        transferValue = s.nextDouble();



        do {
            System.out.println("Type your User ID below:");
            int userIDInput = s.nextInt();
            System.out.println("Type your Password below:");
            String passwordInput = s.next();

            for (int i = 0; i < users.size(); i++){
                if ((Objects.equals(users.get(i).getUserID(), userIDInput) && Objects.equals(users.get(i).getUserPassword(), passwordInput)) && accounts.get(i).getAccountBalance() > transferValue) {
                    System.out.println("LOGIN successful ");
                    ogPos = i;
                    original = true;
                }
            }
            if (!original){
                System.out.println("!Error with Initial account, check your information or balance!");
            }
        }while(!original);





        do {
            System.out.println("Type the destiny User ID below:");
            int user2IDInput = s.nextInt();

            for (int i = 0; i < users.size(); i++){
                if ((Objects.equals(users.get(i).getUserID(), user2IDInput))) {
                    destiny = true;
                    System.out.println("Transaction successful ");
                    desPos = i;
                }
            }
            if (!destiny){
                System.out.println("!Error with destination account information!");
            }

        }while(!destiny);

            accounts.get(ogPos).setAccountBalance(accounts.get(ogPos).getAccountBalance() - transferValue);
            System.out.println("This is now your Account Balance: "+ accounts.get(ogPos).getAccountBalance());
            accounts.get(desPos).setAccountBalance(accounts.get(desPos).getAccountBalance() + transferValue);
//            System.out.println("This is now the destiny Account Balance: "+ accounts.get(desPos).getAccountBalance());
            System.out.println("\n");

            saveLOG(ogPos,desPos,transferValue);



    }

    public static void LOGIN(){

        Scanner s = new Scanner(System.in);
        boolean loginOK = false;
        int ogPos = 0;
        int desPos = 0;

        do {
            System.out.println("Type your LOGIN Username or E-mail below:");
            String usernameInput = s.next();
            System.out.println("Type your LOGIN Password below:");
            String passwordInput = s.next();

            for (int i = 0; i < users.size(); i++){
                if ((Objects.equals(users.get(i).getUserLOGIN(), usernameInput) || Objects.equals(users.get(i).getUserEMAIL(), usernameInput)) && Objects.equals(users.get(i).getUserPassword(), passwordInput)) {
                    System.out.println("LOGIN successful ");
                    ogPos = i;
                    loginOK = true;
                }
            }
            if (!loginOK){
                System.out.println("!Error with LOGIN information!");
            }
        }while(!loginOK);

        int choice =0;
        do {
            System.out.println("PLEASE CHOOSE ONE OF THE FOLLOWING OPTIONS");
            System.out.println("1 - CHECK ACCOUNT INFO;  2 - CHANGE PASSWORD; 3 - LOG OUT");
            System.out.println("\n");
            choice = s.nextInt();
            if(choice == 1){
                showUserInfo(ogPos);
            }else if(choice == 2){
                changePassword(ogPos);
            }else if(choice == 3){
                System.out.println("SUCCESSFULLY LOGGED OUT...");
            }else{
                System.out.println("SORRY THIS FEATURE IS CURRENTLY UNAVAILABLE...");
            }
        }while(choice != 3);

    }

    public static void EXIT(){
        System.out.println("\n");
        System.out.println("YOU HAVE CHOSEN TO EXIT THE SYSTEM...GOODBYE");
        System.out.println("... MAY THE FORCE BE WITH YOU...");
    }

    public static void saveLOG(int pos1, int pos2, double value){

        //salvar o log

        TransfersLog t = new TransfersLog(banks.get(pos1).bankID, agencies.get(pos1).getAgencyID(), accounts.get(pos1).getAccountID(), banks.get(pos2).bankID, agencies.get(pos2).getAgencyID(), accounts.get(pos2).getAccountID(),value);
        transfersLogs.add(t);

        //String filename = "C:\\Users\\PedroLucas\\Desktop\\eleitores.txt";
        String filename = "TransferLog.txt";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        try {
            FileWriter fw = new FileWriter(filename, true);
            for (int i = 0; i < transfersLogs.size(); i++) {
                fw.write("Transaction "+ i+ ":"+"\n");
                fw.write("Account of origin Info: "+" Bank ID: "+banks.get(pos1).bankID+"; Agency ID: "+agencies.get(pos1).getAgencyID()+"; Account ID: "+accounts.get(pos1).getAccountID()+"\n");
                fw.write("Account of Destiny Info: "+" Bank ID: "+banks.get(pos2).bankID+"; Agency ID: "+agencies.get(pos2).getAgencyID()+"; Account ID: "+accounts.get(pos2).getAccountID()+"\n");
                fw.write("Transaction Value: "+value+"; Data: "+(dtf.format(LocalDateTime.now())) +"\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Um erro do tipo IO ocorreu.");
        }
    }

    public static void CHECKLOG(){
        System.out.println("Our apologies this feature will soon be available... ");

    };

    public static boolean emailValidation(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +  //part before @
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static void showUserInfo(int pos){
        System.out.println("This is all the information associated to this account:");
        System.out.println(" ");
        System.out.println("BANK:");
        System.out.println("Name: "+banks.get(pos).getBankName()+"; ID: "+banks.get(pos).getBankID());
        System.out.println("AGENCY:");
        System.out.println("Name: "+agencies.get(pos).getAgencyName()+"; ID: "+agencies.get(pos).getAgencyID());
        System.out.println("USER:");
        System.out.println("Name: "+users.get(pos).getUserName()+"; ID: "+users.get(pos).getUserID()+"; LOGIN Username: "+users.get(pos).getUserLOGIN()+"; E-MAIL: "+users.get(pos).getUserEMAIL()+"; Password: "+users.get(pos).getUserPassword());
        System.out.println("\n");





    }

    public static void changePassword(int pos){
        Scanner s = new Scanner(System.in);
        boolean oldPassOK = false;

        do {
            System.out.println("Type your old password here");
            String oldPass = s.next();

            if(Objects.equals(users.get(pos).getUserPassword(), oldPass)){
                oldPassOK = true;
//                System.out.println("Correct Password.");

            }
            if(!oldPassOK){
                System.out.println("Wrong Password, try again...");
            }
        }while(!oldPassOK);

        boolean newPassOK = false;

        do{
            System.out.println("Type your new password: ");
            String new1 = s.next();
            System.out.println("Confirm your new password: ");
            String new2 = s.next();

            if(Objects.equals(new1, new2)){
                users.get(pos).setUserPassword(new2);
                newPassOK = true;
                System.out.print("Password changed successfully! ");

            }
            if(!newPassOK){
                System.out.println("The passwords do not match..");
            }
        }while(!newPassOK);

    }

}

