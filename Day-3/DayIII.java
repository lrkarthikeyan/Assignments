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

//Qn 8

class AdvancedCalculator extends BasicCalculator{
    public double power(double base, double exponent){
        return Math.pow(base,exponent);
    }
    public double modulus(double num1,double num2){
        return num1%num2;
    }
    public double squareRoot(double num){
        return Math.sqrt(num);
    }
}

class ScientificFunction extends AdvancedCalculator{
    public double sin(double angle){
        return Math.sin(angle);
    }
    public double cos(double angle){
        return Math.cos(angle);
    }
    public double log(double value){
        return Math.log(value);
    }
    public double exp(double value){
        return Math.exp(value);
    }
}

class BasicCalculator {
    public double add(double num1,double num2){
        return num1+num2;
    }
    public double sub(double num1,double num2){
        return num1-num2;
    }
    public double mul(double num1,double num2){
        return num1*num2;
    }
    public double div(double num1,double num2){
        return num1/num2;
    }
}

class MainForCalculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		ScientificFunction bc = new ScientificFunction();
		double a = 0;
		double b = 0;
        while (true){
            System.out.println("Math functions \n1. Addition \n2. Subtraction \n3. Multiply \n4. Division \n5. Power \n6. Modulus \n7. SquareRoot \n8. Sin \n9. Cos \n10. Log \n11. Exponential \n12. Exit");
            int choice = scan.nextInt();
			switch(choice){
				case 1,2,3,4,5,6 -> {
					System.out.print("Enter num 1 : ");
                    a = scan.nextDouble();
                    System.out.print("Enter num 2 : ");
                    b = scan.nextDouble();
				}
				case 7,8,9,10,11 -> {
					System.out.print("Enter num : ");
                    a = scan.nextDouble();
				}
			}
            switch (choice){
                case 1 -> System.out.println("The addition of two nums "+bc.add(a,b));
               
                case 2 -> System.out.println("The subtraction of two nums "+bc.sub(a,b));
                case 3 -> System.out.println("The multiplication of two nums "+bc.mul(a,b));
                case 4 -> System.out.println("The division of two nums "+bc.div(a,b));
                case 5 -> System.out.println("The Power num is "+bc.power(a,b));
                case 6 -> System.out.println("The modulus of two nums "+bc.modulus(a,b));
                case 7 -> System.out.println("The Square root of two nums "+bc.squareRoot(a));
                case 8 -> System.out.println("The sine  "+bc.sin(a));
                case 9 -> System.out.println("The cos  "+bc.cos(a));
                case 10 -> System.out.println("The log  "+bc.log(a));
                case 11 -> System.out.println("The exponent  "+bc.exp(a));
                case 12 -> System.exit(0);
                default -> System.out.println("That option isn't available yet");
            }
        }
    }
}


// Qn - 7 

class MyString {

    private char[] ch;
    private int length = 0;
    MyString(String s){
        try {
            while (true){
                s.charAt(length);
                length++;
            }
        }
        catch (Exception e){
            ch = new char[length];
            for(int i = 0;i<length;i++){
                ch[i] = s.charAt(i);
            }
        }
    }

    int length(){
        return length;
    }

    char charAt(int index){
        if(index<0 || index>=length) return '-';
        return ch[index];
    }

    boolean equals(String other){
        int otherLength = 0;
        try {
            while (true){
                other.charAt(otherLength);
                otherLength++;
            }
        }
        catch (Exception e){
            if(ch.length!=otherLength){
                return false;
            }
            else{
                for(int i = 0;i<otherLength;i++){
                    if(ch[i]!=other.charAt(i)){
                        return false;
                    }
                }
            }
            return true;
        }
    }

    String  toUpperCase(){
        String newOne = "";
        for(int i = 0;i<length;i++){
            if(ch[i]>=97 && ch[i]<=122){
                newOne += (char)(ch[i] - 32);
            }
            else{
                newOne += ch[i];
            }
        }
        return newOne;
    }

