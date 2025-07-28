import java.util.Scanner;

/*Qn 1 - Create a base class MedicalRecord with common attributes (recordId, patientName, dateOfVisit, diagnosis) and methods inputRecordDetails() and displayRecord() (overridable).
	Extend it with:
	InPatientRecord → adds roomNumber, numberOfDaysAdmitted, roomCharges, includes calculateTotalCharges() and overrides displayRecord().
	OutPatientRecord → adds doctorName, consultationFee, and overrides displayRecord().*/
	
class MedicalRecord {

    int recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;

    public void inputRecordDetails(int recordId, String patientName, String dateOfVisit, String diagnosis){
        this.recordId = recordId;
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.dateOfVisit = dateOfVisit;
    }

    public void displayRecord(){
        System.out.println("\n--------BILL--------\nYour name :"+this.patientName+"\nYour id : "+this.recordId+"\nYour date of visit : "+this.dateOfVisit+"\nYour diagnosis : "+this.diagnosis);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter your id : ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your health issue : ");
        String diagnosis = scan.nextLine();
        System.out.print("Enter the date of visit : ");
        String dateOfVisit = scan.nextLine();
        MedicalRecord md = null;
        System.out.print("Do you wanna stay here to full checkup or just a simple test is \n1 to get admit(In patient) : \n2 to simple checkup(Out patient) :");
        int choice = scan.nextInt();
        switch (choice){
            case 1 -> {
                System.out.print("Your Room id : ");
                int roomNo = scan.nextInt();
                System.out.print("No of days admitted :");
                int noOfDays = scan.nextInt();
                md = new InPatientRecord(id,name,dateOfVisit,diagnosis,roomNo,noOfDays);
                md.displayRecord();
            }
            case 2 -> {
                md = new OutPatient(id,name,dateOfVisit,diagnosis);
                md.displayRecord();
            }
            default -> System.out.print("You didn't choose the right option!!");
        }
    }

}

class InPatientRecord extends MedicalRecord {

    int roomNumber;
    int numberOfDaysAdmitted;
    int roomCharges = 300;

    public InPatientRecord(int recordId, String patientName, String dateOfVisit, String diagnosis,int roomNumber,int numberOfDaysAdmitted){
        super.inputRecordDetails(recordId,patientName,dateOfVisit,diagnosis);
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Your room charges : "+this.roomCharges * this.numberOfDaysAdmitted+"\nYour room number : "+this.roomNumber+"\nNo. of days admitted : "+this.numberOfDaysAdmitted);
        System.out.println("--------------------");
    }
}

class OutPatient extends MedicalRecord{
    final String doctorName = "Vasi";
    static final int CONSULTANT_FEE = 300;

    OutPatient(int recordId, String patientName, String dateOfVisit, String diagnosis){
        super.inputRecordDetails(recordId,patientName,dateOfVisit,diagnosis);
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Your Doctor's name : "+this.doctorName+"\nYour consultant fee : "+OutPatient.CONSULTANT_FEE);
        System.out.println("--------------------");
    }
}


//Qn 2 Can we override private method, constructor, static method, final method? Illustrate with an example.

class ExampleClass {

    ExampleClass(){

    }

    private void exampleMethod(){

    }

    public final void exampleMethodForFinal(){

    }

    public static void exampleMethodForStatic(){

    }

}
class Child extends ExampleClass{

    ExampleClass(){

    }

    public final void exampleMethodForFinal(){

    }

    void exampleMethod(){

    }

    public  void exampleMethodForStatic(){

    }

}

class MainForExampleClass {
    public static void main(String[] args) {
        ExampleClass em = new Child();
        em.exampleMethod();
        em.exampleMethodForStatic();
		em.exampleMethodForFinal();
		ExampleClass egForClass = new ExampleClass();
    }
}

/*These are the error 

Day5.java:119: error: invalid method declaration; return type required
    ExampleClass(){
    ^
1 error
Day5.java:123: error: exampleMethodForFinal() in Child cannot override exampleMethodForFinal() in ExampleClass
    public final void exampleMethodForFinal(){
                      ^
  overridden method is final
Day5.java:140: error: exampleMethod() has private access in ExampleClass
        em.exampleMethod();
Day5.java:131: error: exampleMethodForStatic() in Child cannot override exampleMethodForStatic() in ExampleClass
    public  void exampleMethodForStatic(){
                 ^
  overridden method is static
 
*/


