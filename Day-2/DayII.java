import java.util.Scanner;

//Qn 1

class MinimumThreeNumber{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Program to find Minimum between three numbers ");
		System.out.print("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = scan.nextInt();
		System.out.print("Enter the three number : ");
		int num3 = scan.nextInt();
		if(num1<num2 && num1<num3){
			System.out.print("Minimum Number is  "+num1);
		}
		else if(num2<num3){
			System.out.print("Minimum Number is "+num2);
		}
		else {
			System.out.print("Minimum Number is "+num3);
		}
		scan.close();
	}
}

// Qn 2



// Qn 3

class NumberTriangle {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int printingNum = 1;
        int lineCount = 1;
        int lineEnd = 1;
        boolean downside = false;
        int forUpSpace = 1;
        int endForSpace = num;
        int forDownSpace = 1;
        while (true){
            if(downside){
                if(lineEnd==lineCount){
                    if(lineEnd<=1){
                        break;
                    }
                    System.out.println();
                    forDownSpace = 1;
                    endForSpace++;
                    while (forDownSpace<=endForSpace){
                        System.out.print(" ");
                        forDownSpace++;
                    }
                    System.out.print(printingNum+" ");
                    lineEnd--;
                    lineCount = 1;
                }
                else{
                    System.out.print(printingNum+" ");
                    lineCount++;
                }
            }
            else{
                if(num==lineCount){
                    System.out.print(printingNum+" ");
                    downside = true;
                    lineCount = 0;
                    System.out.println();
                    lineEnd = num-1;
                    endForSpace++;
                    printingNum++;
                    while (forDownSpace<=endForSpace){
                        System.out.print(" ");
                        forDownSpace++;
                    }
                    continue;
                }
                if(lineEnd==lineCount){
                    while (forUpSpace<=endForSpace){
                        System.out.print(" ");
                        forUpSpace++;
                    }
                    forUpSpace = 1;
                    endForSpace--;
                    System.out.print(printingNum+" ");
                    lineEnd++;
                    lineCount = 1;
                    System.out.println();
                    while (forUpSpace<=endForSpace){
                        System.out.print(" ");
                        forUpSpace++;
                    }
                }
                else{
                    System.out.print(printingNum+" ");
                    lineCount++;
                }
            }
            printingNum++;
        }
    }
}

//Qn 4a

class PascalTriangle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number rows you want ");
		int row = scan.nextInt();
        int tempRow = row;
        int i = 0;
        do {
            int temp1 = i;
            while (row-temp1-1>0){
                System.out.print(" ");
                temp1++;
            }
            int j = 0;
            int num = 1;
            while (j<=i){
                System.out.print(num+" ");
                num = num * (i-j)/(j+1);
                j++;
            }
            i++;
            tempRow--;
            System.out.println();
        }while (tempRow>0);
		scan.close();
    }
}

//Qn 4b

class PrintInFourMatrix {
    public static void main(String[] args) {
        String str = "ZOHOCORPORATIONS";
        int len = str.length();
        int i = 0;
        do {
            int temp = 1;
            while (temp<=4){
                System.out.print(str.charAt(i));
                len--;
                i++;
                temp++;
            }
            System.out.println();
        }while (len>0);
    }
}


//Qn 5

class FindSumOfEvenNumbers {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to find even sums");
        int num = scan.nextInt();
        System.out.print(findTheSumInEvenOnly(num));
		scan.close();
    }
    private static int findTheSumInEvenOnly(int n){
        int ans = 0;
        for(int i = 1;i<=n;i++){
            if(i%2!=0){
                continue;
            }
            else {
                ans+=i;
            }
        }
        return ans;
    }
}

//Qn 6

class ConvertToBinary{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to convert that to binary");
		int num = scan.nextInt();
		System.out.println(convertBinary(num));
	}
	private static int convertBinary(int num){
		String res = "";
		while(num>0){
			res = (num%2) + res;
			num/=2;
		}
		return Integer.parseInt(res);
	}
}

//Qn 7

class FindGrade{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the subject mark between 100: ");
		int sub1 = scan.nextInt();
		//using if
		System.out.println("Using If case");
		if(sub1>=85){
			System.out.print("A\n");
			sub1 = 85;
		}
		else if(sub1>=75){
			System.out.print("B\n");
			sub1 = 75;
		}
		else if(sub1>=50){
			System.out.print("C\n");
			sub1 = 50;
		}
		else{
			System.out.print("Fail\n");
			sub1 = 0;
		}
		System.out.println("------");
		//using switch
		System.out.println("Using Switch case");
		switch(sub1){
			case 85 -> 	System.out.print("A");
			case 75 ->  System.out.print("B");
			case 50 ->  System.out.print("C");
			case 0 ->   System.out.print("Fail");
		}
	}
}


