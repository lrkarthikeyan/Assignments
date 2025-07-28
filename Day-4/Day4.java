import java.util.Scanner;
import java.util.ArrayList;

/* Qn 1 - We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.*/

class Bike extends Vehicles {
    int cylinders;
    int noOfGears;
    String coolingType;
    String wheelType;
    int fuelTankSize;
}

class Car extends Vehicles{
    int ownerShipCost;
    int warranty;
    int seatingCapacity;
    String fuel;
}

class Audi extends Car{
    String modelType;
}

class Ford extends Car{
    String modelType;
}

class Bajaj extends Bike{
    String modelType;
}

class TVS extends Bike{
    String modelType;
}

class Vehicles {
    int mileage;
    int price;

    public static void main(String[] args) {
        System.out.println("Welcome to store ");
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("--------------------");
            System.out.println("1 to select car \n2 to select bike \n3 to exit ");
            System.out.println("--------------------");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("--------------------");
                    System.out.println("1 to Audi car \n2 to FORD car \n3 to exit ");
                    System.out.println("--------------------");
                    int whichBrand = scan.nextInt();
                    switch (whichBrand) {
                        case 1 -> {
                            Audi c1 = new Audi();
                            System.out.print("Whats the mileage you need : ");
                            c1.mileage = scan.nextInt();
                            System.out.print("Whats your price for the car : ");
                            c1.price = scan.nextInt();
                            System.out.print("Whats the ownership cost : ");
                            c1.ownerShipCost = scan.nextInt();
                            System.out.print("How many years warranty you want : ");
                            c1.warranty = scan.nextInt();
                            System.out.print("How much seat capacity : ");
                            c1.seatingCapacity = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Whats the model type :");
                            c1.modelType = scan.nextLine();
                            System.out.print("Finally which fuel type you need for the car : ");
                            c1.fuel = scan.nextLine();
                            System.out.println("------------------------------------------");
                            System.out.println("Here's your dream AUDI CAR as you expected \nThe MILEAGE : " + c1.mileage + "\nThe PRICE COST : " + c1.price + "\nThe OWNERSHIP COST : " + c1.ownerShipCost + "\nThe WARRANTY : " + c1.warranty + "\nThe SEATING CAPACITY : "  +c1.seatingCapacity +"The MODEL TYPE : " +c1.modelType+"\nThe FUEL TYPE : " + c1.fuel);
                            System.out.println("------------------------------------------");
                        }
                        case 2 -> {
                            Ford c1 = new Ford();
                            System.out.print("Whats the mileage you need : ");
                            c1.mileage = scan.nextInt();
                            System.out.print("Whats your price for the car : ");
                            c1.price = scan.nextInt();
                            System.out.print("Whats the ownership cost : ");
                            c1.ownerShipCost = scan.nextInt();
                            System.out.print("How many years warranty you want : ");
                            c1.warranty = scan.nextInt();
                            System.out.print("How much seat capacity : ");
                            c1.seatingCapacity = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Whats the model type :");
                            c1.modelType = scan.nextLine();
                            System.out.print("Finally which fuel type you need for the car : ");
                            c1.fuel = scan.nextLine();
                            System.out.println("------------------------------------------");
                            System.out.println("Here's your dream FORD CAR as you expected \nThe MILEAGE : " + c1.mileage + "\nThe PRICE COST : " + c1.price + "\nThe OWNERSHIP COST : " + c1.ownerShipCost + "\nThe WARRANTY : " + c1.warranty + "\nThe SEATING CAPACITY : " + c1.seatingCapacity +"\nThe MODEL TYPE : "+ c1.modelType+"\nThe FUEL TYPE : " + c1.fuel);
                            System.out.println("------------------------------------------");
                        }
                        case 3 -> System.exit(0);
                        default -> System.out.print("We don't have that model car ");
                    }
                }
                case 2 -> {
                    System.out.print("1 for Balaji bike \n2 for TVS bike \n3 for exit ");
                    int whichBrand = scan.nextInt();
                    switch (whichBrand) {
                        case 1 -> {
                            Bajaj b1 = new Bajaj();
                            System.out.print("Whats the mileage you need : ");
                            b1.mileage = scan.nextInt();
                            System.out.print("Whats your price for the car : ");
                            b1.price = scan.nextInt();
                            System.out.print("How much cylinders you want : ");
                            b1.cylinders = scan.nextInt();
                            System.out.print("How many gears you want : ");
                            b1.noOfGears = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Which cooling type you prefer : ");
                            b1.coolingType = scan.nextLine();
                            System.out.print("Finally which fuel type you need for the car : ");
                            b1.wheelType = scan.nextLine();
                            System.out.println("------------------------------------------");
                            System.out.println("Here's your dream BALAJI BIKE as you expected \nThe MILEAGE : " + b1.mileage + "\nThe PRICE COST : " + b1.price + "\nThe CYLINDERS : " + b1.cylinders + "\nThe NUMBER OF GEARS : " + b1.noOfGears + "\nThe COOLING TYPE " + b1.coolingType + "\nThe WHEEL TYPE : " + b1.wheelType + "\nThe FUEL TANK SIZE " + b1.fuelTankSize);
                            System.out.println("------------------------------------------");
                        }
                        case 2 -> {
                            TVS b1 = new TVS();
                            System.out.print("Whats the mileage you need : ");
                            b1.mileage = scan.nextInt();
                            System.out.print("Whats your price for the car : ");
                            b1.price = scan.nextInt();
                            System.out.print("How much cylinders you want : ");
                            b1.cylinders = scan.nextInt();
                            System.out.print("How many gears you want : ");
                            b1.noOfGears = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Which cooling type you prefer : ");
                            b1.coolingType = scan.nextLine();
                            System.out.print("Finally which fuel type you need for the car : ");
                            b1.wheelType = scan.nextLine();
                            System.out.println("------------------------------------------");
                            System.out.println("Here's your dream BALAJI BIKE as you expected \nThe MILEAGE : " + b1.mileage + "\nThe PRICE COST : " + b1.price + "\nThe CYLINDERS : " + b1.cylinders + "\nThe NUMBER OF GEARS : " + b1.noOfGears + "\nThe COOLING TYPE " + b1.coolingType + "\nThe WHEEL TYPE : " + b1.wheelType + "\nThe FUEL TANK SIZE " + b1.fuelTankSize);
                            System.out.println("------------------------------------------");
                        }
                        case 3 -> System.exit(0);
                        default -> System.out.print("We don't have that model bike ");
                    }
                }
                case 3 -> System.exit(0);
                default -> System.out.println("We only have car and bike");
            }
        }
    }
}


