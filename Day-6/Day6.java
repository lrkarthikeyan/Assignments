import com.StringUtils;
import com.Arithmetic;
import com.travel.booking.Ticket;
import com.travel.user.User;

import java.util.Scanner;

//Qn 1

class PaymentGateway {
    private int transactionId;
    private String payerName;
    private String payeeName;
    private int amount;
    private String paymentMethod;
    private String transactionMethod;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionMethod() {
        return transactionMethod;
    }

    public void setTransactionMethod(String transactionMethod) {
        this.transactionMethod = transactionMethod;
    }

    public void displayTransactionSummary(){
        System.out.println("--------------------------------");
        System.out.println("Transaction Status ");
        System.out.println("--------------------------------");
        System.out.println("The Transaction Id : "+getTransactionId()+"\nThe Payer Name : "+getPayerName()+"\nThe Payee Name : "+getPayeeName()+"\nThe Amount : "+getAmount()+"\nThe Payment Method : "+getPaymentMethod()+"\nThe Transaction Status : "+getTransactionMethod());;
        System.out.println("--------------------------------");
    }

}

 class PaymentMethodMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PaymentGateway obj = new PaymentGateway();
        System.out.println("Payment Gateway Area ");
        System.out.print("Set the transaction id : ");
        int transactionId = scan.nextInt();
        obj.setTransactionId(transactionId);
        scan.nextLine();
        System.out.print("Who's the payer : ");
        String payerName = scan.nextLine();
        obj.setPayerName(payerName);
        System.out.print("Who's the payee : ");
        String payeeName = scan.nextLine();
        obj.setPayeeName(payeeName);
        System.out.print("Whats the amount : ");
        int amount = scan.nextInt();
        obj.setAmount(amount);
        scan.nextLine();
        System.out.print("Whats the payment method : ");
        String paymentMethod = scan.nextLine();
        obj.setPaymentMethod(paymentMethod);
        System.out.print("Whats the transaction status : ");
        String transactionMethod = scan.nextLine();
        obj.setTransactionMethod(transactionMethod);
        obj.displayTransactionSummary();
    }
}

// Qn 2 

class MainForPackage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Arithmetic ar = new Arithmetic();
        StringUtils st = new StringUtils();
        while (true){
            System.out.println("1 for Arithmetic : \n2 for String : \n3 for exit");
            int choice1 = scan.nextInt();
            switch (choice1){
                case 1 ->{
                    System.out.print("1 to addition : \n2 to subtraction : \n3 to multiplication : \n4 to division :\n5 to modulus :");
                    int choice = scan.nextInt();
                    switch (choice){
                        case 1 -> {
                            System.out.print("Enter num 1 :");
                            int num1 = scan.nextInt();
                            ar.setA(num1);
                            System.out.print("Enter num 2 :");
                            int num2 = scan.nextInt();
                            ar.setB(num2);
                            System.out.println("The result is "+ar.addition());
                        }
                        case 2 -> {
                            System.out.print("Enter num 1 :");
                            int num1 = scan.nextInt();
                            ar.setA(num1);
                            System.out.print("Enter num 2 :");
                            int num2 = scan.nextInt();
                            ar.setB(num2);
                            System.out.println("The result is "+ar.subtraction());
                        }
                        case 3 -> {
                            System.out.print("Enter num 1 :");
                            int num1 = scan.nextInt();
                            ar.setA(num1);
                            System.out.print("Enter num 2 :");
                            int num2 = scan.nextInt();
                            ar.setB(num2);
                            System.out.println("The result is "+ar.multiplication());
                        }
                        case 4 -> {
                            System.out.print("Enter num 1 :");
                            int num1 = scan.nextInt();
                            ar.setA(num1);
                            System.out.print("Enter num 2 :");
                            int num2 = scan.nextInt();
                            ar.setB(num2);
                            System.out.println("The result is "+ar.division());
                        }
                        case 5 -> {
                            System.out.print("Enter num 1 :");
                            int num1 = scan.nextInt();
                            ar.setA(num1);
                            System.out.print("Enter num 2 :");
                            int num2 = scan.nextInt();
                            ar.setB(num2);
                            System.out.println("The result is "+ar.modulus());
                        }
                        default -> System.out.println("Select a right choice!!!");
                    }
                }
                case 2 -> {
                    System.out.println("1 for concatenation of two Strings : \n2 for reversing a String : \n3 for Find the length of a String");
                    int choice = scan.nextInt();
                    scan.nextLine();
                    switch (choice){
                        case 1 ->{
                            System.out.print("Enter first String :");
                            String str1 = scan.nextLine();
                            st.setA(str1);
                            System.out.print("Enter second String :");
                            String str2 = scan.nextLine();
                            st.setB(str2);
                            System.out.println("The concatenation of two strings is "+st.concatenateTwoStrings());
                        }
                        case 2 ->{
                            System.out.print("Enter a String :");
                            String str1 = scan.nextLine();
                            st.setA(str1);
                            System.out.println("The reverse of the string is "+st.reverseString());
                        }
                        case 3 ->{
                            System.out.print("Enter a String :");
                            String str1 = scan.nextLine();
                            st.setA(str1);
                            System.out.println("The Length of the string is "+st.length());
                        }
                        default -> System.out.println("Select a right choice!!!");
                    }
                }
                case 3 -> System.exit(0);
            }
        }
    }
}

