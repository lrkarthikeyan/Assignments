import java.util.Scanner;

//Qn 1

class RBI {
    private final static double MINIMUM_INTEREST_RATE = 4;
    private final static int MINIMUM_BANK_BALANCE = 1000;
    private final static int MAXIMUM_WITHDRAWAL_LIMIT = 1_00_000;

    public static double getMinimumInterestRate(){
        return RBI.MINIMUM_INTEREST_RATE;
    }

    public static int getMinimumBankBalance(){
        return RBI.MINIMUM_BANK_BALANCE;
    }

    public static int getMaximumWithdrawalLimit() {
        return MAXIMUM_WITHDRAWAL_LIMIT;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account a = new Account();
        Customer c = new Customer();
        while (true){
            System.out.print("Which bank you prefer : \n1 to ICICI : \n2 to RBI : \n3 to SBI : \n4 to Exit : ");
            int choice = scan.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Welcome to ICICI Bank!");
                    System.out.println("---------------------");
                    Account.setDetails(a,c);
                    Customer.displayDetails(a,c);
                    System.out.println("---------------------");
                    System.out.println("Your minimum interest rate "+ICICI.getMinimumInterestRate());
                    System.out.println("Your minimum balance should be rate "+ICICI.getMinimumBankBalance());
                    System.out.println("Your maximum withdrawal rate "+ICICI.getMaximumWithdrawalLimit());
                    System.out.println("Thanks for using our bank!");
                    System.out.println("---------------------");
                }
                case 2 ->{
                    System.out.println("Welcome to RBI Bank!");
                    System.out.println("---------------------");
                    Account.setDetails(a,c);
                    Customer.displayDetails(a,c);
                    System.out.println("---------------------");
                    System.out.println("Your minimum interest rate "+RBI.getMinimumInterestRate());
                    System.out.println("Your minimum balance should be rate "+RBI.getMinimumBankBalance());
                    System.out.println("Your maximum withdrawal rate "+RBI.getMaximumWithdrawalLimit());
                    System.out.println("Thanks for using our bank!");
                    System.out.println("---------------------");
                }
                case 3 ->{
                    System.out.println("Welcome to SBI Bank!");
                    System.out.println("---------------------");
                    Account.setDetails(a,c);
                    Customer.displayDetails(a,c);
                    System.out.println("---------------------");
                    System.out.println("Your minimum interest rate "+SBI.getMinimumInterestRate());
                    System.out.println("Your minimum balance should be rate "+SBI.getMinimumBankBalance());
                    System.out.println("Your maximum withdrawal rate "+SBI.getMaximumWithdrawalLimit());
                    System.out.println("Thanks for using our bank!");
                    System.out.println("---------------------");
                }
				case 4 -> System.exit(0);
                default -> System.out.println("Choose a correct option!");
            }
        }
    }

}


class SBI extends RBI{

    private final static double MINIMUM_INTEREST_RATE = RBI.getMinimumInterestRate()+ (double) 10 /100;
    private final static int MINIMUM_BANK_BALANCE = RBI.getMinimumBankBalance() + 100;
    private final static int MAXIMUM_WITHDRAWAL_LIMIT = RBI.getMaximumWithdrawalLimit() - 10000;

    public static double getMinimumInterestRate() {
        return MINIMUM_INTEREST_RATE;
    }

    public static int getMinimumBankBalance() {
        return MINIMUM_BANK_BALANCE;
    }

    public static int getMaximumWithdrawalLimit() {
        return MAXIMUM_WITHDRAWAL_LIMIT;
    }
}


class ICICI extends RBI{

    private final static double MINIMUM_INTEREST_RATE = RBI.getMinimumInterestRate()+ (double) 20 /100;
    private final static int MINIMUM_BANK_BALANCE = RBI.getMinimumBankBalance() + 200;
    private final static int MAXIMUM_WITHDRAWAL_LIMIT = RBI.getMaximumWithdrawalLimit() - 20000;

    public static int getMaximumWithdrawalLimit() {
        return MAXIMUM_WITHDRAWAL_LIMIT;
    }

    public static double getMinimumInterestRate() {
        return MINIMUM_INTEREST_RATE;
    }

    public static int getMinimumBankBalance() {
        return MINIMUM_BANK_BALANCE;
    }
}

class Account {

    private long accountNumber;
    private String typeOfAccount;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public static void setDetails(Account a, Customer c){
        Scanner scan = new Scanner(System.in);
        System.out.print("Your name : ");
        String name = scan.nextLine();
        c.setName(name);
        System.out.print("Your gender :");
        String gender = scan.nextLine();
        c.setGender(gender);
        System.out.print("Your email : ");
        String email = scan.nextLine();
        c.setEmail(email);
        System.out.print("Your address : ");
        String address = scan.nextLine();
        c.setAddress(address);
        System.out.print("Your phone number : ");
        int phoneNumber = scan.nextInt();
        c.setPhoneNumber(phoneNumber);
        System.out.print("Choose your account number : ");
        long accountNumber = scan.nextLong();
        a.setAccountNumber(accountNumber);
        scan.nextLine();
        System.out.print("Your account type : ");
        String accountType = scan.nextLine();
        a.setTypeOfAccount(accountType);
    }

}

class Customer {

    private String name;
    private String gender;
    private String email;
    private String address;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void displayDetails(Account a,Customer c){
        System.out.println("---------------------");
        System.out.println("Your details ");
        System.out.println("---------------------");
        System.out.println("Your name : "+c.getName());
        System.out.println("Your gender :"+c.getGender());
        System.out.println("Your email : "+c.getEmail());
        System.out.println("Your address : "+c.getAddress());
        System.out.println("Your phone number : "+c.getPhoneNumber());
        System.out.println("Your account number : "+a.getAccountNumber());
        System.out.println("Your account type : "+a.getTypeOfAccount());

    }

}
