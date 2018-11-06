/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

class complex_no {
    
double real;
double imaginary;
complex_no(double a,double b)
{
    real=a;
    imaginary=b;
}
}
public class complex {


    static void addition(complex_no a,complex_no b)
    {
        complex_no c = new complex_no(0,0);
        c.real = a.real+b.real;
        c.imaginary=a.imaginary+b.imaginary;
        System.out.println("Sum of "+a.real+"+"+a.imaginary+"i"+" & "+b.real+" +"+b.imaginary+"i"+" is : "+c.real+"+"+c.imaginary+"i");
    }
    static void subtraction(complex_no a,complex_no b)
    {
        complex_no c = new complex_no(0,0);
        c.real = a.real-b.real;
        c.imaginary=a.imaginary-b.imaginary;
        System.out.println("Difference of "+a.real+"+"+a.imaginary+"i"+" & "+b.real+" +"+b.imaginary+"i"+" is : "+c.real+"+"+c.imaginary+"i");
    }
    public static void main(String[] args) {
        complex_no a = new complex_no(12,13);
        complex_no b = new complex_no(45,55);
        addition(a,b);
        subtraction(a,b);
    }
    
}