    String toLowerCase(){
        String newOne = "";
        for(int i = 0;i<length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                newOne += (char)(ch[i] + 32);
            }
            else{
                newOne += ch[i];
            }
        }
        return newOne;
    }

    String subString(int start, int end){
        String subString = "";
        if(end>length || start<0){
            if(end>=length) return "Index will be out of bound";
            else return "There ain't a index less than 0 ";
        }
        else{
            for(int i = start;i<end;i++){
                subString += ch[i];
            }
            return "The Substring is "+subString;
        }
    }

    String concat(String other){
        String newOne = "";
        int otherLength = 0;
        for(int i = 0;i<length;i++){
            newOne += ch[i];
        }
        try {
            while (true){
                other.charAt(otherLength);
                otherLength++;
            }
        }
        catch (Exception e){
            for(int i=0;i<otherLength;i++){
                newOne+=other.charAt(i);
            }
            return newOne;
        }
    }

    boolean contains(String subString){
        int otherLength = 0;
        try {
            while (true){
                subString.charAt(otherLength);
                otherLength++;
            }
        }
        catch (Exception e){
            if(otherLength>length){
                return false;
            }
            else{
                for(int i = 0;i<=length-otherLength;i++){
                    int j = 0;
                    if(ch[i]==subString.charAt(j)){
                        int temp = i;
                        int count = 0;
                        try{
                            while (ch[temp]==subString.charAt(j) && count<otherLength){
                                temp++;
                                count++;
                                j++;
                            }
                        }
                        catch (Exception k){
                            if(count==otherLength){
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
    }

    int indexOf(char c){
        for(int i = 0;i<length;i++){
            if(ch[i]==c) return i;
        }
        return -1;
    }

    String replace(char oldChar, char newChar){
        String newOne = "";
        for(int i = 0;i<length;i++){
            if(ch[i]==oldChar) newOne += newChar;
            else newOne += ch[i];
        }
        for(int i = 0;i<length;i++){
            ch[i] = newOne.charAt(i);
        }
        return newOne;
    }
    String ourString(){
        String ans = "";
        for(char cha : ch){
            ans+=cha;
        }
        return ans;
    }

}

class MainForMyString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scan.nextLine();
        MyString newString = new MyString(str);
        while (true){
            System.out.println("These are the options ");
            System.out.println("1 for length ");
            System.out.println("2 for return character from a specific index ");
            System.out.println("3 for check two strings are equal ");
            System.out.println("4 to make String to Uppercase ");
            System.out.println("5 to make the String to lowercase ");
            System.out.println("6 to return a substring ");
            System.out.println("7 to suffix concatenate with another string ");
            System.out.println("8 to check if the String contains the substring ");
            System.out.println("9 to find the first occurrence of a character");
            System.out.println("10 to replace a character from your String ");
            System.out.println("11 to show your String ");
            System.out.print("12 to exit ");
            int choice = scan.nextInt();
            switch (choice){
                case 1 -> System.out.println("The length of your string is : "+newString.length());
                case 2 -> {
                    System.out.print("Enter the index value : ");
                    int index = scan.nextInt();
                    char ch = newString.charAt(index);
                    if(ch=='-'){
                        System.out.println("The index is greater or less than your actual string ");
                    }
                    else{
                        System.out.println("The char at the index is "+ch);
                    }
                }
                case 3 -> {
                    scan.nextLine();
                    System.out.print("Enter the new String : ");
                    String newOne = scan.nextLine();
                    String ans = newString.equals(newOne) ? "Both are same:)" : "Not same :(";
                    System.out.println(ans);
                }
                case 4 -> System.out.println("The Uppercase of your String is : "+newString.toUpperCase());
                case 5 -> System.out.println("The Lowercase of your String is : "+newString.toLowerCase());
                case 6 -> {
                    System.out.print("Enter the start index : ");
                    int start = scan.nextInt();
                    System.out.print("Enter the end index : ");
                    int end = scan.nextInt();
                    System.out.println(newString.subString(start,end));
                    }
                case 7 -> {
                    scan.nextLine();
                    System.out.print("Enter the new String you wanna concatenate : ");
                    String gonnaAdd = scan.nextLine();
                    System.out.println("The Concatenation of your String is : "+newString.concat(gonnaAdd));
                }
                case 8 -> {
                    scan.nextLine();
                    System.out.print("Enter the substring you wanna check : ");
                    String check = scan.nextLine();
                    boolean br = newString.contains(check);
                    if(br){
                        System.out.println("Its a substring of the old string ");
                    }
                    else{
                        System.out.println("This ain't a substring of that one ");
                    }
                }
                case 9 -> {
                    scan.nextLine();
                    System.out.print("Give the character : ");
                    char check = scan.nextLine().charAt(0);
                    int ans = newString.indexOf(check);
                    if(ans==-1){
                        System.out.println("The character ain't in the String");
                    }
                    else{
                        System.out.println("The character's first index is at :"+ans);
                    }
                }
                case 10 -> {
                    scan.nextLine();
                    System.out.print("Enter the character you wanna replace : ");
                    char replace = scan.nextLine().charAt(0);
                    System.out.print("Which character you wanna insert at the old char's place :");
                    char newChar = scan.nextLine().charAt(0);
                    System.out.println("The new String is "+newString.replace(replace,newChar));
                }
                case 11 -> System.out.println("Our string is : "+newString.ourString());
                case 12 -> System.exit(0);
                default -> System.out.println("Choose a right choice!");
            }
			System.out.println();
        }
    }
}
