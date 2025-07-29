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


// Qn 2 -

interface PaymentMethod {
    void pay(double amount);
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose which gateway method \n1. Credit Card Payment \n2. Debit Card Payment \n3. UPI Payment ");
        int choice = scan.nextInt();
        PaymentMethod m = null;
        switch (choice){
            case 1 -> {
                m = new CreditCardPayment();
                System.out.print("Welcome to Credit card payment \nEnter the amount : ");
                double amount = scan.nextDouble();
                m.pay(amount);
            }
            case 2 -> {
                m = new DebitCardPayment();
                System.out.print("Welcome to Debit card payment \nEnter the amount : ");
                double amount = scan.nextDouble();
                m.pay(amount);
            }
            case 3 -> {
                m = new DebitCardPayment();
                System.out.print("Welcome to UPI payment \nEnter the amount : ");
                double amount = scan.nextDouble();
                m.pay(amount);
            }
        }
    }
}

class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Credit card Payment Successfully done! \nTransferred amount is "+amount);
    }
}

class DebitCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Debit card Payment Successfully done! \nTransferred amount is "+amount);
    }
}

class UPIPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment Successfully done! \nTransferred amount is "+amount);
    }
}

//Qn - 3

abstract class Employee {
    int amount;
    public abstract void calculateSalary(int days);
}

class FullTimeEmployee extends Employee{

    @Override
    public void calculateSalary(int days) {
        amount = 2000;
        System.out.println("Your Full time work wages is : "+days*amount);
    }
}

class PartTimeEmployee extends Employee{

    @Override
    public void calculateSalary(int days) {
        amount = 500;
        System.out.println("Your Part time work wages is : "+days*amount);
    }
}

class MainForEmployee {
    public static void main(String[] args) {
        Employee em = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose 1 for Full time work \n2 for Part time work ");
        int choice = scan.nextInt();
        switch (choice){
            case 1 -> {
                em = new FullTimeEmployee();
                System.out.print("How many days have you worked : ");
                int days = scan.nextInt();
                em.calculateSalary(days);
            }
            case 2 -> {
                em = new PartTimeEmployee();
                System.out.print("How many days have you worked : ");
                int days = scan.nextInt();
                em.calculateSalary(days);
            }
            default -> System.out.println("You didn't choose the right choice!");
        }
    }
}

//Qn - 4 

interface EmployeeInterface {
    void calculateSalary(int days);
}

class PartTimeEmployeeForInterface implements EmployeeInterface{
    int amount;
    PartTimeEmployeeForInterface(){
        this.amount = 200;
    }
    @Override
    public void calculateSalary(int days) {
        System.out.print("Your part time salary is "+days*amount);
    }
}

class FullTimeEmployeeForInterface implements EmployeeInterface{
    int amount;
    FullTimeEmployeeForInterface(){
        this.amount = 2000;
    }
    @Override
    public void calculateSalary(int days) {
        System.out.print("Your Full time salary is "+days*amount);
    }
}

class MainForInterfaceEmployee {
    public static void main(String[] args) {
        EmployeeInterface eg = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose 1 for Part time employee \n2 for Full time employee : ");
        int choice = scan.nextInt();
        switch (choice){
            case 1 ->{
                eg = new PartTimeEmployeeForInterface();
                System.out.print("How many days have you worked : ");
                int days = scan.nextInt();
                eg.calculateSalary(days);
            }
            case 2 ->{
                eg = new FullTimeEmployeeForInterface();
                System.out.print("How many days have you worked : ");
                int days = scan.nextInt();
                eg.calculateSalary(days);
            }
            default -> System.out.println("You didn't choose the correct choice!");
        }
    }
}

// Qn - 5 

interface Ticket {
    void bookTicket();
}

class BusTicket implements Ticket {

    int amount;

    BusTicket(){
        amount = 1000;
    }

    @Override
    public void bookTicket() {
        System.out.println("Your Bus ticket amount is : "+amount);
    }
}

class TrainTicket implements Ticket{

    int amount;

    TrainTicket(){
        amount = 500;
    }

    @Override
    public void bookTicket() {
        System.out.println("Your Train ticket amount is : "+amount);
    }
}

class FlightTicket implements Ticket{
    int amount;

    FlightTicket(){
        amount = 2000;
    }

    @Override
    public void bookTicket() {
        System.out.println("Your Flight Ticket amount is : "+amount);
    }
}

class MainForTicket {
    public static void main(String[] args) {
        Ticket tc = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter your departure place : ");
        String departurePlace = scan.nextLine();
        System.out.print("Enter your departure time :  ");
        String time = scan.nextLine();
        System.out.print("Which place you wanna travel : ");
        String place = scan.nextLine();
        System.out.print("All three transports are available which one you prefer \n1 for Train \n2 for Bus \n3 for flight ");
        int choice = scan.nextInt();
        switch (choice){
            case 1 -> {
                tc = new TrainTicket();
                displayDetails(name,departurePlace,time,place,tc);
            }
            case 2 -> {
                tc = new BusTicket();
                displayDetails(name,departurePlace,time,place,tc);
            }
            case 3 -> {
                tc = new FlightTicket();
                displayDetails(name,departurePlace,time,place,tc);
            }
            default -> System.out.println("You didn't choose a right choice!");
        }
    }
    private static void displayDetails(String name,String departurePlace,String time,String place,Ticket tc){
        System.out.println("----------------");
        System.out.println("------BILL------");
        System.out.println("Your name : "+name);
        System.out.println("Your departure place "+departurePlace);
        System.out.println("Your departure time "+time);
        System.out.println("Your travel destination "+place);
        tc.bookTicket();
        System.out.println("----------------");
    }
}
