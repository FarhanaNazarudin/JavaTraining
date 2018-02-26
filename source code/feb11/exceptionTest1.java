class exceptionTest1{

public static void main (String asd[]){

int x = 10;
int y = 0;
int z = 0;
try{
z = x/y;
System.out.println("Z : " + z);
}
catch(Exception ae){
System.out.println(ae.getMessage());
System.out.println("Aigooo, error aaaa!");
}


y = 2;
z = x/2;
System.out.println("new Z : " + z);
}

}