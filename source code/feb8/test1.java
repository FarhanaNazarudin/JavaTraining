class Dog{

}

class test1{

public static void main (String args[]){

int x = 5;

int y = 15;

System.out.println (x == y);
x=y;
System.out.println( x == y);

Dog d = new Dog();
Dog d2 = new Dog();

System.out.println(d == d2);

String s1 = "Malaysia";

System.out.println(s1+" is a country");

System.out.println(s1);

}

}