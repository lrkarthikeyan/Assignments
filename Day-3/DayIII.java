import java.util.ArrayList;
import java.util.Scanner;

//Qn 1

class Student {
    String name;
    int rollNo;

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "John";
        std1.rollNo = 2;
        System.out.println(std1.name +","+std1.rollNo);
    }
}

//Qn 2

class StudentForQn2 {
    String name;
    int rollNo;
    int phoneNo;
    String address;

    StudentForQn2(String name, int rollNo, int phoneNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public static void main(String[] args) {
        StudentForQn2 std1 = new StudentForQn2("Sam",001,54481626,"Chennai");
        StudentForQn2 std2 = new StudentForQn2("John",002,2164932,"Coimbatore");
        System.out.println("The first Student details \nName : "+std1.name+"\nRollNo : "+std1.rollNo+"\nPhone no : "+ std1.phoneNo +"\nAddress : "+std1.address);
        System.out.println("The second Student details \nName : "+std2.name+"\nRollNo : "+std2.rollNo+"\nPhone no : "+ std2.phoneNo +"\nAddress : "+std2.address);
    }
}

//Qn 3 

class Employee {
    String name;
    int id;
    String designation;
    int salary;

    Employee() {
        System.out.println("Object has been created ");
        this.name = "Null";
        this.id = 0;
        this.designation = "Null";
        this.salary = 0;
    }

    Employee(String name, int id, String designation, int salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(Employee other){
        this.name = other.name;
        this.salary = other.salary;
        this.id = other.id;
        this.designation = other.designation;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Arthur",007,"Data Analyst",10_00_000);
        Employee emp3 = new Employee(emp2);
        System.out.println("The first Employee details \nName : "+emp1.name+"\nDesignation : "+emp1.designation+"\nId : "+ emp1.id +"\nSalary : "+emp1.salary);
        System.out.println("The second Employee details \nName : "+emp2.name+"\nDesignation : "+emp2.designation+"\nId : "+ emp2.id +"\nSalary : "+emp2.salary);
        System.out.println("The third Employee details \nName : "+emp3.name+"\nDesignation : "+emp3.designation+"\nId : "+ emp3.id +"\nSalary : "+emp3.salary);
    }
}

//Qn 4

class Vehicle {
    int id;
    String brandName;
    int price;
    static int count;
    Vehicle(){
        count++;
    }
    Vehicle(int id,String brandName, int price){
        this.id = id;
        this.brandName = brandName;
        this.price = price;
        count++;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(007,"Porshe",7_00_000_000);
        System.out.println("The no of vehicles created so far is : "+Vehicle.count);
    }
}

//Qn 5

class Store {

    static String name;
    static String location;
    static ArrayList<Product> products = new ArrayList<>();

    public static void setStoreDetails(String name,String location){
        Store.name = name;
        Store.location = location;
    }

    public static void addProductsToStore(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the product name : ");
        String name = scan.nextLine();
        System.out.print("Enter product id : ");
        int id = scan.nextInt();
        System.out.print("Enter product price : ");
        int price = scan.nextInt();
        System.out.print("Enter product quantity : ");
        int quantity = scan.nextInt();
        products.add(new Product(id,name,price,quantity));
    }
    public static void viewProducts() {
        System.out.println("----------------------------------------");
        System.out.println("Store Name : " + Store.name);
        System.out.println("Store Location : " + Store.location);
        if (Store.products.isEmpty()) {
            System.out.println("----------------------------------------");
            System.out.println("There ain't no products in the store right now");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("----------------------------------------");
            System.out.printf("%-10s%-10s%-10s%-10s", "ID", "NAME", "PRICE", "QUANTITY");
            System.out.println();
            System.out.println("----------------------------------------");
            for (Product pr : Store.products) {
                System.out.printf("%-10d", pr.id);
                System.out.printf("%-10s", pr.name);
                System.out.printf("%-10d", pr.price);
                System.out.printf("%-10d", pr.quantity);
                System.out.println();
            }System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
        }
    }
    public static void showStoreDetails(){
        System.out.println("----------------------------------------");
        System.out.println("The Store is "+Store.name+" & the Location is "+Store.location);
        System.out.println("----------------------------------------");
    }
}


// product class

class Product {
    int id;
    String name;
    int price;
    int quantity;

    Product( int id,String name,int price,int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

//Main class


class SimpleInventory extends Store{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Set store name : ");
        String name = scan.nextLine();
        System.out.print("Set store location : ");
        String location = scan.nextLine();
        setStoreDetails(name,location);
        while (true){
            System.out.print("Enter 1 to add products : \nEnter 2 to view the details of the product : \nEnter 3 to Display the Store details \nEnter 4 to exit : ");
            int choice = scan.nextInt();
            switch (choice){
                case 1 -> addProductsToStore();
                case 2 -> viewProducts();
                case 3 -> showStoreDetails();
                case 4 -> System.exit(0);
				default -> {
					System.out.println("------------------------");
					System.out.println("Choose a correct choice");
					System.out.println("------------------------");
				}

            }
        }
    }
}


// Qn 6

class EmployeesList {
    String name;
    int year;
    String address;
    static ArrayList<EmployeesList> emp= new ArrayList<>();

    EmployeesList(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
        emp.add(this);
    }

    public static void main(String[] args) {
        EmployeesList emp1 = new EmployeesList("Robert", 1994, "64-C WallsStreet");
        EmployeesList emp2 = new EmployeesList("Sam", 2000, "68-D LakeView");
        EmployeesList emp3 = new EmployeesList("John", 1999, "22-B RiverSide");
        returnAllEmployees();
    }

    private static void returnAllEmployees(){
        for(EmployeesList emp1 : emp){
            System.out.println(emp1.name+", "+emp1.year+", "+emp1.address);
        }
    }
}


