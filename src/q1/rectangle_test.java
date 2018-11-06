/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;
import java.util.Scanner;
import q1.rectangle;

public class rectangle_test {

    public static void main(String[] args) {
     	rectangle[] abc = new rectangle[5];

//		abc[0] = new rectangle(1,5);
//		abc[1] = new rectangle();
//		abc[1].setValue(51,15);
//                abc[1].print();
    Scanner sc = new Scanner(System.in);
    
        for(int i=0;i<5;i++)
        {
            int l = sc.nextInt();
            int b= sc.nextInt();
            abc[i] = new rectangle(l,b);
        }
        for(int i=0;i<5;i++)
        {
            abc[i].print();
        }
	}
}
    

