import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.PriorityQueue;	
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;

/*Qn -1 Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.*/

class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Red");
        arr.add("Orange");
        arr.add("Purple");
        System.out.println("Added three colors \n1. Red \n2. Orange \n3. Purple \nLets iterate through each one from the ArrayList");
        functionToPrint(arr);
        Scanner scan = new Scanner(System.in);
        System.out.print("Lets insert an Element at first position give an color : ");
        arr.addFirst((scan.nextLine()));
        System.out.println("------------------");
        System.out.println("Here's the updated arraylist ");
        functionToPrint(arr);
        System.out.println("------------------");
        System.out.print("There are "+arr.size()+" elements in the ArrayList \nWe are gonna retrieve a element so enter an index from that : ");
        try{
            int index = scan.nextInt();
            System.out.println("The String is "+arr.get(index));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------");
        System.out.println("Lets change the first element to Brown ");
        arr.set(0,"Brown");
        functionToPrint(arr);
        System.out.println("------------------");
        System.out.println("Lets remove the third element from the arraylist ");
        arr.remove(2);
        System.out.println("Here's the updated arraylist ");
        functionToPrint(arr);
        System.out.println("------------------");
        scan.nextLine();
        System.out.print("Enter an color to search whether it contains the color ");
        String ans = arr.contains(scan.nextLine()) ? "Yes it contains" : "No this element ain't in the arraylist";
        System.out.println(ans);
        System.out.println("------------------");
        System.out.println("Lets sort the arraylist ");
        Collections.sort(arr);
        System.out.println("Here's the updated arraylist ");
        functionToPrint(arr);
        System.out.println("------------------");
        System.out.println("Creating a new arrayList and coping the elements from that array \nHere's the new arraylist ");
        ArrayList<String> newArr = new ArrayList<>(arr);
        functionToPrint(newArr);
        System.out.println("------------------");
        System.out.println("We are gonna shuffle this arrayList right now ");
        System.out.println("Before shuffle");
        functionToPrint(newArr);
        System.out.println("------------------");
        Collections.shuffle(newArr);
        System.out.println("After shuffle");
        functionToPrint(newArr);
        System.out.println("------------------");

    }
    private static void functionToPrint(ArrayList<String> arr){
        for(String i : arr){
            System.out.println(i);
        }
    }
}

/* Qn - 2 Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.*/

class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        //a
        ls.addLast(0);
        //b
        for(int i = 1;i<10;i++){
            ls.addLast(i);
        }
        for(Integer i : ls){
            System.out.print(i+" ");
        }
        System.out.println();
        //c
        ListIterator<Integer> li = ls.listIterator(5);
        while (li.hasNext()){
            System.out.println(li.next());
        }
        //d
        Iterator<Integer> rit = ls.descendingIterator();
        while (rit.hasNext()){
            System.out.print(rit.next()+ " ");
        }
        System.out.println();
        //e
        ls.add(7,55);
        //f
        ls.addFirst(20);
        ls.addLast(100);
        //g
        ls.add(0,2000);
        //h
        int index = ls.size();
        ls.add(index-1,3000);
        //i
        ls.add(9,5000);
        //j
        System.out.println(ls.indexOf(4));
        System.out.println(ls.lastIndexOf(8));
    }
}


/*Qn - 3 Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.*/ 

class HashSetProgram {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        System.out.println("Enter 5 nums and that will be added to the set : ");
        Scanner scan = new Scanner(System.in);
        insertElement(set,scan);
        System.out.println("--------------------");
        System.out.println("Lets iterate through each element ");
        for(Integer i : set){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("The number of elements in the set is : "+set.size());
        System.out.println("--------------------");
        System.out.println("Now we are gonna empty the set ");
        set.clear();
        System.out.println("--------------------");
        System.out.println("Lets check the set is empty or not and the ans is : "+set.isEmpty());
        System.out.println("--------------------");
        System.out.println("Now lets import some numbers into the hashSet again give some random unique numbers of 5 : ");
        insertElement(set,scan);
        System.out.println("--------------------");
        System.out.println("Lets convert this set into an array");
        int[] arr = new int[set.size()];
        int i = 0;
        for(Integer j : set){
            arr[i] = j;
            i++;
        }
        System.out.println("Successfully copied as Array");
        System.out.println("--------------------");
        System.out.println("Now lets converts the set into the tree set ");
        set = new TreeSet<>(set);
        System.out.println("Successfully converted as Tree set");
        System.out.println("--------------------");
        System.out.println("Now lets change that into the ArrayList");
        ArrayList<Integer> arr1 = new ArrayList<>(set);
        System.out.println("Successfully copied that as ArrayList");
        System.out.println("--------------------");
        System.out.println("Lets create another hashset with the input of nums to check the first and the current have same elements ");
        Set<Integer> set2 = new HashSet<>();
        insertElement(set2,scan);
        if(!set2.containsAll(set)){
            System.out.println("Both are !same");
        }
        else{
            System.out.println("Both are same!");
        }
    }
    private static void insertElement(Set<Integer> set,Scanner scan){
        for(int i = 0;i<5;i++){
            set.add(scan.nextInt());
        }
    }
}

