package q17;

import java.io.*;
import java.util.Scanner;

 class  CDR implements Serializable {
   int a_number,b_number,duration,charge;

   CDR(){}
    CDR(int w){
       Scanner scanner = new Scanner(System.in);
       a_number=scanner.nextInt();
       b_number=scanner.nextInt();
       duration=scanner.nextInt();
       charge=duration;
        File file= new File("calculatedCharge.txt");
        try { file.createNewFile();
        FileWriter writer= new FileWriter(file);

            writer.write(String.valueOf(charge));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


 }
public  class  gg{
    public static void main(String[] args) {
        try {

            File d=new File("rated_cdr.txt");
            d.createNewFile();
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream(d));
            objectOutputStream.writeObject(new CDR(2));
            objectOutputStream.close();
            ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream(d));

            CDR cdr=new CDR();
            cdr=(CDR)objectInputStream.readObject();
           System.out.println( cdr.charge);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}