/*Qn 2 - Construct a base class called twoD contains x and y and methods to read and write the x and y. 
Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z.
Also writ e a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor waith two arguments" */

class TwoD {

    private double x;
    private double y;

    TwoD(){
        System.out.println("TwoD default constructor");
    }

    TwoD(double x,double y){
        System.out.println("TwoD constructor with two arguments");
        setX(x);
        setY(y);
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}


class ThreeD extends TwoD {

    ThreeD(){}
    ThreeD(double x,double y,double z){
        super(x,y);
        setZ(z);
    }

    private double z;

    public double getZ() {
        return z;
    }

    public void setZ(double z){
        this.z = z;
    }

    public double findDistance(ThreeD a){
        return Math.sqrt(Math.pow(this.getX()-a.getX(),2)+Math.pow(this.getY()-a.getY(),2)+Math.pow(this.getZ()-a.getZ(),2));
    }

}


class MainForThreeDPoints {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Program to find the distance between two 3d points");
        ThreeD obj1 = null;
        ThreeD obj2 = null;
        System.out.print("Enter value of X for Obj1 : ");
        double x1 = scan.nextInt();
        System.out.print("Enter value of Y for Obj1 : ");
        double y1 = scan.nextInt();
        System.out.print("Enter value of Z for obj1 : ");
        double z1 = scan.nextInt();
        obj1 = new ThreeD();
        obj1.setX(x1);
        obj1.setY(y1);
        obj1.setZ(z1);
        System.out.print("Enter value of X for obj2 : ");
        double x2 = scan.nextInt();
        System.out.print("Enter value of Y for obj2 : ");
        double y2 = scan.nextInt();
        System.out.print("Enter value of Z for obj2 : ");
        double z2 = scan.nextInt();
        obj2 = new ThreeD(x2,y2,z2);
        System.out.println("The distance between for 2D points is "+obj2.findDistance(obj1));
    }
}

