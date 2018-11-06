package q17;

import java.io.File;
import java.util.Arrays;

public class question18 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\");
        if (!file.isDirectory())
            System.out.println("file not a directory");
        else
            System.out.println(Arrays.toString(file.list()));

    }
}
