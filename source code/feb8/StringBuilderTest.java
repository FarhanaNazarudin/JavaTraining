class StringBuilderTest{

public static void main(String qwe[]){

 StringBuilder sb1 = new StringBuilder();
 System.out.println("sb1 : "+ sb1.length());

 StringBuilder sb2 = new StringBuilder("FARID");
 sb2.append(" wooo.");
 System.out.println("sb2 : "+ sb2.length());
 System.out.println("sb2 : "+ sb2);


 System.out.println();

 sb1.append("Java");
 sb1.append(new Person("Oracle"));
 System.out.println("sb1 : "+ sb1);
}

}

class Person{
 String name;
 Person(String str){	
	name = str;
	}

}