/*Qn 3 Design a Point class with x, y coordinates and methods to set/get/print them. 
Then create a derived Circle class with radius, area(), and proper validation (radius > 0, else set to 1), 
using Point's public methods to access center coordinates.
Write a driver program to test both classes.*/

class Point {
    private int x;
    private int y;

    Point(){

    }

    public int getX(){
        return x;
    }

    public void setPoints(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getY(){
        return y;
    }

    public void printPoints(){
        System.out.println("Circle center is ("+getX()+" ,"+getY()+")");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x : ");
        int x = scan.nextInt();
        System.out.print("Enter the y : ");
        int y = scan.nextInt();
        System.out.print("Enter the radius : ");
        int radius = scan.nextInt();
        Circle c = new Circle(x,y,radius);
        c.area();
    }

}

class Circle extends Point{

    private int radius;

    Circle(int x,int y, int radius){
        super.setPoints(x,y);
        setRadius(radius);
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius<=0 ? 1 : radius;
    }

    public void area(){
        super.printPoints();
        System.out.println("The Area of this circle is "+ 3.14 * this.getRadius() * this.getRadius() );
    }

}

/* Qn 4 -  Write a program to illustrate that Classes cannot be used for multiple Inheritance.

class Parent1 {
    void displayWhoAmI(){
        System.out.println("Parent 1 is here!");
    }
}

class Parent2 {
    void displayWhoAmI(){
        System.out.println("Parent 2 is here!");
    }
}

class Child extends Parent1,Parent2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.displayWhoAmI();
    }
}
 The child doesn't know which one to call that's why multiple inheritance isn't supported in inheritance */
 
/* Qn - 5 Create a class named Shape with a method that prints "This is a shape". 
Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". 
Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" 
respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.*/

class Shape {
    void aboutShape(){
        System.out.println("This is a Shape ");
    }
}

class Polygon extends Shape{
    void aboutShape(){
        System.out.println("Polygon is a Shape");
    }
}

class Rectangle extends Shape{
    void aboutShape(){
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Shape {
    void aboutShape(){
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Shape {
    void aboutShape(){
        System.out.println("Square is a rectangle");
    }
}

class MainForShapes {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.aboutShape();
        s = new Polygon();
        s.aboutShape();
        s = new Rectangle();
        s.aboutShape();
        s = new Triangle();
        s.aboutShape();
        s = new Square();
        s.aboutShape();
    }
}

/*Qn 6 - Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and 
object containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated.*/

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
            Product.displayProducts();
            System.out.println("----------------------------------------");
        }
    }
    public static void showStoreDetails(){
        System.out.println("----------------------------------------");
        System.out.println("The Store is "+Store.name+" & the Location is "+Store.location);
        System.out.println("----------------------------------------");
    }
}

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

    static void displayProducts(){
        for (Product pr : Store.products) {
            System.out.printf("%-10d", pr.id);
            System.out.printf("%-10s", pr.name);
            System.out.printf("%-10d", pr.price);
            System.out.printf("%-10d", pr.quantity);
            System.out.println();
        }
    }

}

class MainForStore extends Store {
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
                default -> System.out.println("Choose a correct choice");
            }
        }
    }
}
