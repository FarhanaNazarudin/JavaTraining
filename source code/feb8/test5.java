class test5{

public static void main(String qwe[]){

  int [] multiArr [];
  multiArr = new int [2][3];
  for (int i = 0; i<multiArr.length; i++) {

	for (int j = 0; j<multiArr[i].length;j++){

  	multiArr[i][j] = i + j ; 
	System.out.println(i+ " : " +j + " : " + multiArr[i][j]);

	}
  }

  System.out.println();

  int intArray[] = new int[2];
  System.out.println(intArray[-10]); //it will never work

}


}