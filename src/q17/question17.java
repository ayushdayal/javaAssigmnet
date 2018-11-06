package q17;

import java.io.*;
import java.util.Scanner;

public class question17 {
    public static void main(String[] args) throws BlankException {
        Scanner intScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter rollno , age name , addresss");
        Student student = new Student();

        String temp = scanner.nextLine();
        if (temp.isEmpty())
            throw new BlankException();
        else {
            int c;
            for (c = 0; c != temp.length() - 1; c++)
                if (Character.isDigit(temp.charAt(c)))
                    throw new NumberFormatException();
        }
        File file = new File("ayush.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("you wanna write data");
        try {
            int ch = intScanner.nextInt();
            if (ch == 1){

                ObjectOutputStream stream= new ObjectOutputStream(new FileOutputStream(file));
                stream.writeObject(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class  Student implements Serializable {
    int age, rollno ;
    String name, address;

}
class BlankException extends Exception{
    BlankException(){
        System.out.println("blank object found");
    }
}
