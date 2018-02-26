import java.util.Scanner;

class test1 {

	public static void main(String arg[]){

		int a,b;
		System.out.print("Enter a number between 0 - 10 : ");
		Scanner in = new Scanner (System.in);

		a = in.nextInt();

		System.out.println( "Value x is : " );
		
		for (int x = a ; x <= 10 ; ++x){

			System.out.println("   " + x );

		}
		System.out.println("Done");		
	}


}