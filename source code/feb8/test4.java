class test4{

public static void main (String arg[]){

int intArray[];
intArray = new int[20];
for ( int i = 12; i < intArray.length; i++){
	
	intArray[i] = i + 5;
	System.out.println(i + " : " + intArray[i]);	
	}

}

}