public class ConstructorExample {
   int age;
   String name;
   //Default constructor
   ConstructorExample(){
this.name="ana";
this.age=17;
   }

//Parameterized constructor
ConstructorExample(String n,int a){
this.name=n;
this.age=a;
   }

public static void main(String args[]){
ConstructorExample obj1 = new ConstructorExample();
ConstructorExample obj2 =  new ConstructorExample("farhana", 20);
System.out.println(obj1.name+" "+obj1.age);
System.out.println(obj2.name+" "+obj2.age);
   }
}