//Qn 3 

class Employee {

    private int employeeId;
    private String name;
    private String designation;
    private String department;
    private int salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int annualSalary(){
        return getSalary()*12;
    }
}

class MainForEmployee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee em = new Employee();
        System.out.print("Enter the Employee id : ");
        int id = scan.nextInt();
        em.setEmployeeId(id);
        scan.nextLine();
        System.out.print("Enter the Name : ");
        String name = scan.nextLine();
        em.setName(name);
        System.out.print("Enter the Designation : ");
        String designation = scan.nextLine();
        em.setDesignation(designation);
        System.out.print("Enter the Department : ");
        String department = scan.nextLine();
        em.setDepartment(department);
        System.out.print("Enter the Salary : ");
        int salary = scan.nextInt();
        em.setSalary(salary);
        System.out.println("The Annual Salary is "+em.annualSalary());
    }
}

//Qn 4

class TicketBooking {
    public static void main(String[] args) {
        User us = new User();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        us.setUserName(name);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        us.setAge(age);
        scan.nextLine();
        System.out.print("Enter your D.O.B : ");
        String dob = scan.nextLine();
        us.setDob(dob);
        System.out.print("Enter your Gender : ");
        String gender = scan.nextLine();
        us.setGender(gender);
        System.out.print("Enter your Phone number : ");
        long phoneNum = scan.nextInt();
        us.setPhoneNo(phoneNum);
        scan.nextLine();
        System.out.print("Enter your destination : ");
        String destination = scan.nextLine();
        us.setDestination(destination);
        us.ticketBooking();
        while (true){
            System.out.print("Wanna check the details Enter 1 or 2 to exit ");
            int choice = scan.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("------------------\nTicket Details\n------------------");
                    System.out.println("Your Ticket ID : "+us.getTicketId()+"\nYour Name : "+us.getUserName()+"\nYour Age : "+us.getAge()+"\nYour D.O.B : "+us.getDob()+"\nYour Gender : "+us.getGender()+"\nYour Phone number : "+us.getPhoneNo()+"\nYour Destination : "+us.getDestination()+"\nYour Fare : "+us.getFare());
                    System.out.println("------------------");
                }
                case 2 -> System.exit(0);
                default -> System.out.println("Choose a right option!");
            }
        }
    }
}

//Qn 5 

 class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private long balance;

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public long getBalance(){
        return balance;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public void deposit(long amount){
        this.balance+=amount;
        System.out.println("Your total balance is : "+this.balance);
    }

    public void withdraw(long amount){
        long temp = this.balance;
        temp=temp-amount;
        if(temp<0){
            System.out.println("Sorry you can't withdraw the amount it will go beyond your balance!!");
        }
        else{
            this.balance = temp;
            System.out.println("Your total balance is : "+this.balance);
        }
    }

}


class MainForBankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount c1 = new BankAccount();
        System.out.print("Enter your Account number : ");
        long accountNumber = scan.nextInt();
        c1.setAccountNumber(accountNumber);
        scan.nextLine();
        System.out.print("Enter your Name : ");
        String name = scan.nextLine();
        c1.setAccountHolderName(name);
        System.out.print("Enter your Balance : ");
        long accountBalance = scan.nextInt();
        c1.setBalance(accountBalance);
        while (true){
            System.out.print("1 to withdraw amount : \n2 to deposit amount : \n3 to show account details : \n4 to exit : " );
            int choice = scan.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.print("Enter the amount to withdraw : ");
                    int amount = scan.nextInt();
                    c1.withdraw(amount);
                }
                case 2 -> {
                    System.out.print("Enter the amount to be deposited : ");
                    int deposit = scan.nextInt();
                    c1.deposit(deposit);
                }
                case 3 ->{
                    System.out.println("Your name :"+c1.getAccountHolderName());
                    System.out.println("Your account number : "+c1.getAccountNumber());
                    System.out.println("Your balance : "+c1.getBalance());
                }
                case 4 -> {
                    System.out.print("Exiting the system ");
                    System.exit(0);
                }
                default -> System.out.println("Enter a right choice!!!");
            }
        }
    }
}
