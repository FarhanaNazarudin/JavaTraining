import java.io.*;

class exceptionTest2{

public static void main(String qwe[]){

//System.out.println(qwe[0]);
//System.out.println(qwe[1]);

try{
	FileInputStream f1 = new FileInputStream("input.txt");
	f1.read();
}

catch(FileNotFoundException fe){
	System.out.println("File is not there");
}

catch(IOException io){
	System.out.println(io);

}

}

}