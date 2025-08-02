import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

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
