package q14;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\q14\\ayush.txt");


        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextShort())
                System.out.println(scanner.next());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
