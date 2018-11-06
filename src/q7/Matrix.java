/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7;

public class Matrix {
    int row;
    int col;
    int mat[][] = new int[10][10];
    
    Matrix(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                mat[i][j] = 0;
        }
    }
    
    Matrix(int r,int c){
        this();
        row = r; col = c;
    }
    
    void setElement(int r,int c,int value){
        if(value < 0){
            mat[r][c] = 0; return;}
        mat[r][c] = value;
    }
    
    void transpose(){
     int[][] temp = new int[10][10];
     for(int i=0;i<row;i++){
         for(int j=0;j<col;j++){
             temp[i][j] = mat[j][i];
         }
     }
     
     for(int i=0;i<row;i++){
         for(int j=0;j<col;j++)
             mat[i][j] = temp[i][j];
     }
    }
    
    void print(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                System.out.print(mat[i][j] + " ");
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matrix arr = new Matrix(5,5);
        arr.setElement(1,4,152);
        arr.setElement(1,1,-37);
        arr.setElement(2,5,14);
        arr.setElement(3,1,175);
        arr.setElement(4,5,915);
        
        arr.print();
        System.out.println("Transpose is :");
        arr.transpose();
        arr.print();
    }
}
