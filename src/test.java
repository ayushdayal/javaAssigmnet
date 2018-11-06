/*
import javax.swing.*;
import java.io.*;

public class test {

    public static void main(String[] args) {
        int s= 0;
        try {
            FileReader reader= new FileReader("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\q14\\ayush.txt");
           while (s!=-1){
            s = reader.read();
               System.out.println(s);}
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer= new FileWriter("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\q14\\ayush.txt");
            writer.write("asdf");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file= new File("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\q14\\ayush.txt");
        FileInputStream  inputStream= new FileInputStream(file);
        InputStreamReader reader= new InputStreamReader(inputStream);
        reader.read();
        inputStream.read();
        BufferedReader bufferedReader= new BufferedReader(reader);
        bufferedReader.readLine();

    }
}
*/
