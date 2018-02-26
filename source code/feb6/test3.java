class Person{

  private String name;
  Person(String newName){name = newName;}
  public String getName(){return name;}
  public void setName(String val){name = val;}

}

class test3{
public static void swap (Person p1,Person p2){
  Person temp = p1;
  p1 = p2;
  p2 = temp;
}

public static void main(String arg[]){
  Person p1 = new Person("farid");
  Person p2 = new Person("Ana");
  System.out.println(p1.getName() + " : " + p2.getName());
  swap(p1,p2);
  System.out.println(p1.getName() + " : " + p2.getName());
}
}