/*Qn 3 Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). 
Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.*/

class Employee {

    private int howManyDays;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public int getHowManyDays() {
        return howManyDays;
    }

    public void setHowManyDays(int howManyDays) {
        this.howManyDays = howManyDays;
    }

    public int calculateSalary(){
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("1 to Full Time Employee : \n2 to PartTime : \n3 to Exit : ");
            int choice = scan.nextInt();
            Employee em = null;
            switch (choice){
                case 1 ->{
                    em = new FullTimeEmployee();
                    setFunction(em,scan);
                }
                case 2 ->{
                    em = new PartTimeEmployee();
                    setFunction(em,scan);
                }
                case 3 ->{
                    System.exit(0);
                }
                default -> System.out.println("Choose a right choice!");
            }
        }
    }

    private static void setFunction(Employee em,Scanner scan){
        System.out.print("How many days have you worked : ");
        int howManyDays = scan.nextInt();
        em.setHowManyDays(howManyDays);
        System.out.println("Your Total Salary is : "+em.calculateSalary());
    }
}

class FullTimeEmployee extends Employee{
    private int howManyDays;
    private int salary = 2000;

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public int getHowManyDays() {
        return howManyDays;
    }

    @Override
    public void setHowManyDays(int howManyDays) {
        this.howManyDays = howManyDays;
    }

    @Override
    public int calculateSalary(){
        return  getHowManyDays() * getSalary();
    }
}

class PartTimeEmployee extends Employee {
    private int howManyDays;
    private int salary = 500;

    public int getSalary() {
        return salary;
    }

    @Override
    public int getHowManyDays() {
        return howManyDays;
    }

    @Override
    public void setHowManyDays(int howManyDays) {
        this.howManyDays = howManyDays;
    }

    @Override
    public int calculateSalary(){
        return getHowManyDays() * getSalary();
    }
}

/*Qn 4 Design a Java Ticket Booking System using polymorphism where Bus, Train, and 
Flight tickets share a common method but implement booking differently. */

class Ticket {

    private int ticketId;
    private String passengerName;
    private String departurePlace;
    private int departureTime;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public void details(){
        System.out.println("Your Ticket Details ");
        System.out.println("Your Name "+this.getPassengerName());
        System.out.println("Your Departure Place :"+this.getDeparturePlace());
        System.out.println("Your Departure Time : "+this.getDepartureTime());
        System.out.println("Your Ticket Id : "+this.getTicketId());
    }

}

class Bus extends Ticket{
    private static final int ticketRate = 500;

    public void details(){
        super.details();
        System.out.println("Your Ticket Rate is : "+Bus.ticketRate);
    }

}

class Train extends Ticket{
    private static final int ticketRate = 1000;

    public void details(){
        super.details();
        System.out.println("Your Ticket Rate is : "+Train.ticketRate);
    }

}

class Flight extends Ticket{
    private static final int ticketRate = 10000;

    public void details(){
        super.details();
        System.out.println("Your Ticket Rate is : "+Flight.ticketRate);
    }

}

class MainForTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Which Ticket you want : \n1 for bus : \n2 for train : \n3 for Aeroplane : \n4 to exit : ");
            int choice = scan.nextInt();
            Ticket tc = null;
            switch (choice) {
                case 1 -> {
                    tc = new Bus();
                    setValues(tc, scan);
                }
                case 2 -> {
                    tc = new Train();
                    setValues(tc, scan);
                }
                case 3 -> {
                    tc = new Flight();
                    setValues(tc, scan);
                }
                case 4 -> {
                    System.exit(0);
                }
                default -> System.out.println("Select a right choice!");
            }
        }
    }
    private static void setValues(Ticket tc,Scanner scan){
        scan.nextLine();
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        tc.setPassengerName(name);
        System.out.print("Enter your Departure Place :" );
        String place = scan.nextLine();
        tc.setDeparturePlace(place);
        System.out.print("Enter your ticket id : ");
        int ticketId = scan.nextInt();
        tc.setTicketId(ticketId);
        System.out.print("Enter your Departure Time : ");
        int time = scan.nextInt();
        tc.setDepartureTime(time);
        tc.details();
    }
}
