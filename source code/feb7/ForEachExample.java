public class ForEachExample {

   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};

      System.out.println("\n");

      for(int x : numbers ) {
         System.out.print( x );
	 if(x==40){
	  System.out.println();
	  System.out.println("weeeee");
	  break;}
	  
         System.out.print(",");
      }
      System.out.println("\n");
      String [] names = {"James", "Larry", "Tom", "Lacy"};

      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
      System.out.println("\n");
   }
}