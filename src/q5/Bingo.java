package q5;

import java.util.concurrent.ThreadLocalRandom;

public class Bingo {
    static int[] arr = new int[5];
    
        
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 41);
        arr[i] = randomNum;
      }
      
     if(args.length == 0){
         System.out.println("No numbers found");
         return;
     }
       
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      
      int flag1 = 0;
      int flag2 = 0;
      
      for(int numbers : arr){
          if(numbers == num1)
              flag1 = 1;
          if(numbers == num2)
              flag2 = 1;
      }
      
      if(flag1 == 1 && flag2 == 1){
          System.out.println("Bingo Both your numbers have been found");
      }
      else{
          System.out.println("Sorry you Lost");
      }
      for(int numbers : arr){
      	System.out.print(numbers + " ");
      }
    }
    
}
