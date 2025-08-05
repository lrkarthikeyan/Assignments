import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;

//Qn - 1 Illustrates with an example of using Singleton class.

class SingletonClass {
    private static SingletonClass obj;

    private SingletonClass(){};

    public static SingletonClass getObj(){
        if(obj==null){
            return obj = new SingletonClass();
        }
        return obj;
    }

}

class MainSingleton {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getObj();
        SingletonClass obj1 = SingletonClass.getObj();
        System.out.println("Both objects are pointing to the same memory address that why this came as "+obj1.equals(obj));
    }
}

// Qn 2 - Develop a Java program which illustrates the usage of Comparator Interface.

class SortByName implements Comparator<Employees>{
    @Override
    public int compare(Employees s1,Employees s2){
        return s1.getName().compareTo(s2.getName());
    }
}

class ComparatorEx {

    public static void main(String[] args) {

        ArrayList<Employees> arr = new ArrayList<>();
        Employees s1 = new Employees(20,42,"William");
        Employees s2 = new Employees(21,21,"Zen parker");
        Employees s3 = new Employees(21,44,"Stefan");
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        System.out.println("Before sort by name : \n");
        System.out.println(arr);
        System.out.println("After sort by name : \n");
        arr.sort(new SortByName());
        System.out.println(arr);

    }
}

class Employees{
    int age;
    int rollNum;
    String name;

    Employees(int age, int rollNum, String name){
        this.age = age;
        this.rollNum = rollNum;
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Name :" +this.getName() +", Age : "+this.getAge()+", Roll no. : "+this.getRollNum()+"\n";
    }

}

//Qn - 3 Develop a Java program to illustrate pass-by-value.

class Students implements Comparable<Students>{
    private final int age;
    private final String name;
    private final int rollNum;

    public Students(int age, String name,int rollNum){
        this.age = age;
        this.name = name;
        this.rollNum = rollNum;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getRollNum() {
        return rollNum;
    }

    @Override
    public int compareTo(Students other) {
        return this.rollNum - other.rollNum;
    }

    @Override
    public String toString() {
        return "Name : "+this.getName()+", Age : "+this.getAge()+", Roll No : "+this.getRollNum();
    }
}

class MainForComparable {
    public static void main(String[] args) {
        Students s1 = new Students(20,"Damon",21);
        Students s2 = new Students(19,"Stefan",19);
        Students s3 = new Students(19,"Katherina",15);
        ArrayList<Students> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        Collections.sort(arr);
        for(Students a : arr){
            System.out.println(a);
        }
    }
}

//Qn - 4 Get some strings through the command-line prompt and use an array to store and display them.

class CommandLinePromptArray {
    public static void main(String[] args) {
        System.out.println("This is the stored array from the command line : "+Arrays.toString(args));
    }
}

//Qn - 5 Write a program to illustrate the usage of clone() and find out what kind of copy it will make.

class Address {

    String city;

    public Address(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}

class Animal implements Cloneable{
    String name;
    String breed;
    int age;
    Address address;

    public Animal(String name,String breed, int age,String address){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.address = new Address(address);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

class AboutClonable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal a1 = new Animal("Dog","Dalmation",7,"New york");
        Animal a2 = (Animal) a1.clone();
        System.out.println("Before change \n");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("\nAfter change that first animal city as Boston ");
        a1.address.setCity("Boston");
        System.out.println("\nAfter change \n");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("\nThis is a shallow copy");
    }
}


// Qn - 6 Develop a Java program to illustrate pass-by-value.

class PassByValueCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("Before passing it to a primitive parameter method your num is : "+num);
        primitiveCheck(num);
        scan.nextLine();
        System.out.println("After passed the number to the method the num is : "+num);
        System.out.print("Enter the String: ");
        StringBuilder str = new StringBuilder(scan.nextLine());
        System.out.println("Before passing it to a non primitive parameter method your String is : "+str);
        nonPrimitiveCheck(str);
        System.out.println("After passed the number to the method the String is : "+str);
    }
    private static void primitiveCheck(int num) {
        num = Integer.MIN_VALUE;
    }
    private static void nonPrimitiveCheck(StringBuilder str){
        str.setLength(0);
        str.append("See its value is changed");
    }
}

/*Qn - 7 Develop a Java program to illustrate the usage of toString() method.*/

class ToStringUsage {

    String name;

    public ToStringUsage(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : "+this.name;
    }

    public static void main(String[] args) {
        ToStringUsage name1 = new ToStringUsage("Steve");
        ToStringUsage name2 = new ToStringUsage("Klaus");
        ToStringUsage name3 = new ToStringUsage("Damon");
        ToStringUsage[] str = {name1,name2,name3};
        System.out.println("We added three names and first we use the default toString");
        System.out.println(str);
        System.out.println("Now we overridden it for the Arrays and that shows ");
        System.out.println(Arrays.toString(str));
    }

}

/* Qn - 8 Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable */

class Department{
    int departmentId;
    String departmentName;

    public Department(int departmentId,String departmentName){
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}

class Student implements Cloneable{
    Department department;
    String name;
    int rollNum;

    public Student(int rollNum,String name,String departmentName,int departmentId){
        this.name = name;
        this.rollNum = rollNum;
        this.department = new Department(departmentId,departmentName);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", rollNum=" + rollNum +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student(21,"Walter","Chemistry",5);
        Student s2 =null;
        try{
            s2 = (Student) s1.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Before change the Subject : ");
        System.out.println(s2);
        System.out.println(s1);
        System.out.println("Lets changed the subject : ");
        s1.department.setDepartmentName("Physics");
        System.out.println(s1);
        System.out.println(s2);
    }

}