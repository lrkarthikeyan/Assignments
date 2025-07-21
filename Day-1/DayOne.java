import java.util.Scanner;
//Qn 1
class VariousScopes{
	static String clgName = "XYZ College";
	int instanceVariable = 6;
	public static void main(String[] args){
		char localVariable = 'A';
		System.out.println("This is a Local Variable "+localVariable);
		System.out.println("This is a Static Variable "+VariousScopes.clgName);
		VariousScopes obj1 = new VariousScopes();
		System.out.println("This is a Instance Variable "+obj1.instanceVariable);
		{
			int blockVari = 10;
			System.out.println("This is a Block Variable "+blockVari);
		}
		final int age = 22;
		System.out.println("This ia a Final Variable "+age);
	}
}

//Qn 2
class Datatypes{
	public static void main(String[] args){
		byte byteVari = 127;
		short shortVari = 30_000;
		int intVari = 20_00_000;
		long longVari = 2_00_00_00_00_00_000l;
		float floatVari = 1453.241358f;
		double doubleVari = 54126.2156748654;
		char charVari = 'A';
		String stringVari = "Karthikeya";
		System.out.println("This is a Byte Variable "+byteVari);
		System.out.println("This is a Short Variable "+shortVari);
		System.out.println("This is a Integer Variable "+intVari);
		System.out.println("This is a Long Variable "+longVari);
		System.out.println("This is a Float Variable "+floatVari);
		System.out.println("This is a Double Variable "+doubleVari);
		System.out.println("This is a Character Variable "+charVari);
		System.out.println("This is a String Variable "+stringVari);
	}
}

//Qn 3
class FindMaximum{
	public static void main(String[] args){
		System.out.println("Program to Find Greatest of Two numbers");
		Scanner scanVari = new Scanner(System.in);
		System.out.print("Enter the First Number ");
		int num1 = scanVari.nextInt();
		System.out.print("Enter the Second Number ");
		int num2 = scanVari.nextInt();
		if(num1>num2){
			System.out.println("First Number is the Greatest one");
		}
		else{
			System.out.println("Second Number is the Greatest one");
		}
		scanVari.close();
	}
}

//Qn 4
class CompareWithoutComparators{
	public static void main(String[] args){
		
		Scanner scanVari = new Scanner(System.in);
		System.out.println("Program to Check Two num are same without using Comparators");
		System.out.print("Enter the First Number ");
		int num1 = scanVari.nextInt();
		System.out.print("Enter the Second Number ");
		int num2 = scanVari.nextInt();
		int check = num1^num2;
		try{
			int num = 1;
			num/=check;
			System.out.println("Number not equal");
		}
		catch(ArithmeticException e){
			System.out.println("Number is equal");
		}
		scanVari.close();
		
	}
}

//Qn 5

class ExecutionOrder{
	{
		System.out.println("This is executing initializer block");
	}
	static{
		System.out.println("Static block will run first even before the main method");
	}
	public static void main(String[] args){
		ExecutionOrder obj1 = new ExecutionOrder();
	}
}

//Qn 6

class ExplicitCasting{
	public static void main(String[] args){
		byte num1 = 127;
		int castedVari = (byte)num1;
		System.out.println("Explicitly type casted "+castedVari);
	}
}

//Qn 7

class PowerOfTwo{
	public static void main(String[] args){
		System.out.println("Program to check the number is power of 2 or not");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number you wanna check ");
		long number = scan.nextLong();
		
		long checkNumber = 2l;
		boolean yesOrNot = false;
		while(checkNumber<=number){
			if(checkNumber==number){
				yesOrNot = true;
			}
			checkNumber*=2;
		}
		String ans = yesOrNot ? "Yes it is power of 2" : "No it isn't power of 2";
		System.out.println(ans);
	}
}

//Qn 8

class FirstSet {
    public static void main(String[] args) {
        System.out.print("Program to find first set of bit of a number");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
		int count = 1;
        int num = scan.nextInt();
        if (num == 0) {
            System.out.println("No set bit is there");
        } else {
            int firstSetBit = num & -num;
            while(firstSetBit>1){
				firstSetBit = firstSetBit / 2;
                count++;
			}
			System.out.println("First set bit position: " + count);
        }
        scan.close();
    }
}

//Qn 9

class Employee{
	int id;
	String name;
	String department;
	int salary;
	Employee(){};
	Employee(int id,String name,String department, int salary){
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public static void main(String[] args){
		System.out.println("Program to print the Details of the Employee for two Employees\n");
		Scanner scan = new Scanner(System.in);
		Employee emp1 = new Employee(001,"Damon","MBBS",1_00_00_000);
		Employee emp2 = new Employee(002,"Stefan","Arts",2_00_00_00);
		System.out.println("First Employee Id Details : \nID: "+emp1.id+"\nName:"+emp1.name+"\nDepartment:"+emp1.department+"\nSalary:"+emp1.salary+"\n");
		System.out.println("Second Employee Id Details : \nID: "+emp2.id+"\nName:"+emp2.name+"\nDepartment:"+emp2.department+"\nSalary:"+emp2.salary+"\n");
	}
}

//Qn 10

class InstanceOrNot{
	public static void main(String[] args){
		System.out.println("Program to check whether a object is Instance of a Class");
		InstanceOrNot obj1 = new InstanceOrNot();
		System.out.println(obj1 instanceof InstanceOrNot);
	}
}
