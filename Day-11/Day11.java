import java.io.*;

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
