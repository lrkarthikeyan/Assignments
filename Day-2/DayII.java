import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


//Part - 1

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

// Qn 2a 

class PatternForOne {
    public static void main(String[] args) {
        int rowSize = 5;
        int colSize = 5;
        for(int i = 0;i<rowSize;i++){
            for(int j = 0;j<colSize;j++){
                if(j==i || j ==colSize-1-i){
                    System.out.print("1");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// Qn 2b

class PatternR {
    public static void main(String[] args) {
        int len = 5;
        char alphabet ='R';
        for(int i = 0;i<len;i++){
            for(int j = 0;j<len;j++){
                if(i==0 || i ==2){
                    if(j!=len-1){
                        System.out.print(alphabet+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                if(i==1 || i==len-1){
                    if(j==0 || j==len-2){
                        System.out.print(alphabet+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                if(i==3){
                    if(j== 0 || j==len-3){
                        System.out.print(alphabet+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}




// Qn 3a

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

//Qn 3b

class DiamondTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the rows you want to get the Diamond triangle : ");
        int row = scan.nextInt();
        int i = 1;
        while (i<=row){
            int tempI = 0;
            while (tempI<=row-i){
                System.out.print(" ");
                tempI++;
            }
            int j = 1;
            while (j<=i){
                System.out.print("w ");
                j++;
            }
            i++;
            System.out.println();
        }
        int downSideSize = i-2;
        int forSpace = i-2;
        int j = 1;
        while (downSideSize>0){
            int temp = forSpace;
            while (temp<i){
                System.out.print(" ");
                temp++;
            }
            int tempJ = j;
            while (tempJ<row){
                System.out.print("w ");
                tempJ++;
            }
            j++;
            forSpace--;
            downSideSize--;
            System.out.println();
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

// Part - 2 Arrays

//Qn 1

class GetAnOddAns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers and find out the odd of the sums ");
        int ans = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
            if(arr[i]%2!=0){
                ans+=arr[i];
            }
        }
        System.out.println(ans);
    }
}


//Qn 2

class OnlyPrime {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers and find which are the prime ones :");
        int len = arr.length;
        for(int i =0;i<len;i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0;i<len;i++){
            int check = arr[i];
            if(check==1){
                System.out.println(1+" This number is a prime");
                continue;
            }
            int num = 2;
            int sqrtNumOfCheck = (int)Math.sqrt(check);
            boolean primeOrNot = true;
            while (num<=sqrtNumOfCheck){
                if(check%num==0){
                    primeOrNot = false;
                    break;
                }
                num++;
            }
            if(primeOrNot){
                System.out.println(check+" This number is a prime");
            }
            else{
                System.out.println(check+" This ain't a prime");
            }
        }
    }
}

//Qn 3 

class Fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[30];
        int len = arr.length;
        arr[0] = 0;
        arr[1] = 1;
        int firstNum = 0;
        int secondNum =  1;
        int count = 2;
        while (count< len){
            int thirdNum = firstNum+secondNum;
            arr[count] = thirdNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            count++;
        }
        for(int i = 0;i<len;i++){
            if(i==len-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+", ");
            }
        }
    }
}

//Qn 4

class PrintOnlySingleDigit {
    public static void main(String[] args) {
        int len = 99;
        int[] arr = new int[len];
        for(int i = 0;i<len;i++){
            arr[i] = i+1;
        }
        print(arr,len);
    }
    private static void print(int[] x, int n){
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        for(int i = 0;i<n;i++){
            if(x[i]<10){
                singleDigitSum += x[i];
            }
            else{
                doubleDigitSum += x[i];
            }
        }
        System.out.println("The Single Digit sum is "+singleDigitSum);
        System.out.println("The Double Digit sum is "+doubleDigitSum);
    }
}

//Qn 5

class CheckTwoArraysAreIdentical {
    public static void main(String[] args) {
        char[] firstArr = {'m','n','o','p'};
        char[] secondArr = {'m','n','o','p'};
        System.out.println(identicalOrNot(firstArr,secondArr));
    }
    private static String identicalOrNot(char[] firstArr,char[] secondArr){
        int len = firstArr.length;
        for(int i = 0;i<len;i++){
            if(firstArr[i]!=secondArr[i]){
                return "This ain't a Identical";
            }
        }
        return "This is Identical";
    }
}

//Qn 6

class BinarySearchTechnique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2020};
        int len = arr.length+1;
        int[] graduatingYear = new int[len];
        for(int i = 0;i<arr.length;i++){
            graduatingYear[i] = arr[i];
        }
        System.out.print("Enter the year of your Graduation : ");
        graduatingYear[len-1] = scan.nextInt();
        int check = graduatingYear[len-1];
        int start = 0;
        int end = graduatingYear.length;
        while (start<end){
            int middle = start + (end-start)/2;
            if(graduatingYear[middle]==check){
                System.out.println("Yes it is there");
                return;
            }
            else if(graduatingYear[middle]<check){
                start = start+1;
            }
            else{
                end = end -1;
            }
        }
    }
}

//Qns 7

class DescendingOrderSelectionSort {
    public static void main(String[] args) {
        int len = 10;
        int[] arr = new int[len];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 peoples weight");
        for(int i = 0;i<len;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The Original Array"+Arrays.toString(arr));
        int position = 0;
        for(int i = 0;i<len;i++){
            int max = arr[i];
            int j = i;
            position = j;
            for(;j<len;j++){
                if(max<arr[j]){
                    position = j;
                    max = arr[j];
                }
            }
            if(i==position){
                continue;
            }
            arr[i] = arr[i]^arr[position];
            arr[position] = arr[i]^arr[position];
            arr[i] = arr[i]^arr[position];
        }
        System.out.println("After descending their weights"+Arrays.toString(arr));
    }
}


//Qns 8

class CountAgeOfTenPeoples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 peoples age : ");
        int count = 10;
        int[] arrAge = new int[count];
        for(int i = 0;i<count;i++){
            arrAge[i] = scan.nextInt();
        }
        int below18 = 0;
        int inBetween = 0;
        int above60 = 0;
        for(int i = 0 ;i<count;i++){
            if(arrAge[i]<18){
                below18++;
            }
            else if(arrAge[i]>=18 && arrAge[i]<=60){
                inBetween++;
            }
            else if(arrAge[i]>60){
                above60++;
            }
        }
        System.out.print("Age below 18 : "+below18+"\nAge gap from 18 to 60 : "+inBetween+"\nAbove 60 : "+above60);
    }
}

//Qn 9 

class GettingDetailsOfStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentStrength = 10;
        int[] rollNo = new int[studentStrength];
        int[] sub1Marks = new int[studentStrength];
        int[] sub2Marks = new int[studentStrength];
        int[] sub3Marks = new int[studentStrength];
        String[] counts = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th"};
        System.out.println("Enter 10 students Details");
        for(int i = 0;i<studentStrength;i++){
            System.out.print("Enter the roll number for "+counts[i]+" student : ");
            rollNo[i] = scan.nextInt();
            System.out.print("Enter the first subject marks : ");
            sub1Marks[i] = scan.nextInt();
            System.out.print("Enter the second subject marks : ");
            sub2Marks[i] = scan.nextInt();
            System.out.print("Enter the third subject marks : ");
            sub3Marks[i] = scan.nextInt();
        }
        for(int i = 0;i<studentStrength;i++){
            int avgMarks = 0;
            avgMarks = (sub1Marks[i]+sub2Marks[i]+sub3Marks[i])/3;
            System.out.print("The avg mark of the "+counts[i]+" person is : "+avgMarks);
            System.out.println();
        }
    }
}

// Qn 10

class TwoDimensionalArrays {
    public static void main(String[] args) {
        System.out.print("Enter the row and column size of the Array");
        Scanner scan = new Scanner(System.in);
        int rowSize = scan.nextInt();
        int colSize = scan.nextInt();
        int[][] arr = new int[rowSize][colSize];
        //to get
        for(int i = 0;i<rowSize;i++){
            for(int j =0;j<colSize;j++){
                System.out.print("Enter row["+i+"] col["+j+"] : ");
                arr[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        //to display
        System.out.println("The total array is "+Arrays.deepToString(arr));
        System.out.println();
        int totalSum = 0;
        for(int i = 0;i<rowSize;i++){
            for(int j = 0;j<colSize;j++){
                totalSum += arr[i][j];
            }
        }
        System.out.println("The total sum is "+totalSum);
        System.out.println();
        //to sum row
        for(int i = 0;i<rowSize;i++){
            int rowSum = 0;
            for(int j = 0;j<colSize;j++){
                rowSum += arr[i][j];
            }
            System.out.println(i+" row sum = "+rowSum);
        }
        System.out.println();
        //to sum col
        for(int i = 0;i<colSize;i++){
            int colSum = 0;
            for(int j = 0;j<rowSize;j++){
                colSum+=arr[j][i];
            }
            System.out.println(i+" col sum = "+colSum);
        }
        System.out.println();
        int[][] transposeArr = new int[colSize][rowSize];
        for(int i = 0;i<colSize;i++){
            for(int j = 0;j<rowSize;j++){
                transposeArr[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of the array is "+Arrays.deepToString(transposeArr));
    }
}

// Part - 3 

//Qns 1

class SumAsString {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int ans = num1+num2;
        String res = "";
        while (ans>0){
            res = (ans%2) + res;
            ans/=2;
        }
        System.out.println(res);
    }
}

// Qn 2

class FindingAlphabets {
    public static void main(String[] args) {
        String str = "ZY";
        int j = 1;
        HashMap<Character,Integer> set = new HashMap<>();
        for(int i = 65;i<=90;i++){
            set.put((char)i,j);
            j++;
        }
        int len = str.length();
        long ans = 26;
        if(len==1){
            System.out.println(set.get(str.charAt(0)));
        }
        else{
            for(int i = 0;i<len;i++){
                if(i==len-1){
                    ans = ans + set.get(str.charAt(i));
                }
                else{
                    ans = ans * set.get(str.charAt(i));
                }
            }
            System.out.println(ans);
        }
    }
}

//Qn 3

class OnlyReverseVowels {
    public static void main(String[] args) {
        String str = "leetcode";
        int count = 0;
        int len = str.length();
        for(int i = 0;i<len;i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        char[] vowels = new char[count];
        int j = 0;
        for(int i = 0;i<len;i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowels[j] = str.charAt(i);
                j++;
            }
        }
        StringBuilder strB = new StringBuilder();
        count--;
        for(int i = 0;i<len;i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                strB.append(vowels[count]);
                count--;
            }
            else{
                strB.append(str.charAt(i));
            }
        }
        System.out.println(strB);
    }
}

// Qn 4 

class AddedChar {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String s = "abcd";
        String t = "abcde";
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        for(char ch : t.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }
        for(char ch : set){
            System.out.println(ch);
        }
    }
}

// Qn 5

class Subsequence {
	public static void main(String[] args){
		String s = "axc";
		String t = "ahbgdc";
		System.out.println(isSubsequenceOrNot(s,t));
	}
    private static boolean isSubsequenceOrNot(String s, String t) {
        int sLen =s.length();
        StringBuilder res = new StringBuilder();
        int len = t.length();
        int tLeft = 0;
        int sLeft = 0;
        while (sLeft<sLen && tLeft<len) {
            if(s.charAt(sLeft)==t.charAt(tLeft)){
                res.append(s.charAt(sLeft));
                sLeft++;
            }
            tLeft++;
        }
        return res.toString().equals(s);
    }
}

//Qn 6

class NumberOfSegments {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        int len = s.length();
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        for(;i<len;i++){
            if(Character.isAlphabetic(s.charAt(i))){
                break;
            }
        }
        int j = len-1;
        for(;j>=0;j--){
            if(Character.isAlphabetic(s.charAt(j))){
                break;
            }
        }
        if(i<=len-1 && j>=0){
            for(;i<=j;i++){
                if(i==j || Character.isWhitespace(s.charAt(i))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

//Qn 8 

class Word{
	public static void main(String[] args){
		String s = "FlaG";
		int len = s.length();
        boolean checkForSmall = false;
        boolean checkForCapital = false;
		boolean ans = true;
        for(int i = 0;i<len;i++){
            if(i==0 && s.charAt(i) >=97 && s.charAt(i) <= 122){
                checkForSmall = true;
            }
            else if(i==0 && s.charAt(i) >=65 && s.charAt(i) <=90){
                i++;
                if(i!=len && s.charAt(i) >=65 && s.charAt(i) <=90){
                    checkForCapital = true;
                }
                else{
                    checkForSmall = true;
                }
                i--;
            }
            else if(checkForSmall){
                if(s.charAt(i) < 97 || s.charAt(i) > 122){
                    System.out.println("False");
					ans = false;
					break;
                }
            }
            else if(checkForCapital){
                if(s.charAt(i) < 65 || s.charAt(i) > 90){
                    System.out.println("False");
					ans = false;
					break;
                }
            }
		}
		if(ans){
			System.out.println("True");
		}
	}
}