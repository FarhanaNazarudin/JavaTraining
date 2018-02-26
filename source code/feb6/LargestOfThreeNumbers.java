

import java.util.Scanner;
 
class LargestOfThreeNumbers {
   public static void main(String args[]) {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
      if ( x > y && x > z )
         System.out.println( x + " number is the largest.");
      else if ( y > x && y > z )
         System.out.println( y + " number is largest.");
      else if ( z > x && z > y )
         System.out.println( z + " number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");

      if ( x < y && x < z )
         System.out.println( x + " number is the smallest.");
      else if ( y < x && y < z )
         System.out.println( y + " number is smallest.");
      else if ( z < x && z < y )
         System.out.println( z + " number is smallest.");
      else   
         System.out.println("Entered numbers are not distinct.");
 
   }
}