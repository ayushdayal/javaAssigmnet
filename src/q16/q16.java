package q16;

import java.io.*;
import java.util.Scanner;

public class q16 {
  static   FileReader reader;
  static FileWriter writer;

    public static void main(String[] args) {
        File inputfile= new File("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\input.txt");
        try {
            reader = new FileReader(inputfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
            System.exit(0);
        }
        try {
            File outputFile=new File("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\output.txt");
            if (!outputFile.exists()) {
                try {
                    outputFile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("file not found and cant create");
                }
            }
            writer=new FileWriter(outputFile);
            System.out.println("do you want to override or append answer in 1 or 2");
            Scanner scanner= new Scanner(System.in);
            int answer=scanner.nextInt();
            if (answer==1){

                int in= reader.read();
                System.out.println("in 1wss writing"+in);

                while (in!=-1)
                {
                    System.out.println("in 1 writing"+in);
                    writer.write(in);
                    in=reader.read();
                }
            }
            else {
                System.out.println("in 1 ss writing");

                int in= reader.read();
                while (in!=-1)
                {
                    System.out.println("in 2 appending"+in);
                    writer.append(String.valueOf(in));
                    in=reader.read();
                }
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