/* Qn - 4 Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.*/

class TreeSetProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> treeSet = new TreeSet<>();
        //a.
        System.out.println("Enter three colors : ");
        getElements(treeSet,scan);
        //b.
        System.out.println("Lets iterate through elements ");
        iteratorElements(treeSet);
        //c.
        Set<String> newTreeSet = new TreeSet<>();
        for(String s : treeSet){
            newTreeSet.add(s);
        }
        System.out.println("Created new TreeSet and added the old tree set elements to the new one ");
        System.out.println("--------------------");
        //d.
        String[] revOrder = new String[treeSet.size()];
        {
            int j = 0;
            for (String s : treeSet) {
                revOrder[j] = s;
                j++;
            }
        }
        for(int i = revOrder.length-1;i>=0;i--){
            System.out.println(revOrder[i]);
        }
        System.out.println("Printed in reverse order");
        System.out.println("--------------------");
        //e.
        System.out.println("Lets get the first and last elements of the treeset ");
        {
            int i = 0;
            int len = treeSet.size();
            for (String s : treeSet) {
                if (i == 0 || i == len - 1) {
                    System.out.println(s);
                }
                i++;
            }
        }
        System.out.println("--------------------");
        //f.
        Set<String> newOne = new TreeSet<>(treeSet);
        System.out.println("Cloned a tree set ");
        System.out.println("--------------------");
        //g.
        System.out.println("No of elements in the tree set : "+treeSet.size());
        System.out.println("--------------------");
        //h.
        System.out.println("We are gonna compare two sets so give three colors");
        getElements(newOne,scan);
        String ans = treeSet.equals(newOne) ? "same" : "!same";
        System.out.println("The both tree sets are "+ans);
        //i.
        System.out.println("Created a tree set contains 10 numbers with random of 1 to 13 \nPrinting nums from an tree set less than 7");
        Set<Integer> numberSet = new TreeSet<>();
        Random rand = new Random();
        for(int i = 0;i<10;i++){
            numberSet.add(rand.nextInt(12)+1);
        }
        for(Integer i : numberSet){
            if(i<7){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        System.out.println("--------------------");
        //j,k,l,m.
        System.out.println("Enter and element to find greater than or equal, less than or equal to, less than, greater than to element : (Choose between 1 to 13)");
        int num = scan.nextInt();
        if(num>=0 && num<=13){
            System.out.print("Numbers those are less than : ");
            for(int i : numberSet){
                if(i<num){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            System.out.print("Numbers those are greater than : ");
            for(int i : numberSet){
                if(i>num){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            System.out.print("Numbers those are less than or equal to : ");
            for(int i : numberSet){
                if(i<=num){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            System.out.print("Numbers those are greater than or equal to : ");
            for(int i : numberSet){
                if(i>=num){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        else{
            System.out.println("The number isn't between 1 to 13");
        }
        System.out.println("--------------------");
        //n,o.
        System.out.println("Lets retrieve remove the first and last element of the treeset ");
        {
            String[] removeStr = new String[2];
            int i = 0;
            for (String s : treeSet) {
                if (i == 0 || i == treeSet.size()-1) {
                    if(i==0){
                        System.out.println("First element "+s);
                        removeStr[0] = s;
                    }
                    else {
                        System.out.println("Last element "+s);
                        treeSet.remove(s);
                        removeStr[1] = s;
                    }
                }
                i++;
            }
            for(String s : removeStr){
                treeSet.remove(s);
            }
            System.out.println("Removed both element successfully");
        }
        System.out.println("--------------------");
        //p.
        int len = numberSet.size();
        System.out.println ("Select from this index 0 to "+(len-1)+" ");
        int index = scan.nextInt();
        if(index<len && index>=0){
            int i = 0;
            for (Integer s : numberSet) {
                if (i == index) {
                    System.out.println("The index num is : "+s);
                }
                i++;
            }
        }
        else{
            System.out.println("The num entered isn't between the indices ");
        }
        System.out.println("--------------------");
    }
    private static void getElements(Set<String> treeSet, Scanner scan){
        for(int i = 0;i<3;i++){
            treeSet.add(scan.nextLine());
        }
        System.out.println("Added Successfully ");
        System.out.println("--------------------");
    }
    private static void iteratorElements(Set<String> treeSet){
        for(String s : treeSet){
            System.out.println(s);
        }
        System.out.println("--------------------");
    }
}

/*Qn - 5. Write a Java program to, 
    1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
    2. iterate through all elements in priority queue.
    3. add all the elements of a priority queue to another priority queue.
    4. insert a given element into a priority queue.
    5. remove all the elements from a priority queue.
    6. count the number of elements in a priority queue.
    7. compare two priority queues.
    8. retrieve the first element of the priority queue.
    9. retrieve and remove the first element.
    10. convert a priority queue to an array containing all of the elements of the queue.*/

class PriorityQueueProgram {
    public static void main(String[] args) {
        PriorityQueue<String> colorPQ = new PriorityQueue<>();
        Scanner scan = new Scanner(System.in);
        //a.
        System.out.print("Enter 5 colors : ");
        for(int i = 0;i<5;i++){
            colorPQ.add(scan.nextLine());
        }
        System.out.println("5 colors added successfully");
        System.out.println("--------------------");
        //b.
        System.out.println("Lets iterate through each elements ");
        for(String s : colorPQ){
            System.out.println(s);
        }
        System.out.println("--------------------");
        //c.
        System.out.println("Lets add all the elements to a new Priority Queue ");
        PriorityQueue<String> newColorPQ = new PriorityQueue<>();
        newColorPQ.addAll(colorPQ);
        System.out.println("Added Successfully");
        System.out.println("--------------------");
        //d.
        System.out.print("Give an color to insert into the Priority queue : ");
        newColorPQ.add(scan.nextLine());
        System.out.println("Inserted successfully");
        System.out.println("--------------------");
        //e.
        System.out.print("Insert an element to remove an element : ");
        {
            String str = scan.nextLine();
            if (newColorPQ.contains(str)) {
                newColorPQ.remove(str);
                System.out.println("Removed the element ");
            }
            else{
                System.out.println("The element ain't in the Priority Queue");
            }
        }
        System.out.println("--------------------");
        //f.
        System.out.println("The number of element in the Priority Queue is : "+newColorPQ.size());
        System.out.println("--------------------");
        //g.
        System.out.println("Comparing the new Priority Queue with the old one");
        {
            ArrayList<String> colorFirst = new ArrayList<>(colorPQ);
            ArrayList<String> colorSecond = new ArrayList<>(newColorPQ);
            String str = colorFirst.equals(colorSecond) ? "Both are same" : "Both are !same ";
            System.out.println("After comparing the result is : "+str);
        }
        System.out.println("--------------------");
        //h.
        System.out.println("Gonna retrieve the first element ");
        if(!newColorPQ.isEmpty()){
            for(String s : newColorPQ){
                System.out.println("The first element is : "+s);
                break;
            }
        }
        else{
            System.out.println("The Priority Queue is empty");
        }
        System.out.println("--------------------");
        //i.
        System.out.println("Gonna get the last element and remove that one : ");
        {
            int len = newColorPQ.size();
            int index = len-1;
            int i = 0;
            for(String s : newColorPQ){
                if(i==index){
                    System.out.println("The last element is : "+s);
                    newColorPQ.remove(s);
                    System.out.println("Removed the element successfully ");
                }
                i++;
            }
        }
        System.out.println("--------------------");
        //j.
        System.out.println("Converting that into the Array ");
        String[] str = new String[newColorPQ.size()];
        {
            int i = 0;
            for (String s : newColorPQ){
                str[i] = s;
                i++;
            }
        }
        System.out.println("Added into the Array ");
    }
}

/*Qn - 6 6. Write a Java program to,
    1. associate the specified value with the specified key in a Tree Map.
    2. copy a Tree Map content to another Tree Map.
    3. search a key in a Tree Map.
    4. search a value in a Tree Map.
    5. get all keys from the given a Tree Map.
    6. delete all elements from a given Tree Map.
    7. sort keys in Tree Map by using comparator.
    8. get a key-value mapping associated with the greatest key and the least key in a map.
    9. get the first (lowest) key and the last (highest) key currently in a map.
    10. get a reverse order view of the keys contained in a given map. */

class TreeMapProgram {
    public static void main(String[] args) {
        TreeMap<Integer,Character> tm = new TreeMap<>();
        for(int i = 0;i<10;i++){
            tm.put(i+1,(char) (i+65));
        }
        //a.
        System.out.println("The treemap is created : "+tm);
        TreeMap<Integer,Character> tm1 = new TreeMap<>(tm);
        //b.
        System.out.println("New Treemap created by coping the old one : "+tm1);
        Scanner scan = new Scanner(System.in);
        //c.
        System.out.print("Enter a key value (int)  to check if it present in the tree map : ");
        try{
            int key = scan.nextInt();
            boolean isIn = tm.containsKey(key);
            String str = isIn ? "Yes the key is in the map " : "No it ain't in the map ";
            System.out.println(str);
            System.out.println();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //d.
        scan.nextLine();
        System.out.print("Enter a value to search in the map (char) : ");
        try{
            char ch = scan.nextLine().charAt(0);
            boolean isIn = tm.containsValue(ch);
            String str = isIn ? "Yes the value is in the map  " : "No it ain't in the map";
            System.out.println(str);
            System.out.println();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //e.
        System.out.println("The whole keyset is : "+tm.keySet());
        //f.
        tm.clear();
        System.out.println("Deleted the first treemap ");
        //g.
        System.out.println("We can't do the sorting in descending as an existing treemap so lets create a new one ");
        Comparator<Integer> cm = (a,b)->b-a;
        TreeMap<Integer,Character> tm2 = new TreeMap<>(cm);
        for(int i = 0;i<10;i++){
            tm2.put(i+1,(char) (i+65));
        }
        System.out.println("The descending order sorting of the new tree map is : "+tm2);
        //h.
        System.out.println("The map's first entry is "+tm1.firstEntry()+" and the last key is "+tm1.lastEntry());
        //i.
        int leastKey = tm1.firstKey();
        int higherKey = tm1.lastKey();
        System.out.println("The first key is : "+leastKey+" And the last key is : "+higherKey);
        //j.
        System.out.println("The reversed set is "+tm1.descendingKeySet());
    }

}

/*Qn - 7. Write a Java program to,
    1. associate the specified value with the specified key in a HashMap.
    2. count the number of key-value (size) mappings in a map.
    3. copy all of the mappings from the specified map to another map.
    4. remove all of the mappings from a map.
    5. check whether a map contains key-value mappings (empty) or not.
    6. get a shallow copy of a HashMap instance.
    7. test if a map contains a mapping for the specified key.
    8. test if a map contains a mapping for the specified value.
    9. create a set view of the mappings contained in a map.
    10. get the value of a specified key in a map.*/

class HashMapProgram {
    public static void main(String[] args) {
        HashMap<Integer,Character> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        //a.
        for(int i = 1;i<=10;i++){
            map.put(i,(char)(i+64));
        }
        System.out.println("Mapped 1 to 10 to the A to J ");
        System.out.println("---------------");
        //b.
        System.out.println("The count of the key value size is "+map.size());
        System.out.println("---------------");
        //c.
        HashMap<Integer, Character> newOne = new HashMap<>(map);
        System.out.println("Copied to a new HashMap");
        System.out.println("---------------");
        //d.
        newOne.clear();
        System.out.println("Removed all the mappings from the map");
        System.out.println("---------------");
        //e.
        System.out.println("Lets check is that is empty or not after removed all the mapping ");
        {
            String ans = newOne.isEmpty() ? "It's empty" : "Not empty";
            System.out.print(ans);
            System.out.println();
            System.out.println("---------------");
        }
        //f.
        HashMap<Integer,String> clonedOne = (HashMap<Integer,String>) map.clone();
        System.out.println("Created a new map and cloned the existing one");
        System.out.println("---------------");
        //g.
        System.out.print("Enter the key and check if it exists ");
        {
            int ans = scan.nextInt();
            String s = map.containsKey(ans) ? "Yes it contains " : "No it ain't";
            System.out.println(s);
            scan.nextLine();
        }
        System.out.println("---------------");
        //h.
        System.out.print("Enter the value pair that exist or not ");
        {
            Character ans = scan.nextLine().charAt(0);
            String s = map.containsValue(ans) ? "Yes it contains " : "No it ain't";
            System.out.println(s);
        }
        System.out.println("---------------");
        //i.
        Set<Map.Entry<Integer,Character>> entrySet = map.entrySet();
        System.out.println("Lets see the set view of each element ");
        for(Map.Entry<Integer,Character> k : entrySet){
            System.out.println(k.getKey() + "-> "+k.getValue());
        }
        System.out.println("---------------");
        //j.
        System.out.println("The key 5 value is : "+map.get(5));
        System.out.println("---------------");
    }
}

/*Qn - 8 */

class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

class Bank {
    public static void main(String[] args) {
        Account a1 = new Account(1524,"Malai",5241.55);
        Account a2 = new Account(1486,"Klaus",63985);
        Account a3 = new Account(65874,"Elijah",698745);
        ArrayList<Account> arr = new ArrayList<>();
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        for(Account i : arr){
            System.out.println("The User name : "+i.getAccountHolder());
            System.out.println("The Account number : "+i.getAccountNumber());
            System.out.println("The Original balance : "+i.getBalance());
            Double interest = Double.valueOf(5.0/100);
            Double oldBalance = i.getBalance();
            double newInterest = interest;
            double newBalance = oldBalance.doubleValue();
            double finalAmount = oldBalance +(newInterest * newBalance);
            System.out.println("The new Balance is : "+finalAmount);
            System.out.println();
        }
    }
}
