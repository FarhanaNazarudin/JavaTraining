import java.util.Scanner;

class IfElseLadder {
   public static void main(String[] args) {   
      int number;
      Scanner s1 = new Scanner(System.in);
	number = s1.nextInt();
      
      if (number > 0) {
         System.out.println("Number is positive.");
      }
      else if (number < 0) {
         System.out.println("Number is negative.");
      }
      else {
         System.out.println("Number is 0.");
      } 
   }
}