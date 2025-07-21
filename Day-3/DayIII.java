import java.util.ArrayList;

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
    static String storeName;
    static String storeLocation;
    ArrayList<Product> productsList;

    Store(){
        productsList = new ArrayList<>();
    }

    public static void setStoreDetails(String storeName,String storeLocation) {
        Store.storeLocation = storeLocation;
        Store.storeName = storeName;
    }

    public static void displayStoreDetails(){
        System.out.println("Store name: "+storeName);
        System.out.println("Store Location: "+storeLocation);
    }

    public void addProduct(Product product){
        productsList.add(product);
    }

    public void displayAll(){
        if(productsList.isEmpty()){
            System.out.println("No products in the store");
        }
        else{
            System.out.println("Products in the store");
            for(Product pr : productsList){
                pr.displayAllProducts();
            }
        }
    }
}


class Product {
    private  int id;
    private  String name;
    private  int price;
    private  String quality;

    Product(int id, String name, int price, String quality) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public void displayAllProducts(){
        System.out.println("The Product details \nName : "+name+"\nId : "+id+"\nPrice : "+ price +"\nQuality : "+quality);
    }
}


class SimpleInventory {
    public static void main(String[] args) {
        Store.setStoreDetails("tech","Mumbatan");
        Store.displayStoreDetails();
        Store st1 =new Store();

        Product p1 = new Product(1,"button",541,"Good");
        Product p2 = new Product(2,"cases",20,"Bad");

        st1.addProduct(p1);
        st1.addProduct(p2);
        st1.displayAll();
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


