import java.util.Scanner;

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


//Qn 2

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
