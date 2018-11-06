/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;
import q2.date;
import q2.employee;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee [] arr = new employee[3];
        
            arr[0]= new employee(1,"p1",2,12,1970);
            arr[1]= new employee(2,"p2",10,4,1973);
            arr[2]= new employee(3,"p3",23,8,1964);
            
            for(int i=0;i<3;i++)
                arr[i].print_details();
    }
    
}
