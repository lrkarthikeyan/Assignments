import java.util.Scanner;

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
