import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


/* Qn - 1 Write a Java program to read the contents of a text file and display it on the console. */

class ReadAFile {

    public static void main(String[] args) {
        File file = new File("D:\\NewFolder\\java\\DayII.java");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String wholeLine = br.readLine();
            while(wholeLine!=null){
                System.out.println(wholeLine);
                wholeLine = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

/* Qn - 2 Write a Menu driven Java program 
	a) to read content from the user and write it into another file and 
	b) from the file to another file 
	c) to modify the content of a file
	d) to search for a particular word in a file and display how many times it appears 
	e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.*/

class ToWorkWithFiles {
    public static void main(String[] args) {
        File file = new File("D:\\NewFolder\\New folder\\DayII.java");
        File copy = new File("D:\\NewFolder\\newCreatedTxt.txt");
        File file1 = new File("D:\\NewFolder\\FailingGrades.java");
        Scanner scan = new Scanner(System.in);
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(copy);
            BufferedWriter bw = new BufferedWriter(fw);
            //a.
            System.out.print("Enter the statements you wanna add ");
            String  str = scan.nextLine();
            bw.write(str);
            bw.newLine();
            bw.newLine();
            //b.
            String wholeLine = br.readLine();
            //d. lets check from the location file how many time the if occured
            int count = 0;
            while(wholeLine!=null){
                String[] words = wholeLine.trim().split("\\s+");
                for(String word : words){
                    if(word.startsWith("else")){
                        count++;
                    }
                }
                bw.write(wholeLine);
                bw.newLine();
                wholeLine = br.readLine();
            }
            System.out.println("The else occured "+count+ " this much time");
            //c.
            fr = new FileReader(file1);
            br = new BufferedReader(fr);
            System.out.println("Modifying by adding extra contents ");
            String file2Words = br.readLine();
            while (file2Words!=null){
                bw.write(file2Words);
                bw.newLine();
                file2Words = br.readLine();
            }
            //e.
            file = new File("D:\\NewFolder\\New folder\\products.txt");
            file1 = new File("D:\\NewFolder\\New folder\\products.csv");
            fr = new FileReader(file);
            fw = new FileWriter(file1);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            wholeLine = br.readLine();
            while (wholeLine!=null){
                String[] words = wholeLine.split("-");
                for(String s : words){
                    s = s.replace(",","");
                    bw.write(s);
                    bw.write(',');
                }
                bw.newLine();
                wholeLine = br.readLine();
            }
            System.out.println("Completed");
            bw.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}


/* Qn - 3 Write a Java program that reads a file and prints the number of lines, words, and characters. */

class HowManyLines {
    public static void main(String[] args) {
        File file = new File("D:\\NewFolder\\java\\java.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String wholeLine = br.readLine();
            int noOfLines = 0;
            int noOfWords = 0;
            int noOfCharacters = 0;
            while(wholeLine!=null){
                String[] noOfWordsArray = wholeLine.split("\\s");
                noOfWords +=noOfWordsArray.length;
                String[] noOfCharactersArray = wholeLine.split("[^a-zA-Z]+");
                for(String s : noOfCharactersArray){
                    noOfCharacters+=s.length();
                }
                wholeLine = br.readLine();
                noOfLines++;
            }
            System.out.println("No. of line : "+noOfLines);
            System.out.println("No. of words : "+noOfWords);
            System.out.println("No. of characters : "+noOfCharacters);
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/* Qn - 4 Write a Java program to append a text read from the user to an existing file without overwriting the original content. */

class AppendFromUser {
    public static void main(String[] args) {
        File file = new File("D:\\NewFolder\\java\\mava.txt");
        try {
            FileWriter fw = new FileWriter(file,true);
            fw.write("Hello from L.A");
            fw.flush();
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

/* Qn - 5 Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and efficiently. */

class Product implements Serializable {

    int productId;
    String name;
    double price;
    int quantity;

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(int productId,String name,double price, int quantity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display(){
        System.out.println("The name : "+this.name);
        System.out.println("The product id : "+this.productId);
        System.out.println("The price : "+this.price);
        System.out.println("The quantity : "+this.quantity);
    }

}

class SerializableClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int n = 0;
        while (n<2){
            System.out.print("Enter the product name : ");
            String name = scan.nextLine();
            System.out.print("Enter the product ID : ");
            int id = scan.nextInt();
            System.out.print("Enter the price : ");
            int price = scan.nextInt();
            System.out.print("Enter the quantity : ");
            int quantity = scan.nextInt();
            arr.add(new Product(id,name,price,quantity));
            scan.nextLine();
            n++;
        }
        serialize(arr);
        deserialize();
        deleteProduct(scan);
        updateProduct(scan);
        searchId(scan);
    }
    private static void serialize(ArrayList<Product> arr){
        try{
            FileOutputStream file = new FileOutputStream("D:\\NewFolder\\newCreatedTxt.txt");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            for(Product p : arr){
                oos.writeObject(p);
                System.out.println("Serialization completed\nProduct added successfully");
            }
            oos.close();
            file.close();
            //a.
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
    private static void deserialize(){
        try {
            FileInputStream fis = new FileInputStream("D:\\NewFolder\\newCreatedTxt.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    Product p1 = (Product) ois.readObject();
                    p1.display();
                }
                catch (EOFException e){
                    ois.close();
                    fis.close();
                    System.out.println("Deserialized successfully");
                    break;
                }
            }
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    private static void searchId(Scanner scan){
        System.out.println("Enter the id to check if it exists ");
        int id = scan.nextInt();
        boolean exist = true;
        try {
            FileInputStream fis = new FileInputStream("D:\\NewFolder\\newCreatedTxt.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    Product p1 = (Product) ois.readObject();
                    if(p1.getProductId()==id){
                        System.out.println("Its in the list");
                        p1.display();
                        exist = false;
                    }
                }
                catch (EOFException e){
                    if(exist){
                        System.out.println("The id isn't in the list ");
                    }
                    ois.close();
                    fis.close();
                    break;
                }
            }
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private static void updateProduct(Scanner scan){
		scan.nextLine();
        ArrayList<Product> arr = new ArrayList<>();
        System.out.print("whats the new product name ");
        String newPro = scan.nextLine();
        System.out.println("whats the old product name ");
        String str = scan.nextLine();
        boolean inThere = true;
        try {
            FileInputStream fis = new FileInputStream("D:\\NewFolder\\newCreatedTxt.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    Product p1 = (Product) ois.readObject();
                    if(p1.getName().equals(str)){
                        p1.setName(newPro);
                        p1.display();
                        System.out.println("Product name changed successfully and will be updated");
                        inThere = false;
                    }
                    arr.add(p1);
                }
                catch (EOFException e){
                    if(inThere){
                        System.out.println("The product isn't in the list ");
                    }
                    else{
                        serialize(arr);
                    }
                    ois.close();
                    fis.close();
                    break;
                }
            }
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private static void deleteProduct(Scanner scan){
        ArrayList<Product> arr = new ArrayList<>();
        System.out.println("Enter the product's id so that we can delete the product ");
        int id = scan.nextInt();
        boolean exist = true;
        try {
            FileInputStream fis = new FileInputStream("D:\\NewFolder\\newCreatedTxt.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    Product p1 = (Product) ois.readObject();
                    if(p1.getProductId()==id){
                        System.out.println("Its deleted successfully ");
                        p1.display();
                        exist = false;
                    }
                    else{
                        arr.add(p1);
                    }
                }
                catch (EOFException e){
                    if(exist){
                        System.out.println("The id isn't in the list ");
                    }
                    ois.close();
                    fis.close();
                    break;
                }
            }
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
