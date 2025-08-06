import java.util.Scanner;
import java.util.InputMismatchException;
import javax.naming.AuthenticationException;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Qn - 1 Program to check if person is eligible to vote or not.
	int[] arr = {2, 5, 1, 4, 0, 7};
	int quotient = arr[7] / arr[4];
	Develop a Java program which handles any unexpected situations that may arise during execution.*/

class IsEligible {
    public static void main(String[] args) {
        int[] arr = {2,5,1,4,0,7};
        try{
            int quotient = arr[7]/arr[0];
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

/*Qn - 2 Demonstrate multiple catch blocks: accept two numbers as strings, 
then convert them to integers, and perform division, and catch the following exceptions: 
InputMismatchException, NumberFormatException, ArithmeticException and Exception. */

class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String num1 = scan.nextLine();
        System.out.print("Enter 2nd number : ");
        String num2 = scan.nextLine();
        System.out.println("Enter something check for the input mismatch ");
        try {
            int forInputMismatch = scan.nextInt();
            int num = Integer.parseInt(num1);
            int num3 = Integer.parseInt(num2);
            int quotient = num/num3;
            System.out.println("The  Quotient is : "+quotient);
        }
        catch (NumberFormatException nfe){
            String  str = nfe.toString();
            System.out.println(str);
        }
        catch (InputMismatchException ime){
            String str = ime.toString();
            System.out.println(str);
        }
        catch (ArithmeticException ae){
            String str = ae.toString();
            System.out.println(str);
        }
        catch (Exception e){
            String str = e.toString();
            System.out.println(str);
        }
        finally {
            scan.close();
        }
    }
}

/* Qn - 3 Write a program to illustrate how to throw a ClassNotFoundException. */

class ClassNotFoundProgram {
    public static void main(String[] args) {
		try{
            Object obj = Class.forName(args[0]).newInstance();
        }
        catch (Exception e){
            String str = e.toString();
            System.out.println(str);
        }
	}
}

/* Qn - 4 Write a method to parse a string to an integer. 
Throw an exception if the string is not a valid number. Handle it using try-catch.*/

class ANumberOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        try {
            int num = parseThatAsInteger(scan);
            System.out.println("The given string is a number : " +num);
        }
        catch (Exception e){
			String str = e.toString();
            System.out.println(str);
        }
    }
    private static int parseThatAsInteger(Scanner scan) throws Exception{
        String num = scan.nextLine();
        return Integer.parseInt(num);
    }
}

/* Qn - 5 Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.
*/

class AboutFinally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = scan.nextInt();
        try {
            System.out.println("The division of two nums : "+(num1/num2));
        }
        catch (Exception e){
            String str = e.toString();
            System.out.println(str);
        }
        finally {
            System.out.println("Whatever execute finally block will also execute");
            scan.close();
        }
    }
}

/* Qn - 6 Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/

class ATMPin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your pin :");
        try{
            String num = scan.nextLine();
            if(num.length() != 4){
                throw new Exception("Length should be 4 ");
            }
            else{
                if(num.charAt(0)=='0'){
                    throw new Exception("Number shouldn't be starts with zero");
                }
                else{
                    for(int i = 0;i<4;i++){
                        if(!Character.isDigit(num.charAt(i))){
                            throw new Exception("The given is not a digit ");
                        }
                    }
                    System.out.println("your password has been successfully set");
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

/* Qn - 7 Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.
*/

class ExceptionPropagationProgram {
    public static void main(String[] args) {
        method1();
    }
    private static void method1(){
        try{
            method2();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    private static void method2(){
        method3();
    }
    private static void method3(){
        System.out.println(5/0);
    }
}

/*Qn - 8 Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.*/

class AuthenticationExceptionProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,String> arr = new HashMap<>();
        while (true){
            try {
                System.out.println("Welcome to Curia App!");
                System.out.print("1 to create a account \n2 to login \n3 to exit : ");
                int choice = scan.nextInt();
                scan.nextLine();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Set your email : ");
                        String email = scan.nextLine().toLowerCase();
                        System.out.print("Set your password : ");
                        String password = scan.nextLine();
                        arr.put(email, password);
                        System.out.println("Your account has been successfully created");
                    }
                    case 2 -> {
                        System.out.print("Enter your email : ");
                        String email = scan.nextLine().toLowerCase();
                        if(!arr.containsKey(email)){
                            throw new AuthenticationException("First create a id using this mail");
                        }
                        System.out.print("Enter your password : ");
                        String password = scan.nextLine();
                        if (!arr.get(email).equals(password)) {
                            throw new AuthenticationException("The password isn't correct pls try again");
                        } else {
                            System.out.println("The user has been successfully logged in");
                            System.exit(0);
                        }
                    }
                    case 3 -> System.exit(0);
                    default -> System.out.println("Enter a right choice ");
                }
            }
            catch (AuthenticationException ae){
                System.out.println(ae.getMessage());
            }
        }
    }
}

/* Qn - 9 Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.*/

class FileReadingProgram {
    public static void main(String[] args) {
        File file = new File("D:\\Assignments\\Day-1\\DayTne.java");
        try(FileReader fr = new FileReader(file)){
            int output = fr.read();
            while (output!=-1){
                System.out.print( (char) (output));
                output = fr.read();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

class InEligibleVoters extends Exception{
    public InEligibleVoters(String message){
        super(message);
    }
}

class Voters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        try {
            if (age < 18) {
                throw new InEligibleVoters("You're not Eligible to vote");
            }
            else{
                System.out.println("You're eligible for voting");
            }
        }
        catch (InEligibleVoters e){
            System.out.println(e);
        }
    }
}
