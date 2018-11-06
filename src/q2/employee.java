/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;
import q2.date.*;

public class employee {
    int id;
    String name;
    date d=new date();
    employee(int ID,String nm,int dd,int mm,int yy)
    {
        this.d.setdate(dd, mm, yy);
        id=ID;
        name=nm;
        
    }
    void print_details()
    {
        System.out.print("ID : "+id+" NAME: "+name+" DATE OF BIRTH ");
        d.printdate();
        System.out.println();
    }
}
