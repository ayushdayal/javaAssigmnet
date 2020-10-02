/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;


public class rectangle {
 	private int length;
	private int breadth;

	rectangle(){
	  length = breadth = 0;	
	};
	rectangle(int r,int y){
		length = r; breadth = y;
	}
	void setValue(int x,int y){
		length = x; breadth = y;	
	}
	int[] getValue(){
		return new int[] {length,breadth}; 
	}

	void print(){
		int area = length * breadth;
		System.out.println(area);
	}
}


   

